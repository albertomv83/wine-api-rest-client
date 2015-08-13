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

/**
 *
 */
public class Status {

    private Integer ReturnCode;

    private String[] Messages;

	public Integer getReturnCode() {
		return ReturnCode;
	}

	public void setReturnCode(Integer returnCode) {
		ReturnCode = returnCode;
	}

	public String[] getMessages() {
		return Messages;
	}

	public void setMessages(String[] messages) {
		Messages = messages;
	}
    
    
}
