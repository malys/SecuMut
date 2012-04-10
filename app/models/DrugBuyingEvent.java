package models;

import java.util.Date;

import siena.Column;
import siena.DateTime;
import siena.Index;
import siena.NotNull;
import siena.Table;

@Table("drugbuyingevent")
public class DrugBuyingEvent extends Event {
	@Column("price")
	public Number price;
	@Column("repaymentdateinsurance")
	@DateTime
	public Date repaymentDateInsurance;
	@Column("repaymentdatesecu")
	@DateTime
	public Date repaymentDateSecu;
	@Column("repaymentinsurance")
	public Number repaymentInsurance;
	@Column("repaymentinsuranceenable")
	public Boolean repaymentInsuranceEnable;
	@Column("repaymentsecu")
	public Number repaymentSecu;
	@Column("repaymentsecuenable")
	public Boolean repaymentSecuEnable;
	@Index("actEvent")
	public ActEvent actEvent;
	@Index("drug")
	public Drug drug;
	@Index("pharmacy")
	public Pharmacy pharmacy;

}
