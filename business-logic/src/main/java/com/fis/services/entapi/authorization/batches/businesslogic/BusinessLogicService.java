package com.fis.services.entapi.authorization.batches.businesslogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class BusinessLogicService {

	@Autowired
	private BuildProperties buildProperties;
	
	public String getVersionInfo() {
		return buildProperties.getVersion();
		//return "Service class..";
		}
}
