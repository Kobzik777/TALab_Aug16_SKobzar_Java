package com.company.Entities;

import com.company.Group;

/**
 * Created by Serhii_Kobzar on 9/20/2016.
 */
public class NoteBook {
    private String lastName;
    private String name;
    private String middleName;
    private String nickName;
    private String comment;
    private Group group;
    private String homePhoneNumber;
    private String firstCellPhoneNumber;
    private String secondCellPhoneNumber;
    private String email;
    private String skype;
    private Adress adress;
    private String registrationDate;
    private String changesName;

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getFirstCellPhoneNumber() {
        return firstCellPhoneNumber;
    }

    public void setFirstCellPhoneNumber(String firstCellPhoneNumber) {
        this.firstCellPhoneNumber = firstCellPhoneNumber;
    }

    public String getSecondCellPhoneNumber() {
        return secondCellPhoneNumber;
    }

    public void setSecondCellPhoneNumber(String secondCellPhoneNumber) {
        this.secondCellPhoneNumber = secondCellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getChangesName() {
        return changesName;
    }

    public void setChangesName(String changesName) {
        this.changesName = changesName;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", group='" + group + '\'' +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", firstCellPhoneNumber='" + firstCellPhoneNumber + '\'' +
                ", secondCellPhoneNumber='" + secondCellPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", adress=" + adress.toString() +
                ", registrationDate='" + registrationDate + '\'' +
                ", changesName='" + changesName + '\'' +
                '}';
    }

}
