package org.example.View;

import org.example.User;

import java.util.List;

public class View implements Menu, ShowUsers {

    /**
     * Созданы интерфейсы Menu и ShowUsers, которые будут определять поведение класса View.
     * Методы разделены на 2 интерфейса согласно принципу Interface segregation principle.
     */
    public void menu(){
        System.out.println("Меню");
        System.out.println("1 - добавить в базу студента");
        System.out.println("2 - добавить в базу преподавателя");
        System.out.println("3 - показать группу по ID группы");
        System.out.println("4 - показать данные студента по ID студента");
        System.out.println("5 - показать данные преподавателя по ID преподавателя");
        System.out.println("0 - выход");
    }
    public String userView(List<User> students){
        return students.toString();
    }

    public String userView(User user){
        return user.toString();
    }
}
