package models;

import java.util.Date;

import siena.Column;
import siena.DateTime;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.NotNull;

public class Entity extends Root {

	@Column("name")
	@Index("name")
	public String name;
	@Column("description")
	public String description;

}
