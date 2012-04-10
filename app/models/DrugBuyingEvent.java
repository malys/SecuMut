package models;

import java.util.Date;

public class DrugBuyingEvent extends Event {

	public Number price;
	public Date repaymentDateInsurance;
	public Date repaymentDateSecu;
	public Number repaymentInsurance;
	public Boolean repaymentInsuranceEnable;
	public Number repaymentSecu;
	public Boolean repaymentSecuEnable;
	public ActEvent actEvent;
	public Drug drug;
	public Pharmacy pharmacy;

}
