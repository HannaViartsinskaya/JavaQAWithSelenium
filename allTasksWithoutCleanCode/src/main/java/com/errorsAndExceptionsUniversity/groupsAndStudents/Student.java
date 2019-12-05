package com.errorsAndExceptionsUniversity.groupsAndStudents;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int idStudent;
    private String nameAndSurname;
    private List<Subject> subjects;

    public Student() {
    }

    public Student(String nameAndSurname, List<Subject> subjects) throws NoSubjectsException {
        this.idStudent = 1000 + (int) (Math.random() * ((9999 - 1000) + 1));
        this.nameAndSurname = nameAndSurname;
        if (subjects.isEmpty())
            throw new NoSubjectsException("Each student should have at least 1 subject for learning");
        this.subjects = subjects;
    }

    public double averageMaxOfAllSubjects() {
        double temp = 0;
        int count = 0;
        for (int i = 0; i < subjects.size(); i++) {
            temp += subjects.get(i).getMark();
            count++;
        }
        return temp / count;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
