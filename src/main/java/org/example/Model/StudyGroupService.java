package org.example.Model;

import org.example.Student;
import org.example.Teacher;
import org.example.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService implements DataService {

    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    /**
     * Принятие обьекта класса Student и добавление его в список students
     * @param student
     */
    @Override
    public void create(Student student) {
        students.add(student);
        System.out.println("Студент внесён в базу");
    }

    /**
     * Принятие обьекта класса Teacher и добавление его в список teachers
     * @param teacher
     */
    @Override
    public void create(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Преподаватель внесён в базу");
    }

    /**
     * Создается список, в который будут добавлятся элементы с падходящим номером группы.
     * Циклом for просматриваем все элементы списка students, которые имеют подходящий номер группы.
     * Циклом for просматриваем все элементы списка teachers. Внутренним циклом перебираем элементы списка groupsID,
     * находящегося в классе Teacher. Данный список подразумевает то, что каждый преподаватель
     * может работать сразу в немкольких группах.
     * @param groupID в качестве параметра принимается номер группы
     * @return возвращаем список студентов и преподавателей с подходящим номером группы, добавленных в список
     */
    @Override
    public List<User> findGroupID(int groupID) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroupID() == groupID)
                users.add(students.get(i));
        }
        for (int i = 0; i < teachers.size(); i++) {
            for (int j = 0; j < teachers.get(i).getGroupsID().size(); j++) {
                if (teachers.get(i).getGroupsID().get(j) == groupID)
                    users.add(teachers.get(i));
            }
        }
        return users;
    }

    /**
     * Циклом for проходим по списку students и ищем подходящий номер ID
     * @param studentID в качестве параметра принимается ID студента
     * @return
     */
    @Override
    public Student findStudentID(int studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == studentID)
                return students.get(i);
        }
        return null;
    }

    /**
     * Циклом for проходим по списку teachers и ищем подходящий номер ID
     * @param teacherID в качестве параметра принимается ID преподавателя
     * @return
     */
    @Override
    public Teacher findTeacherID(int teacherID) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getID() == teacherID)
                return teachers.get(i);
        }
        return null;
    }

}
