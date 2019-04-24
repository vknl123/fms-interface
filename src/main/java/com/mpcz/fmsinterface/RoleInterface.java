package com.mpcz.fmsinterface;

public interface RoleInterface extends BeanInterface{

    public long getId();
    public void setId(long id);

    public String getRole();
    public void setRole(String role);

    public String getPriortiy();
    public void setPriortiy(String priortiy);
}
