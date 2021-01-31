package main.java.util;

import main.java.assignments.Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GraderLogic {
    protected int totalQuestions;
    protected double numberWrong;
    protected double numberCorrect = totalQuestions-numberWrong;


    protected double totalGrade() {
        double score;
        score = ((totalQuestions-numberCorrect) * 100);
        if (score<0) { throw new ArithmeticException("Error: You can not have more incorrect questions than total questions."); }
        return score;
    }

    public ArrayList<Assignments> Essay() {
        return Essay();
    }

    public double avg(ArrayList e) {
        double avg = (e.size() / e.addAll() * 100);
    }
}
