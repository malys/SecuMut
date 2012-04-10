package models;

import java.util.Date;
import java.util.List;
import models.*;

public class ActEvent extends Event {

	public Number price;
	public Date repaymentDateInsurance;
	public Date repaymentDateSecu;
	public Number repaymentInsurance;
	public Boolean repaymentInsuranceEnable;
	public Number repaymentSecu;
	public Boolean repaymentSecuEnable;
	public Category category;
	public Doctor doctor;
	public List<Disease> diseases;
	public String goal;

}
