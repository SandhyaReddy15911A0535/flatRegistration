package com.cg.frs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDto;

public class FlatRegistrationDaoImpl  implements IFlatRegistrationDao{
	Scanner sc=new Scanner(System.in);
	//FlatRegistrationDto flatRegistrationDto =new FlatRegistrationDto();
	public FlatRegistrationDto registerFlat(FlatRegistrationDto flat) {
		
			//flat.getDeposit_amount();
			//flat.getFlat_area();
			//flat.getFlat_reg_no();
			
			//flat.getRent_amount();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FRegistration", "root", "root");
				PreparedStatement ps=con.prepareStatement("insert into FRegistration values(?,?,?,?,?)");
			//	ps.setInt(1,flat.getFlat_reg_no());
				ps.setInt(1, flat.getOwner_id());
				ps.setInt(2, flat.getFlat_type());
				ps.setInt(3, flat.getFlat_area());
				ps.setInt(4, flat.getRent_amount());
				ps.setInt(5, flat.getDeposit_amount());
				int i=ps.executeUpdate();
				//if(i==1)
				//	System.out.println("registered successfully");
				
				//else System.out.println("try again");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flat;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flatRegistration", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from flat_owners");
			while(rs.next())
			{
				al.add(rs.getInt(1));
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;
	}

}
