package org.fasttrackit.tema11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws IOException {

        File myFile = new File("grades.txt");

        List<String> stringLinesFromFile = new ArrayList<>();
        List<StudentGrade> studentGradeList = new ArrayList<>();

        stringLinesFromFile = readFromFile(myFile);
        studentGradeList = transformLineInObject(stringLinesFromFile);

        Classroom cls = new Classroom(null, null, 0);
        cls.classroom = studentGradeList;

        System.out.println(cls.getAverageGrade("Computer Science"));
        System.out.println(cls.getGradesForDiscipline("Mathematics"));
        System.out.println(cls.getGradesForStudent("Miriana Rómulo"));
        System.out.println(cls.getMaxGrade().getName() + " " +cls.getMaxGrade().getDiscipline() + " " + cls.getMaxGrade().getGrade());
        System.out.println(cls.getWorstGrade("Physics").getName() + " " + cls.getWorstGrade("Physics").getGrade());
        System.out.println(cls.getWorstGrade().getName() + " " + cls.getWorstGrade().getGrade());

    }


    public static List<String> readFromFile(File myFile) throws FileNotFoundException {

        Scanner scanner = new Scanner(myFile);

        List<String> lineFromFiles = new ArrayList<>();

        while (scanner.hasNextLine()) {

            String currentLine = scanner.nextLine();
            lineFromFiles.add(currentLine);
        }

        return lineFromFiles;

    }

    public static List<StudentGrade> transformLineInObject(List<String> lineFromFiles) {

        List<StudentGrade> studentGradeList = new ArrayList<>();

        for (String currentLine : lineFromFiles) {

            String[] myArray = currentLine.split("\\|");
            StudentGrade student = new StudentGrade(myArray[0], myArray[1], Integer.parseInt(myArray[2]));
            studentGradeList.add(student);
        }

        return studentGradeList;
    }
}