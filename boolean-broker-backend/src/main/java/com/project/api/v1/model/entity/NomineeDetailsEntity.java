package com.project.api.v1.model.entity;

import java.time.LocalDate;

public class NomineeDetailsEntity {

    //PK - userID + phone
    private String userId;           // FK → USER.user_id
    private String name;
    private String relationship;
    private LocalDate dateOfBirth;
    private String phone;
    private String email;
    private String permanentAddress;
    private double percentageShare;

    // --- getters & setters ---

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public double getPercentageShare() {
        return percentageShare;
    }

    public void setPercentageShare(double percentageShare) {
        this.percentageShare = percentageShare;
    }
}
