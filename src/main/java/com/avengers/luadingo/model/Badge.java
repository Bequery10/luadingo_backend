package com.avengers.luadingo.model;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.*;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Badge {
    @Id
    private int badge_id;
    private String badge_name;
    private String badge_desc;
    private String badge_image_url;

    public Badge() {
       
    }

    public String getBadge_name() {
        return badge_name;
    }

    public void setBadge_name(String badge_name) {
        this.badge_name = badge_name;
    }

    public String getBadge_desc() {
        return badge_desc;
    }

    public void setBadge_desc(String badge_desc) {
        this.badge_desc = badge_desc;
    }

    public String getBadge_image_url() {
        return badge_image_url;
    }

    public void setBadge_image_url(String badge_image_url) {
        this.badge_image_url = badge_image_url;
    }

    public int getBadge_id() {
        return badge_id;
    }

    public void setBadge_id(int badge_id) {
        this.badge_id = badge_id;
    }

}
