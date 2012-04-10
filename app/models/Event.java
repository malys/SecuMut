package models;

import java.util.Date;

import siena.Column;
import siena.DateTime;
import siena.Generator;
import siena.Id;
import siena.NotNull;
import siena.Table;

@Table("event")
public class Event extends Root {

	@Column("comment")
	public String comment;
	@Column("date")
	@NotNull
	@DateTime
	public Date date;
}
