package com.example.anthonyferry.controle_ferry_2016_11_23;

/**
 * Created by Anthony FERRY on 23/11/2016.
 */

public class FicheAnimal {
    private String name;
    private String spicie;
    private String note;
    //private Integer picture;

    public FicheAnimal()
    {

    }

    public FicheAnimal(String name, String spicie, String note)
    {
        this.name = name;
        this.spicie = spicie;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpicie() {
        return spicie;
    }

    public void setSpicie(String spicie) {
        this.spicie = spicie;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
/*
    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }
   */
}
