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

import com.sun.jersey.api.client.Client;

/**
 *
 */
public class CatalogRestClient {
	
	private final Client c;
	
	CatalogRestClient(){
		c= Client.create();
	}

}
