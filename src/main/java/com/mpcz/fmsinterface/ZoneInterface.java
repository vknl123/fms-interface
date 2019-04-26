package com.mpcz.fmsinterface;



public interface ZoneInterface extends BeanInterface {

    public long getId();

    public void setId(long id);

    public String getCode();

    public void setCode(String code);

    public String getName();

    public void setName(String name);

    public DivisionInterface getDivision();

	public void setDivision(DivisionInterface division) ;

    public String getShortCode();

    public void setShortCode(String shortCode);

    public String getAddress();

    public void setAddress(String address);

    public String getPhoneNo();

    public void setPhoneNo(String phoneNo);
}
