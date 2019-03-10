package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDto;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;


import exceptions.DepositException;
import exceptions.FlatAreaException;
import exceptions.NotContainException;
import exceptions.TypeException;

public class Client {
static FlatRegistrationDto frd=new FlatRegistrationDto();
static FlatRegistrationDto frd1=new FlatRegistrationDto();
static ArrayList<Integer> al1=new ArrayList<Integer>();
static IFlatRegistrationService ifrs=new FlatRegistrationServiceImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter 1 for flat registration");
System.out.println("enter ur choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:  al1=ifrs.getAllOwnerIds();
	System.out.println("available owner ids are"+al1);


     System.out.println("enter owner id from above arraylist");
      int id=sc.nextInt();
      if(al1.contains(id))
      {
      //System.out.println("enter registrtion number");
		//int reg_no=sc.nextInt();
		System.out.println("enter flat type[1Bhk 2BHk]");
		int type=sc.nextInt();
		if(type==1||type==2)
		{
		System.out.println("enter flat area");
		int flat_area=sc.nextInt();
		if(flat_area>0)
		{
		System.out.println("enter rent amount");
		int rent_amt=sc.nextInt();
		System.out.println("enter deposit amount");
		int deposit_amt=sc.nextInt();
		if(deposit_amt>rent_amt)
		{
		//frd.setFlat_reg_no(reg_no);
			frd.setOwner_id(id);
		frd.setFlat_area(flat_area);
		frd.setFlat_type(type);
		frd.setRent_amount(rent_amt);
		frd.setDeposit_amount(deposit_amt);
		
		
    frd1 =ifrs. registerFlat(frd);
      
    	if(frd1!=null)
    			System.out.println("registered successfully");
    	 else System.out.println("not registerd");
		}
		
		else 
		{
			try {
				throw new  DepositException();
			} catch (DepositException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
		else
			{
			try {
				throw new FlatAreaException();
			} catch (FlatAreaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		else
		{
			try {
				throw new TypeException();
			} catch (TypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
      }
      else {
    	  try {
			throw new NotContainException();
		} catch (NotContainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
		
      
  
      
case 2:System.exit(0);
break;
}
	}

}
