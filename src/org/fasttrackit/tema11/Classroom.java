package org.fasttrackit.tema11;

import java.util.ArrayList;
import java.util.List;

public class Classroom extends StudentGrade {

    protected List<StudentGrade> classroom;


    public Classroom(String name, String discipline, int grade) {
        super(name, discipline, grade);
        this.classroom = new ArrayList<>();
    }

    public List<Integer> getGradesForDiscipline(String discipline) {

        List<Integer> gradesForSpecDisc = new ArrayList<>();
        for (StudentGrade studentGrade : classroom) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                gradesForSpecDisc.add(studentGrade.getGrade());
            }
        }

        return gradesForSpecDisc;
    }

    public List<Integer> getGradesForStudent(String student) {

        List<Integer> gradesForSpecStudent = new ArrayList<>();
        for (StudentGrade studentGrade : classroom) {
            if (studentGrade.getName().equals(student)) {
                gradesForSpecStudent.add(studentGrade.getGrade());
            }
        }

        return gradesForSpecStudent;
    }

    public StudentGrade getMaxGrade(String discipline) {

        int maxGrade = 0;
        StudentGrade maxGradeStud = null;

        for (StudentGrade student : classroom) {
            if (student.getGrade() > maxGrade && student.getDiscipline().equals(discipline)) {
                maxGrade = student.getGrade();
                maxGradeStud = student;
            }
        }

        return maxGradeStud;
    }

    public StudentGrade getMaxGrade() {

        int maxGrade = 0;
        StudentGrade maxGradeStud = null;

        for (StudentGrade student : classroom) {
            if (student.getGrade() > maxGrade) {
                maxGrade = student.getGrade();
                maxGradeStud = student;
            }
        }

        return maxGradeStud;
    }

    public Integer getAverageGrade(String discipline) {

        int sum = 0;

        for (StudentGrade student: classroom) {
            sum += student.getGrade();
        }

        return sum / classroom.size();
    }

    public StudentGrade getWorstGrade(String discipline) {

        int minGrade = 10;
        StudentGrade minGradeStud = null;

        for (StudentGrade student : classroom) {
            if (student.getGrade() <= minGrade && student.getDiscipline().equals(discipline)) {
                minGrade = student.getGrade();
                minGradeStud = student;
            }
        }

        return minGradeStud;
    }

    public StudentGrade getWorstGrade() {

        int minGrade = 10;
        StudentGrade minGradeStud = null;

        for (StudentGrade student : classroom) {
            if (student.getGrade() <= minGrade) {
                minGrade = student.getGrade();
                minGradeStud = student;
            }
        }

        return minGradeStud;
    }



}
