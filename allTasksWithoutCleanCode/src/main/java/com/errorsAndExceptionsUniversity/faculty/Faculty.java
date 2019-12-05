package com.errorsAndExceptionsUniversity.faculty;

import com.errorsAndExceptionsUniversity.groupsAndStudents.GroupOfStudents;

import java.util.List;

abstract public class Faculty {
    private int idFaculty;
    private List<GroupOfStudents> groups;

    public Faculty(List<GroupOfStudents> groups) throws NoGroupsOnFacultyException {
        this.idFaculty = 1000 + (int) (Math.random() * ((9999 - 1000) + 1));
        if (groups.isEmpty()) {
            throw new NoGroupsOnFacultyException("The faculty does'n have any group");
        }
        this.groups = groups;
    }

    public double averageMarkForFaculty(String subject) {
        double average = 0;
        int count = 0;
        for (int i = 0; i < groups.size(); i++) {
            average += groups.get(i).averageMarkForGroupForTheSubject(subject);
            count++;
        }
        return average / count;
    }

    public double averageMarkFromGroupAndSubject(String nameGroup, String nameSubject) throws CantFindGroupInThisFacultyException {
        int numberOfGroup = -1;
        double average = 0;
        int count = 0;
        for (int i = 0; i < this.getGroups().size(); i++) {
            if (this.getGroups().get(i).getNameGroup() == nameGroup)
                numberOfGroup = i;
        }
        if (numberOfGroup == -1) {
            throw new CantFindGroupInThisFacultyException("Can't find the group ", nameGroup);
        }
        for (int i = 0; i < this.getGroups().get(numberOfGroup).getStudents().size(); i++) {
            for (int j = 0; j < this.getGroups().get(numberOfGroup).getStudents().get(i).getSubjects().size(); j++) {
                if (this.getGroups().get(numberOfGroup).getStudents().get(i).getSubjects().get(j).getNameSubject() == nameSubject) {
                    average += this.getGroups().get(numberOfGroup).getStudents().get(i).getSubjects().get(j).getMark();
                    count++;
                }
            }
        }
        return average / count;
    }

    public int getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }

    public List<GroupOfStudents> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupOfStudents> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;

        Faculty faculty = (Faculty) o;

        if (getIdFaculty() != faculty.getIdFaculty()) return false;
        return getGroups() != null ? getGroups().equals(faculty.getGroups()) : faculty.getGroups() == null;

    }

    @Override
    public int hashCode() {
        int result = getIdFaculty();
        result = 31 * result + (getGroups() != null ? getGroups().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "idFaculty=" + idFaculty +
                ", groups=" + groups +
                '}';
    }
}
