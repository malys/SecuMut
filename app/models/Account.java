package models;

import java.util.List;

import models.enumeration.AccountCategory;

public class Account {
	public String name;
	public AccountCategory category;

	List<User> users;
}
