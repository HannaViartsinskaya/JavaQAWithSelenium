package com.errorsAndExceptionsUniversity.faculty;

import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University(List<Faculty> faculties) throws NoFacultiesAtUniversityException {
        if (faculties.isEmpty()) {
            throw new NoFacultiesAtUniversityException("The university doesn't have any faculty");
        }
        this.faculties = faculties;
    }

    public double averageMarkForUniversity(String subject) {
        double average = 0;
        int count = 0;
        for (int i = 0; i < faculties.size(); i++) {
            for (int j = 0; j < faculties.get(i).getGroups().size(); j++) {
                average += faculties.get(i).getGroups().get(j).averageMarkForGroupForTheSubject(subject);
                count++;
            }
        }
        return average / count;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "faculties=" + faculties +
                '}';
    }
}
