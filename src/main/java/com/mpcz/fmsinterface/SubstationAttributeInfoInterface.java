package com.mpcz.fmsinterface;

import java.util.Date;

public interface SubstationAttributeInfoInterface extends BeanInterface {

    public long getId();
    public void setId(long id);

    public long getSubstationId();
    public void setSubstationId(long SubstationId);

    public String getAttributeName();
    public void setAttributeName(String attributeName);

    public String getAttributeValue();
    public void setAttributeValue(String attributeValue);

    public String getStatus();
    public void setStatus(String status);

    public String getStartMonth();
    public void setStartMonth(String startMonth);

    public  String getEndMonth();
    public void setEndMonth(String endMonth);

    public String getCreatedBy();
    public void setCreatedBy(String createdBy);

    public Date getCreatedOn();
    public void setCreatedOn(Date createdOn);

    public String getUpdatedBy();
    public void setUpdatedBy(String updatedBy);

    public Date getUpdatedOn();
    public void setUpdatedOn(Date updatedOn);
}
