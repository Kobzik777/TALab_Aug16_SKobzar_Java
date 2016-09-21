package com.company;

import com.company.Entities.Adress;
import com.company.Entities.NoteBook;

/**
 * Created by Serhii_Kobzar on 9/20/2016.
 */
public class Model {
    NoteBook noteBook = new NoteBook();

    public void setLastName(String someValue) {
        noteBook.setLastName(someValue);
    }

    public void setName(String someValue) {
        noteBook.setName(someValue);
    }

    public void setMiddleName(String someValue) {
        noteBook.setMiddleName(someValue);
    }

    public void setNickName(String someValue) {
        noteBook.setNickName(someValue);
    }

    public void setComment(String someValue) {
        noteBook.setComment(someValue);
    }

    public void setGroup(Group group) {
        noteBook.setGroup(group);
    }

    public void setHomePhone(String someValue) {
        noteBook.setHomePhoneNumber(someValue);
    }

    public void setCellFirst(String someValue) {
        noteBook.setFirstCellPhoneNumber(someValue);
    }

    public void setCellSecond(String someValue) {
        noteBook.setSecondCellPhoneNumber(someValue);
    }

    public void setEmail(String someValue) {
        noteBook.setEmail(someValue);
    }

    public void setSkype(String someValue) {
        noteBook.setSkype(someValue);
    }

    public void setRegistrDate(String someValue) {
        noteBook.setRegistrationDate(someValue);
    }

    public void setChangesDate(String someValue) {
        noteBook.setChangesName(someValue);
    }

    public void setAdres(Adress someValue){
        noteBook.setAdress(someValue);
    }
}
