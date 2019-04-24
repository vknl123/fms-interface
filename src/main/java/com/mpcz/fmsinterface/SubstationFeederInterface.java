package com.mpcz.fmsinterface;

public interface SubstationFeederInterface extends BeanInterface {

    public long getSubstationId();

    public void setSubstationId(long substationId);

    public long getSubstationFdrName();

    public void setSubstationFdrName(long substationFdrName);

    public String getFeederName();

    public void setFeederName(String feederName);
}
