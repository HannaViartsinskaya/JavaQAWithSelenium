package com.errorsAndExceptionsUniversity.groupsAndStudents;

public class Subject {
    private String nameSubject;
    private int mark;

    public Subject() {
    }

    public Subject(String nameSubject, int mark) throws MarkException {
        this.nameSubject = nameSubject;
        if (mark > 10 || mark <= 0) throw new MarkException("The mark should be greater than 0 and less then 11", mark);
        this.mark = mark;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameSubject='" + nameSubject + '\'' +
                ", mark=" + mark +
                '}';
    }

}
