package models;

import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.NotNull;
import models.enumeration.Gender;

public class Person extends Root {

	@Index("place")
	public Place place;

	@Column("firstname")
	@NotNull
	public String firstName;
	@Column("lastname")
	@NotNull
	public String lastName;
	@Column("gender")
	@NotNull
	public Gender gender;
	@Column("isconventionned")
	@NotNull
	public Boolean isConventionned;

	@Index("specialty")
	public Specialty specialty;
}
