package com.sky.hds.springbootangular.entity;

public class Menu {
    private String menuName;
    private String menuUrl;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Menu(String menuName, String menuUrl) {
        this.menuName = menuName;
        this.menuUrl = menuUrl;
    }
}
