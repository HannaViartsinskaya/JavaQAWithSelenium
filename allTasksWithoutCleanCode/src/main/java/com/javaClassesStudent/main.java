package com.javaClassesStudent;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Kovaleva", "Natalia", "Sergeevna", LocalDate.of(2000, 12, 7), "Umanskaya 54, Minsk", "+375257387654", "Informatic", 4, "34A");
        students[1] = new Student("Ivanova", "Nadezda", "Sergeevna", LocalDate.of(2001, 10, 7), "Rozy Luksemburg 54, Minsk", "+375254387654", "Economic", 4, "3B");
        students[2] = new Student("Kovalev", "Maksim", "Sergeevich", LocalDate.of(2000, 1, 7), "Umanskaya 54, Minsk", "+375257387656", "Informatic", 3, "33A");
        students[3] = new Student("Kniga", "Maksim", "Alekseevich", LocalDate.of(1999, 1, 12), "Umanskaya 1, Minsk", "+3752534336", "Economic", 4, "35A");
        students[4] = new Student("Koval", "Marta", "Sergeevna", LocalDate.of(2001, 02, 9), "Umanskaya 8, Minsk", "+375257348654", "Informatic", 3, "33A");
        students[5] = new Student("Ivanov", "Alexey", "Sergeevich", LocalDate.of(2000, 01, 7), "Umanskaya 54, Minsk", "+375257387687", "Informatic", 4, "34A");
        String searcStudentsFromFaculty = "Informatic";
        int kursForSearch = 3;
        System.out.println("Students from faculty " + searcStudentsFromFaculty + " is:");
        for (Student stu : students) {
            stu.printSudentsFromFaculty(searcStudentsFromFaculty);
        }
        System.out.println("-------------");
        System.out.println("Students from faculty " + searcStudentsFromFaculty + " and course " + kursForSearch + " is:");
        for (Student stu : students) {
            stu.studentsFromFacultyAndKurs(searcStudentsFromFaculty, kursForSearch);
        }

        System.out.println("-------------");
        int yearAfter = 2000;
        System.out.println("Students was birth after  " + yearAfter + " is:");
        for (Student stu : students) {
            stu.studentsOlderThanYear(yearAfter);
        }
        System.out.println("-------------");
        String groupUsers = "34A";
        System.out.println("The list of students from group  " + groupUsers + " are:");
        for (Student stu : students) {
            stu.studentsFromGroup(groupUsers);
        }
    }

}
