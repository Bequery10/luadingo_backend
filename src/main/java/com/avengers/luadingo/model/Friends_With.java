package com.avengers.luadingo.model;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Friends_With {

    public enum Status {
        Pending,
        Accepted
    }

    @EmbeddedId
    private Friends_WithPK id;
    private Status status;

    public Friends_With() {

    }

    public Friends_WithPK getId() {
        return id;
    }

    public void setId(Friends_WithPK id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Friends_With that = (Friends_With) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}