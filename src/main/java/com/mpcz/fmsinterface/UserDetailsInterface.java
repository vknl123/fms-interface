package com.mpcz.fmsinterface;

import java.sql.Timestamp;
import java.util.Date;

public interface UserDetailsInterface extends BeanInterface {

    public long getId();
    public void setId(long id);

    public String getUserName();
    public void setUserName(String userName);

    public String getRole();
    public void setRole(String role);

    public String getName();
    public void setName(String name);

    public String getDesignation();
    public void setDesignation(String designation);

    public String getLocationCode();
    public void setLocationCode(String locationCode);

    public String getStatus();
    public void setStatus(String status);

    public String getMobileNo();
    public void setMobileNo(String mobileNo);

    public Date getCreatedOn();
    public void setCreatedOn(Date createdOn);

    public Date getUpdatedOn();
    public void setUpdatedOn(Date updatedOn);
}
