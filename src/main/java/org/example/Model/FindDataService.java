package org.example.Model;

import org.example.Student;
import org.example.Teacher;
import org.example.User;

import java.util.List;

public interface FindDataService {

    List<User> findGroupID(int id);
    Student findStudentID(int id);
    Teacher findTeacherID(int id);
}
