/**
 * $Id$
 * @author amancheno
 * @date   13/8/2015 11:33:11
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package es.instavino.wine.api.client;
/**
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import es.instavino.wine.api.model.Response;

public class CatalogRestClient {

	private static final String URL_WINE_SERVICES = "http://services.wine.com/api/beta2/service.svc/json/catalog?";

	public void getCountry(String countryId, String accessKey, String pathToFile)
			throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		String urlInitial = new String(
				"http://services.wine.com/api/beta2/service.svc/json/catalog?filter=categories("+countryId+")&size=100&apikey="
						+ accessKey);
		File f = new File(pathToFile);
		f.createNewFile();
		StringBuffer response = new StringBuffer();
		
		//initial lookup
		Response r = populateResponse(objectMapper, urlInitial, response, 0);
		int total = r.getProducts().getTotal();
		int offset = 100;
		//iterate
		while(offset<=total){
			response.append("\r\n");
			populateResponse(objectMapper, urlInitial, response, offset);
			offset = offset+100;
		}
		PrintWriter pw = new PrintWriter(f);
		pw.print(response.toString());
		pw.close();		

	}

	private Response populateResponse(ObjectMapper objectMapper, String urlInitial, StringBuffer response, int offset)
			throws MalformedURLException, IOException, JsonParseException, JsonMappingException {
		URL url = new URL(urlInitial+"&offset="+offset);
		URLConnection connection = url.openConnection();

		InputStream is = connection.getInputStream();
		BufferedReader rd = new BufferedReader(new InputStreamReader(is));

		String line;
		while ((line = rd.readLine()) != null) {
			response.append(line);
		}
		rd.close();
		Response r = objectMapper.readValue(response.toString(), Response.class);
		return r;
	}

	public static void main(String... args) throws Exception {
		CatalogRestClient crc = new CatalogRestClient();
		crc.getCountry("10039", "fcc576adf5eb1d3a2d6e88b76d8e66a3",
				"C:\\Users\\albertomv\\Dropbox\\Master\\Proyecto\\francia-rhone.txt");
		
	}
}
