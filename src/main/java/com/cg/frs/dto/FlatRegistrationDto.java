package com.cg.frs.dto;

public class FlatRegistrationDto {
private int ower_id,mobile,flat_reg_no,flat_type,flat_area,rent_amount,deposit_amount;
public int getOwner_id() {
	return ower_id;
}
public void setOwner_id(int owner_id) {
	this.ower_id = owner_id;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public int getFlat_reg_no() {
	return flat_reg_no;
}
public void setFlat_reg_no(int flat_reg_no) {
	this.flat_reg_no = flat_reg_no;
}
public int getFlat_type() {
	return flat_type;
}
public void setFlat_type(int flat_type) {
	this.flat_type = flat_type;
}
public int getFlat_area() {
	return flat_area;
}
public void setFlat_area(int flat_area) {
	this.flat_area = flat_area;
}
public int getRent_amount() {
	return rent_amount;
}
public void setRent_amount(int rent_amount) {
	this.rent_amount = rent_amount;
}
public int getDeposit_amount() {
	return deposit_amount;
}
public void setDeposit_amount(int deposit_amount) {
	this.deposit_amount = deposit_amount;
}
public String getOwner_name() {
	return owner_name;
}
public void setOwner_name(String owner_name) {
	this.owner_name = owner_name;
}
private String owner_name;
}
