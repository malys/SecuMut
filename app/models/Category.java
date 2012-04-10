package models;

import models.enumeration.CategoryType;
import models.interfaces.IShared;

public class Category implements IShared {
	public String name;
	public Account account;
	public CategoryType type;
}
