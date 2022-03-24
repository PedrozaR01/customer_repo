package com.assigment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Processor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer processorId;
    private String email;
    private String firstName;
    private String lastName;
    private String processorIntro;
    private String supportedTopics;
    private String processorGradeLevel;

    public Processor() {
    }

    public Processor(Integer processorId, String email, String firstName, String lastName, String processorIntro, String supportedTopics, String processorGradeLevel) {
        this.processorId = processorId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.processorIntro = processorIntro;
        this.supportedTopics = supportedTopics;
        this.processorGradeLevel = processorGradeLevel;
    }
    
    

    public Integer getProcessorId() {
        return processorId;
    }

    public void setProcessorId(Integer processorId) {
        this.processorId = processorId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProcessorIntro() {
        return processorIntro;
    }

    public void setProcessorIntro(String processorIntro) {
        this.processorIntro = processorIntro;
    }

    public String getSupportedTopics() {
        return supportedTopics;
    }

    public void setSupportedTopics(String supportedTopics) {
        this.supportedTopics = supportedTopics;
    }

    public String getProcessorGradeLevel() {
        return processorGradeLevel;
    }

    public void setProcessorGradeLevel(String processorGradeLevel) {
        this.processorGradeLevel = processorGradeLevel;
    }
    
    
}
