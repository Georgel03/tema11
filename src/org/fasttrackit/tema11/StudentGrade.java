package org.fasttrackit.tema11;

public class StudentGrade {

    private String name;

    private String discipline;

    private int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public String getDiscipline() {
        return this.discipline;
    }

    public int getGrade() {
        return this.grade;
    }
}
