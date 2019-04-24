package com.mpcz.fmsinterface;

import java.sql.Timestamp;

public interface FeederInterface extends BeanInterface {

    public long getId();

    public void setId(long fdrId);

    public long getSubstationId();

    public void setSubstationId(long substationId);

    public String getFeederName();

    public void setFeederName(String feederName);

    public String getFeederType();

    public void setFeederType(String feederType);

    public String getStatus();

    public void setStatus(String status);

    public String getCreatedBy();

    public void setCreatedBy(String createdBy);

    public Timestamp getCreatedOn();

    public void setCreatedOn(Timestamp createdOn);

    public String getUpdatedBy();

    public void setUpdatedBy(String updatedBy);

    public Timestamp getUpdatedOn();

    public void setUpdatedOn(Timestamp updatedOn);

}
