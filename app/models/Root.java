package models;

import java.util.Date;

import siena.Column;
import siena.DateTime;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.NotNull;

public class Root extends siena.Model {
	@Id(Generator.AUTO_INCREMENT)
	public Long id;

	@NotNull
	@Index("account")
	public Account account;

	@Column("createdate")
	@NotNull
	@DateTime
	public Date createDate;

	@Column("modifieddate")
	@NotNull
	@DateTime
	public Date modifiedDate;

}
