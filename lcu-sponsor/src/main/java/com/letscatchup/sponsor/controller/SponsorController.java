package com.letscatchup.sponsor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.sponsor.domain.entity.SponsorEntity;
import com.letscatchup.sponsor.service.SponsorService;

@RestController
@RequestMapping("/sponsor")
public class SponsorController {
	
	@Autowired
	private SponsorService sponsorService;
	
	@RequestMapping(value = "/", method= RequestMethod.POST)
	public void addSponsor(@RequestBody SponsorEntity sponsorEntity) {
		sponsorService.addSponsor(sponsorEntity);
		
	}
	
	@RequestMapping(value = "/", method= RequestMethod.PUT)
	public void updateSponsor(@RequestBody SponsorEntity sponsorEntity) {
		sponsorService.updateSponsor(sponsorEntity);
		
	}
	
	@RequestMapping(value = "/{sponsorId}", method= RequestMethod.DELETE)
	public void deleteSponsor(@PathVariable(name="sponsorId") Long sponsorId) {
		sponsorService.deleteSponsor(sponsorId);
		
	}
	
	@RequestMapping(value = "/{sponsorId}", method= RequestMethod.GET)
	public SponsorEntity getSponsor(@PathVariable(name="sponsorId") Long sponsorId) {
		return sponsorService.loadSponsor(sponsorId);
		
	}

}
