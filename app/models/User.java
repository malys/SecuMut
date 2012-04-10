package models;

import models.enumeration.Grants;
import models.enumeration.OpenID;

public class User {
	public String name;
	public String email;
	public String password;

	public Grants grant;

	public OpenID openId;
}
