package com.errorsAndExceptionsUniversity.groupsAndStudents;

public class MarkException extends Exception {
    private int markException;

    public int getMarkException() {
        return markException;
    }

    public MarkException(String message,int mark)
    {
        super(message);
        markException=mark;
    }
}
