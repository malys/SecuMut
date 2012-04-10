package models;

import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.NotNull;
import siena.Table;
import models.interfaces.IShared;

@Table("specialty")
public class Specialty extends Root implements IShared {

	@Column("name")
	@Index("name")
	@NotNull
	public String name;

}
