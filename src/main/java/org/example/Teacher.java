package org.example;

import java.util.List;

public class Teacher extends User{

    private int experience;
    private List<Integer> groupsID;

    public Teacher(int ID, String fio, String dateBirth, int experience, List<Integer> groupsID) {
        super(ID, fio, dateBirth);
        this.experience = experience;
        this.groupsID = groupsID;
    }

    public Teacher(){};


    @Override
    public String toString() {
        return "\nTeacher: " +
                "ID Teacher = " + getID() +
                ", FIO Teacher = " + getFio() +
                ", dateBirth = " + getDateBirth() +
                "experience = " + experience +
                ", groupsID = " + groupsID;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<Integer> getGroupsID() {
        return groupsID;
    }

    public void setGroupsID(List<Integer> groupsID) {
        this.groupsID = groupsID;
    }
}
