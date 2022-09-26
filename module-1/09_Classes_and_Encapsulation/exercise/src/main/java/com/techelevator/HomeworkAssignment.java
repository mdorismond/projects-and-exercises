package com.techelevator;

public class HomeworkAssignment {
    int earnedMarks;
    int possibleMarks;
    String submitterName;
    String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String letterGrade() {
        double percentage = (double) earnedMarks / possibleMarks;
        if (percentage >= 0.91) {
            return "A";
        } else if (percentage >= 0.8) {
            return "B";
        } else if (percentage >= 0.7) {
            return "C";
        } else if (percentage >= 0.6) {
            return "D";
        }

            return "F";
        }
    }





