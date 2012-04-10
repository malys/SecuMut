package models;

import play.data.validation.Email;
import play.data.validation.Password;
import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.NotNull;
import siena.Table;
import models.enumeration.Grants;
import models.enumeration.OpenID;

@Table("user")
public class User extends siena.Model {

	@Id(Generator.AUTO_INCREMENT)
	public Long id;

	@Column("name")
	@NotNull
	public String name;

	@Column("email")
	@Email
	public String email;

	@Column("password")
	@Password
	public String password;

	@Index("grant")
	@NotNull
	public Grants grant;

	@Index("openid")
	public OpenID openId;
}
