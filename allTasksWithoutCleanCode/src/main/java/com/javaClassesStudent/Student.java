package com.javaClassesStudent;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String adress;
    private String phone;
    private String faculty;
    private int kurs;
    private String group;

    public Student(int id, String surname, String name, String patronymic, LocalDate dateOfBirth, String adress, String phone, String faculty, int kurs, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.kurs = kurs;
        this.group = group;
    }

    public Student(String surname, String name, String patronymic, LocalDate dateOfBirth, String adress, String phone, String faculty, int kurs, String group) {
        this.id = 10000 + (int) (Math.random() * ((99999 - 10000) + 1));
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.kurs = kurs;
        this.group = group;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                kurs == student.kurs &&
                surname.equals(student.surname) &&
                name.equals(student.name) &&
                patronymic.equals(student.patronymic) &&
                dateOfBirth.equals(student.dateOfBirth) &&
                adress.equals(student.adress) &&
                phone.equals(student.phone) &&
                faculty.equals(student.faculty) &&
                group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, dateOfBirth, adress, phone, faculty, kurs, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", kurs=" + kurs +
                ", group='" + group + '\'' +
                '}';
    }


    public void printSudentsFromFaculty(String facultyUser) {
        if (this.getFaculty().equals(facultyUser) == true) {
            System.out.println("Id  " + "Name\t Surname\tDate of birht\tAdress\tPhone\t\tKurs\tGroup");
            System.out.println(this.getId() + " " + this.getName() + " " + this.getSurname() + " " + getDateOfBirth().toString() + " " + this.getAdress() + " " + this.getPhone() + " " + this.getKurs() + " " + this.getGroup() + "\n");
        }
    }

    public void studentsFromFacultyAndKurs(String facultyUser, int kursUser) {
        if (this.getFaculty() == facultyUser && this.getKurs() == kursUser) {
            System.out.println("Id  " + "Name\t Surname\tDate of birht\tAdress\tPhone\t\tKurs\tGroup");
            System.out.println(this.getId() + " " + this.getName() + " " + this.getSurname() + " " + getDateOfBirth().toString() + " " + this.getAdress() + " " + this.getPhone() + " " + this.getKurs() + " " + this.getGroup() + "\n");
        }
    }

    public void studentsOlderThanYear(int yearUser) {
        if (this.getDateOfBirth().getYear() > yearUser) {
            System.out.println("Id  " + "Name\t Surname\tDate of birht\tAdress\tPhone\t\tKurs\tGroup");
            System.out.println(this.getId() + " " + this.getName() + " " + this.getSurname() + " " + getDateOfBirth().toString() + " " + this.getAdress() + " " + this.getPhone() + " " + this.getKurs() + " " + this.getGroup() + "\n");
        }
    }

    public void studentsFromGroup(String groupUser) {
        if (this.getGroup() == groupUser) {
            System.out.println("Id  " + "Name\t Surname\tDate of birht\tAdress\tPhone\t\tKurs\tGroup");
            System.out.println(this.getId() + " " + this.getName() + " " + this.getSurname() + " " + getDateOfBirth().toString() + " " + this.getAdress() + " " + this.getPhone() + " " + this.getKurs() + " " + this.getGroup() + "\n");
        }
    }
}
