package com.letscatchup.sponsor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.sponsor.domain.entity.SponsorCrudRepository;
import com.letscatchup.sponsor.domain.entity.SponsorEntity;

@Service
public class SponsorService {

	@Autowired
	private SponsorCrudRepository sponsorCrudRepository;
	
	
	public SponsorEntity addSponsor(SponsorEntity sponsorEntity) {
		
		return sponsorCrudRepository.save(sponsorEntity);
		
	}
	
	public SponsorEntity updateSponsor(SponsorEntity sponsorEntity) {
		
		return sponsorCrudRepository.save(sponsorEntity);
		
	}
	
	public void deleteSponsor(Long sponsorId) {
		
		sponsorCrudRepository.delete(sponsorId);
		
	}

	public SponsorEntity loadSponsor(Long sponsorId) {
		
		return sponsorCrudRepository.findOne(sponsorId);
		
	}
}
