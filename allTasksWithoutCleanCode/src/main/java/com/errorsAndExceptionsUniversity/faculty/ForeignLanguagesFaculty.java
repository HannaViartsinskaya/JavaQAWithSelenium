package com.errorsAndExceptionsUniversity.faculty;

import com.errorsAndExceptionsUniversity.groupsAndStudents.GroupOfStudents;

import java.util.List;

public class ForeignLanguagesFaculty extends Faculty {
    private int maxStudents;

    public ForeignLanguagesFaculty(List<GroupOfStudents> groups, int maxStudents) throws NoGroupsOnFacultyException {
        super(groups);
        this.maxStudents = maxStudents;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
