/**
 * $Id$
 * @author amancheno
 * @date   13/8/2015 11:29:46
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package es.instavino.wine.api.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 */
public class Status {

	@JsonProperty(value="ReturnCode")
    private Integer returnCode;

	@JsonProperty(value="Messages")
    private List<String> messages;

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	
    
    
}
