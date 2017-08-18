package com.aynna.BackingBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "user")
public class UserBean {

    private String name = "Vighnesh";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
