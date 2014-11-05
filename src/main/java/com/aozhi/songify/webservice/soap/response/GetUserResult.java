/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.aozhi.songify.webservice.soap.response;

import javax.xml.bind.annotation.XmlType;

import com.aozhi.songify.webservice.soap.WsConstants;
import com.aozhi.songify.webservice.soap.response.base.WSResult;
import com.aozhi.songify.webservice.soap.response.dto.UserDTO;

@XmlType(name = "GetUserResult", namespace = WsConstants.NS)
public class GetUserResult extends WSResult {
	private UserDTO user;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
}
