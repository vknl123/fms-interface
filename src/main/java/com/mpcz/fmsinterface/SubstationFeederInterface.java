package com.mpcz.fmsinterface;

public interface SubstationFeederInterface extends BeanInterface {

	public long getSubstationFeederId();

	public void setSubstationFeederId(long substationFeederId);
	public long getSubstationId();
	public void setSubstationId(long substationId);

	public String getSubstationFeederName();

	public void setSubstationFeederName(String substationFeederName);
}
