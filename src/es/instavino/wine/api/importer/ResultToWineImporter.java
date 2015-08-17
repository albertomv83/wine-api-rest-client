/**
 * $Id$
 * @author amancheno
 * @date   17/8/2015 12:48:32
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package es.instavino.wine.api.importer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.map.ObjectMapper;

import es.instavino.wine.api.model.Product;
import es.instavino.wine.api.model.Response;

/**
 *
 */
public class ResultToWineImporter {

    public void importWinesIntoSingleFile(final String[] files,
            final String pathToFiles, final String resultFile)
                    throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Pattern year = Pattern.compile("\\d\\d\\d\\d");
        File result = new File(pathToFiles + resultFile);
        result.createNewFile();
        FileWriter fw = new FileWriter(result);
        for (String file : files) {
            LineNumberReader lnr =
                    new LineNumberReader(new FileReader(new File(pathToFiles
                    + file)));
            String line = lnr.readLine();
            while (line != null) {
                Response r = objectMapper.readValue(line, Response.class);
                for (Product wine : r.getProducts().getList()) {
                    if (wine.getName() != null
                        && wine.getName().length() > 4) {
                        String wineName = wine.getName();
                        String winePossibleYear =
                            wineName.substring(wineName.length() - 4,
                                wineName.length());
                        Matcher m = year.matcher(winePossibleYear);
                        if (m.matches()) {
                            wine.setName(wineName.substring(0,
                                wineName.length() - 5));
                            wine.setYear(winePossibleYear);
                        }
                    }
                    fw.write(objectMapper.writeValueAsString(wine)
                        + "\r\n");
                }
                line = lnr.readLine();
            }
            System.out.println("Done file: " + file);
        }
        fw.close();
    }

    public static void main(final String... args) throws Exception {

        ResultToWineImporter rtwi = new ResultToWineImporter();
        String[] files =
            {"argentina.txt", "california.txt", "chile.txt",
                    "francia-bordeaux.txt", "francia-otros.txt",
                    "francia-rhone.txt", "italia.txt", "spain.txt" };
        rtwi.importWinesIntoSingleFile(files,
            "C:\\Users\\amancheno\\Dropbox\\Master\\Proyecto\\",
            "allWines.json");
    }

}
