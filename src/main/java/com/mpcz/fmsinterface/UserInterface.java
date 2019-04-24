package com.mpcz.fmsinterface;

import java.sql.Timestamp;

public interface UserInterface extends BeanInterface {

    public long getId();
    public void setId(long id);

    public String getUserName();
    public void setUserName(String userName);

    public String getPassword();
    public void setPassword(String password);

    public String getRole();
    public void setRole(String role);

    public String getStatus();
    public void setStatus(String status);

    public Timestamp getCreatedOn();
    public void setCreatedOn(Timestamp createdOn);

    public Timestamp getUpdatedOn();
    public void setUpdatedOn(Timestamp updatedOn);
}
