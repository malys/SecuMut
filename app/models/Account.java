package models;

import java.util.List;

import javax.persistence.OneToMany;

import siena.Column;
import siena.Index;
import siena.Table;

import models.enumeration.AccountCategory;

@Table("account")
public class Account extends Root {
	@Column("name")
	public String name;

	@Index("category")
	public AccountCategory category;
	@OneToMany
	List<User> users;
}
