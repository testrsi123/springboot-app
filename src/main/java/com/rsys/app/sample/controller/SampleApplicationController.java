/***************************************************************************
 * Copyright (C) Accenture
 *
 * The reproduction, transmission or use of this document or its contents is not permitted without
 * prior express written consent of Accenture. Offenders will be liable for damages. All rights,
 * including but not limited to rights created by patent grant or registration of a utility model or
 * design, are reserved.
 *
 * Accenture reserves the right to modify technical specifications and features.
 *
 * Technical specifications and features are binding only insofar as they are specifically and
 * expressly agreed upon in a written contract.
 *
 **************************************************************************/

package com.rsys.app.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The rest controller 
 * 
 */

@RestController
@RequestMapping(value = "/", produces = { MediaType.APPLICATION_STREAM_JSON_VALUE})
public class SampleApplicationController {

	/**	
	 * @param httpRequest
	 * @return 
	 */
	@GetMapping(value = "message")
	public ResponseEntity<String> getMessage(HttpServletRequest httpRequest) {	
		return ResponseEntity.ok("Hi Welcome to spring boot app demo");
	}

}
