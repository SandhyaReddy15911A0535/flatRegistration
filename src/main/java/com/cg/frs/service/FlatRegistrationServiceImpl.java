package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDaoImpl;
import com.cg.frs.dao.IFlatRegistrationDao;
import com.cg.frs.dto.FlatRegistrationDto;

public class FlatRegistrationServiceImpl  implements IFlatRegistrationService{
	IFlatRegistrationDao ifr= new FlatRegistrationDaoImpl();
	public FlatRegistrationDto registerFlat(FlatRegistrationDto flat) {
		// TODO Auto-generated method stub
		return ifr.registerFlat(flat);
	}

	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		return ifr.getAllOwnerIds();
	}

}
