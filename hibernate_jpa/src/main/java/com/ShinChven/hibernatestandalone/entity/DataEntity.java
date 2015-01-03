package com.ShinChven.hibernatestandalone.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ShinChven on 2015/1/3.
 * simple enitty
 */
@Entity
@Table(name = "data")
public class DataEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
