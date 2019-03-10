package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDto;

public interface IFlatRegistrationDao {
	FlatRegistrationDto registerFlat(FlatRegistrationDto flat);
	ArrayList <Integer> getAllOwnerIds();
}
