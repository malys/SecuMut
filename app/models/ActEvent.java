package models;

import java.util.Date;
import java.util.List;

import siena.Column;
import siena.DateTime;
import siena.Index;
import siena.NotNull;
import siena.Table;
import models.*;

@Table("actevent")
public class ActEvent extends Event {

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
	@Index("category")
	public Category category;
	@Index("doctor")
	public Doctor doctor;
	public List<Disease> diseases;
	@Column("goal")
	public String goal;

}
