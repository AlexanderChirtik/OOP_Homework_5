package org.example;

import java.util.Date;
import java.util.List;

public class Student extends User {

    private int groupID;
    private List<Integer> grades;

    public Student(int ID, String fio, String dateBirth, int groupID, List<Integer> grades) {
        super(ID, fio, dateBirth);
        this.groupID = groupID;
        this.grades = grades;
    }

    public Student(){};

    @Override
    public String toString() {
        return "\nStudent: " +
                "ID Student = " + getID() +
                ", FIO Student = " + getFio() +
                ", dateBirth = " + getDateBirth() +
                "groupID = " + groupID +
                ", grades = " + grades;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
