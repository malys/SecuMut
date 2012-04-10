package models;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

import siena.Column;
import siena.DateTime;
import siena.NotNull;
import siena.Table;
import models.*;

@Table("patient")
public class Patient extends Person {

	@Column("birthday")
	@NotNull
	@DateTime
	public Date birthDay;
	@Column("birthplace")
	public String birthPlace;
	@Column("secucenter")
	public String secuCenter;
	@Column("secunumber")
	public String secuNumber;

	@OneToMany
	public List<DrugBuyingEvent> drugBuyingEvents;
	@OneToMany
	public List<DrugEvent> drugEvents;
	@OneToMany
	public List<Event> events;
	@OneToMany
	public List<Disease> diseases;
	@OneToMany
	public List<VaccineEvent> vaccineEvents;
	@OneToMany
	public List<WeightMeasure> weights;
	@OneToMany
	public List<HeightMeasure> heights;

}
