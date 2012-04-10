package models;

import siena.Column;
import siena.Index;
import siena.Table;

@Table("drugevent")
public class DrugEvent extends Event {
	@Index("category")
	public Category category;
	@Index("disease")
	public Disease disease;
	@Index("drug")
	public Drug drug;
	@Column("quantity")
	public Number quantity;
}
