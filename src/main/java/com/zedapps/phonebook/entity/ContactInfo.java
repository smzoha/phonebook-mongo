package com.zedapps.phonebook.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Shamah M Zoha
 * @since 07-Feb-22
 **/
public class ContactInfo {

    @Id
    private String id;

    private ContactInfoType type;

    @Field(value = "other_type")
    private String otherType;

    private String content;

    private boolean inactive;

    public ContactInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContactInfoType getType() {
        return type;
    }

    public void setType(ContactInfoType type) {
        this.type = type;
    }

    public String getOtherType() {
        return otherType;
    }

    public void setOtherType(String otherType) {
        this.otherType = otherType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactInfo that = (ContactInfo) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ContactInfo.class.getSimpleName() + "[", "]")
                .add("type=" + type)
                .add("otherType='" + otherType + "'")
                .add("content='" + content + "'")
                .toString();
    }
}
