package com.errorsAndExceptionsUniversity;

import com.errorsAndExceptionsUniversity.faculty.*;
import com.errorsAndExceptionsUniversity.groupsAndStudents.*;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        try {
            List<Subject> subjectsFirstSet = Arrays.asList(
                    new Subject("Math", 4),
                    new Subject("English", 9),
                    new Subject("Physics", 7),
                    new Subject("Informatics", 9),
                    new Subject("Math", 7)
            );
            List<Subject> subjectsSecondSet = Arrays.asList(
                    new Subject("Math", 4),
                    new Subject("English", 7),
                    new Subject("Physics", 2),
                    new Subject("Informatics", 4),
                    new Subject("English", 5)
            );
            List<Subject> subjectsThirdSet = Arrays.asList(
                    new Subject("Math", 6),
                    new Subject("English", 7),
                    new Subject("Physics", 3),
                    new Subject("Informatics", 8),
                    new Subject("Physics", 7)
            );

            List<Student> studentsFirstSet = Arrays.asList(
                    new Student("Ivanova A", subjectsFirstSet),
                    new Student("Petrov I", subjectsSecondSet),
                    new Student("Sidorova H", subjectsThirdSet),
                    new Student("Ivanov N", subjectsSecondSet)
            );
            List<Student> studentsSecondSet = Arrays.asList(
                    new Student("Ivanova A", subjectsFirstSet),
                    new Student("Petrov I", subjectsSecondSet),
                    new Student("Sidorova H", subjectsThirdSet),
                    new Student("Petrova V", subjectsThirdSet),
                    new Student("Ivanuk R", subjectsSecondSet),
                    new Student("Sidorczuk M", subjectsFirstSet)
            );
            List<Student> studentsThirdSet = Arrays.asList(
                    new Student("Ivanova A", subjectsFirstSet),
                    new Student("Petrov I", subjectsSecondSet),
                    new Student("Petrova V", subjectsThirdSet),
                    new Student("Petrovchik P", subjectsFirstSet),
                    new Student("Ivanuk R", subjectsSecondSet),
                    new Student("Sidorczuk M", subjectsFirstSet)
            );

            List<GroupOfStudents> groupsFirstSet = Arrays.asList(
                    new GroupOfStudents("RomanoGermGeaograpgy", studentsFirstSet),
                    new GroupOfStudents("AncientGeography", studentsSecondSet)
            );
            List<GroupOfStudents> groupsSecondtSet = Arrays.asList(
                    new GroupOfStudents("RomanoGermFilologia", studentsThirdSet),
                    new GroupOfStudents("Hindi", studentsFirstSet)
            );
            List<GroupOfStudents> groupsThirdSet = Arrays.asList(
                    new GroupOfStudents("AppliedInformatics", studentsSecondSet),
                    new GroupOfStudents("Web-development", studentsThirdSet),
                    new GroupOfStudents("EnglishInInfromatics", studentsFirstSet)
            );
            List<Faculty> faculties = Arrays.asList(
                    new ComputerScienceFaculty(groupsThirdSet, 30),
                    new ForeignLanguagesFaculty(groupsSecondtSet, 50),
                    new GeographyFaculty(groupsFirstSet, 30)
            );
            double averageForStudent = studentsFirstSet.get(1).averageMaxOfAllSubjects();
            System.out.println("Average mark for " + studentsFirstSet.get(1).getNameAndSurname() + " is " + averageForStudent);

            double averageMarkFacGroupSubj = faculties.get(1).averageMarkFromGroupAndSubject("Hindi", "Math");
            System.out.println("Average mark for Faculty of Foreign Languages " + averageMarkFacGroupSubj);
            String nameSubject = "Math";
            University university = new University(faculties);
            System.out.println("Average mark for " + nameSubject + " is " + university.averageMarkForUniversity(nameSubject));
        } catch (MarkException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getMarkException());
        } catch (NoSubjectsException e) {
            System.out.println(e.getMessage());
        } catch (CantFindGroupInThisFacultyException e) {
            System.out.print(e.getMessage());
            System.out.print(e.getGroupException());
        } catch (NoStudentsInGroupException e) {
            System.out.println(e.getMessage());
        } catch (NoGroupsOnFacultyException e) {
            System.out.println(e.getMessage());
        } catch (NoFacultiesAtUniversityException e) {
            System.out.println(e.getMessage());
        }
    }

}
