package org.example.Controller;

import org.example.Student;
import org.example.Model.StudyGroupServiceFind;
import org.example.Teacher;
import org.example.View.View;

import java.util.*;

public class Controller implements ControllerStart {

    /**
     * Создан интерфейс ControllerStart для защиты класса Controller от модификации (Open closed principle)
     */

    View view = new View();
    StudyGroupServiceFind sgs = new StudyGroupServiceFind();
    public void start(){
        System.out.println();
        view.menu();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num){
            case 1:
                //Создание 5 параметров, для добавления их в конструктор класса Student
                System.out.println("Введите ID студента");
                int ID = in.nextInt();
                System.out.println("Введите ФИО студента");
                in.nextLine();
                String fio = in.nextLine();
                System.out.println("Введите дату рождения студента");
                String dateBirth = in.nextLine();
                System.out.println("Введите номер группы");
                int groupID = in.nextInt();
                System.out.println("Введите через пробел оценки данного студента");
                in.nextLine();
                //Оценки студента вносятся строкой, затем делятся на массив строк,
                //после этого с помощью parse переносятся в список int
                String[] tempGrades = in.nextLine().split(" ");
                Integer[] arrayOfGrades = new Integer[tempGrades.length];
                for (int i = 0; i < arrayOfGrades.length; i++) {
                    arrayOfGrades[i] = Integer.parseInt(tempGrades[i]);
                }
                sgs.create(new Student(ID, fio, dateBirth, groupID, Arrays.asList(arrayOfGrades)));
                //Для того, чтобы не утратить данные, метод start() запускается вновь
                start();
            case 2:
                //Создание 5 параметров, для добавления их в конструктор класса Teacher
                System.out.println("Введите ID преподавателя");
                int tID = in.nextInt();
                System.out.println("Введите ФИО преподавателя");
                in.nextLine();
                String tFIO = in.nextLine();
                System.out.println("Введите дату рождения преподавателя");
                String tDateBirth = in.nextLine();
                System.out.println("Введите стаж преподавателя");
                int tExperience = in.nextInt();
                System.out.println("Введите через пробел группы, в которых работает преподаватель");
                in.nextLine();
                //Группы, в которых работает преподаватель, вносятся строкой, затем делятся на массив строк,
                //после этого с помощью parse переносятся в список int
                String[] tempGroups  = in.nextLine().split(" ");
                Integer[] arrayOfGroups = new Integer[tempGroups.length];
                for (int i = 0; i < arrayOfGroups.length; i++) {
                    arrayOfGroups[i] = Integer.parseInt(tempGroups[i]);
                }
                sgs.create(new Teacher(tID, tFIO, tDateBirth, tExperience, Arrays.asList(arrayOfGroups)));
                //Для того, чтобы не утратить данные, метод start() запускается вновь
                start();
            case 3:
                System.out.println("Введите ID группы");
                int IDGroup = in.nextInt();
                System.out.println(view.userView(sgs.findGroupID(IDGroup)));
                //Для того, чтобы не утратить данные, метод start() запускается вновь
                start();
            case 4:
                System.out.println("Введите ID студента");
                int IDStudent = in.nextInt();
                System.out.println(view.userView(sgs.findGroupID(IDStudent)));
                //Для того, чтобы не утратить данные, метод start() запускается вновь
                start();
            case 5:
                System.out.println("Введите ID преподавателя");
                int IDTeacher = in.nextInt();
                System.out.println(view.userView(sgs.findGroupID(IDTeacher)));
                //Для того, чтобы не утратить данные, метод start() запускается вновь
                start();
            case 0:
                System.out.println("Работа программы завершена");
                break;
            default:
                System.out.println("Такого варианта нет");
                start();
        }
    }
}
