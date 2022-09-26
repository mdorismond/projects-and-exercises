package com.techelevator;

public class HomeworkAssignment {
    HomeworkAssignment:
    public String getLetterGrade() {
        double percentage = (double) earnedMarks / possibleMarks;
        if (percentage >= 0.9) {
            return "A";
        } else if (percentage >= 0.8) {
            return "B";
        } else if (percentage >= 0.7) {
        .... and so on

            return "F";
        }
    }


}
