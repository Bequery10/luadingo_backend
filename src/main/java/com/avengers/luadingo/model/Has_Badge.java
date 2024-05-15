package com.avengers.luadingo.model;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.*;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Has_Badge {
    @EmbeddedId
    private Has_BadgePK id;

    public Has_Badge() {
    
    }

    public Has_BadgePK getId() {
        return id;
    }

    public void setId(Has_BadgePK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Has_Badge that = (Has_Badge) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}


