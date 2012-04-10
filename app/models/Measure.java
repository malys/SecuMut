package models;

import java.util.Date;

import siena.Column;
import siena.DateTime;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.Max;
import siena.NotNull;
import siena.Table;

@Table("measure")
public class Measure extends Root {

	@Column("note")
	public String note;

	@Column("date")
	@NotNull
	@DateTime
	public Date date;

	@Column("value")
	@NotNull
	public Number value;

}
