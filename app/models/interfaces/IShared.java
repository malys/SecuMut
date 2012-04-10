package models.interfaces;

import siena.Column;
import models.Account;

public interface IShared {
	@Column("notshared")
	public Boolean notShared = false;
	public Account account = null;;
}
