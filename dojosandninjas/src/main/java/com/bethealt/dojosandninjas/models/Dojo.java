package com.bethealt.dojosandninjas.models;

import java.util.*;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dojos")

public class Dojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 5, max = 200, message ="Dojo Name must be at least 5 characters.")
    private String name;

    @Column(updatable=false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @OneToMany(mappedBy="dojo", fetch=FetchType.LAZY)
    private List<Ninja> ninjas;

    // CONSTRUCTORS
    public Dojo() {
    }

    public Dojo(String name, List<Ninja> ninjas) {
        this.name = name;
        ninjas = new ArrayList<Ninja> ();
    }

    //GETTERS & SETTERS
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public List<Ninja> getNinjas() {
        return this.ninjas;
    }

    public void setNinjas(Ninja ninja) {
         this.ninjas.add(ninja);
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

}
