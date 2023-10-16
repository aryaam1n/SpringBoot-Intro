package com.springprojects.springboot.topics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

//the entity annotation knows to create a table called topic that has id, name, and description columns
//need to tell jpa that we want to make id the primary key column (we use the id annotation)
@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String description;

    //NO ARG CONSTRUCTOR
    public Topic(){

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
