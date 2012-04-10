package models;

import java.util.Date;

import siena.Column;
import siena.DateTime;
import siena.NotNull;
import siena.Table;

@Table("paymentevent")
public class PaymentEvent extends Event {
	@Column("price")
	@NotNull
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
}
