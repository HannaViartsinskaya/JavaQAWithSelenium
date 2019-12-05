package com.errorsAndExceptionsUniversity.groupsAndStudents;

import java.util.ArrayList;
import java.util.List;

public class GroupOfStudents {
    private int idGroup;
    private String nameGroup;
    private List<Student> students;

    public GroupOfStudents(String nameGroup, List<Student> students) throws NoStudentsInGroupException {
        this.idGroup = 1000 + (int) (Math.random() * ((9999 - 1000) + 1));
        if (students.isEmpty()) {
            throw new NoStudentsInGroupException("The list with dtudents is empty");
        }
        this.nameGroup = nameGroup;
        this.students = students;
    }

    public double averageMarkForGroupForTheSubject(String nameSubject) {
        double summ = 0;
        double count = 0;
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).getSubjects().size(); j++) {
                if (students.get(i).getSubjects().get(j).getNameSubject() == nameSubject) {
                    summ += students.get(i).getSubjects().get(j).getMark();
                    count++;
                }
            }
        }
        return summ / count;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "GroupOfStudents{" +
                "idGroup=" + idGroup +
                ", students=" + students +
                '}';
    }
}
