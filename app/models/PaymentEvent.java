package models;

import java.util.Date;

public class PaymentEvent extends Event {
	public Number price;
	public Date repaymentDateInsurance;
	public Date repaymentDateSecu;
	public Number repaymentInsurance;
	public Boolean repaymentInsuranceEnable;
	public Number repaymentSecu;
	public Boolean repaymentSecuEnable;
}
