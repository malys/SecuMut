package models;

import play.data.validation.Email;
import play.data.validation.Phone;
import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.NotNull;
import siena.Table;
import models.interfaces.IShared;

@Table("place")
public class Place extends Root implements IShared {

	@Column("name")
	@Index("name")
	@NotNull
	public String name;
	@Column("latitude")
	public Number latitude;
	@Column("longitude")
	public Number longitude;
	@Column("address")
	public String address;
	@Column("city")
	public String city;
	@Column("postcode")
	public String postcode;
	@Column("email")
	@Email
	public String email;
	@Column("faxNumber")
	@Phone
	public String faxNumber;
	@Column("phoneNumber")
	@Phone
	public String phoneNumber;
	@Column("note")
	public String note;

}
