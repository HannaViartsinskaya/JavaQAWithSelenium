package com.errorsAndExceptionsUniversity.faculty;

public class CantFindGroupInThisFacultyException extends Exception {
    private String group;

    public String getGroupException() {
        return group;
    }

    public CantFindGroupInThisFacultyException(String message, String nameGroup)
    {
        super(message);
        group=nameGroup;
    }
        }
