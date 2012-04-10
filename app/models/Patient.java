package models;

import java.util.Date;
import java.util.List;
import models.*;

public class Patient extends Person {

	public Date birthDay;
	public String birthPlace;
	public String secuCenter;
	public String secuNumber;
	public List<DrugBuyingEvent> drugBuyingEvents;
	public List<DrugEvent> drugEvents;
	public List<Event> events;
	public List<Disease> diseases;
	public List<VaccineEvent> vaccineEvents;
	public List<WeightMeasure> weights;
	public List<HeightMeasure> heights;

}
