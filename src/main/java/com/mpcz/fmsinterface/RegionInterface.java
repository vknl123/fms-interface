package com.mpcz.fmsinterface;

public interface RegionInterface extends BeanInterface {

    public long getId();
    public void setId(long id);

    public String getName();
    public void setName(String name);

    public String getDiscoId();
    public void setDiscoId(String discoId);
}
