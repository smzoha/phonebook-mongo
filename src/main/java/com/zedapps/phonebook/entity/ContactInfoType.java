package com.zedapps.phonebook.entity;

/**
 * @author Shamah M Zoha
 * @since 07-Feb-22
 **/
public enum ContactInfoType {

    HOME_ADDRESS("Home Address"),
    WORK_ADDRESS("Work Address"),
    HOME_PHONE("Home Phone"),
    WORK_PHONE("Work Phone"),
    PAGER("Pager"),
    MOBILE("Mobile"),
    EMAIL("Email"),
    OTHER("Other");

    final String naturalName;

    ContactInfoType(String naturalName) {
        this.naturalName = naturalName;
    }

    public String getNaturalName() {
        return naturalName;
    }
}
