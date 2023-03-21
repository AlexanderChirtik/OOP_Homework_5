package org.example;

import java.util.Date;

//model
public abstract class User {
    private String dateBirth;
    private int ID;
    private String fio;

    public User(int ID, String fio, String dateBirth) {
        this.dateBirth = dateBirth;
        this.ID = ID;
        this.fio = fio;
    }

    public User(){};

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


}
