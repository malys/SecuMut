package models;

import models.interfaces.IShared;

public class Place implements IShared {

	public String name;
	public Number latitude;
	public Number longitude;
	public String address;
	public String city;
	public String postcode;
	public String email;
	public String faxNumber;
	public String phoneNumber;
	public String note;
	public Account account;
}
