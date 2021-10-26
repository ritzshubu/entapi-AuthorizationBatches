package com.fis.services.entapi.authorization.batches.restapi.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.services.entapi.authorization.batches.businesslogic.BusinessLogicService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class BusinessLogicController {

	
	private final BusinessLogicService businessLogicService;

	@GetMapping(value = "/version", produces = "application/json")
	public String getVer() {
		return businessLogicService.getVersionInfo();
		// return "Yes this is working"
	}

}
