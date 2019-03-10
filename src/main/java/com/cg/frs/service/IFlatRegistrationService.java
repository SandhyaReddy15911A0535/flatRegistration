package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDto;

public interface IFlatRegistrationService {

	FlatRegistrationDto registerFlat(FlatRegistrationDto flat);
	ArrayList <Integer> getAllOwnerIds();
}
