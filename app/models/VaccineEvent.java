package models;

import siena.Index;
import siena.NotNull;
import siena.Table;

@Table("vaccineevent")
public class VaccineEvent extends Event {
	@Index("vaccine")
	@NotNull
	Vaccine vaccine;
}
