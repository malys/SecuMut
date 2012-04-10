package models;

import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Index;
import siena.Table;
import models.enumeration.CategoryType;
import models.interfaces.IShared;

@Table("category")
public class Category extends Root implements IShared {

	@Column("name")
	public String name;
	@Index("type")
	public CategoryType type;
}
