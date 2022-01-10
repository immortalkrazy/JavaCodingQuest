package Quizzes;

public class Student {

      private String fName;
      private String lName;
      private int numberOfQuizzes;
      private double avg = 0;
      private String grade;

      // default constructor
      public Student() {

      }

      // custom constructor with our specified variables
      public Student(String fName, String lName, int numberOfQuizzes, double avg, String grade) {
            this.fName = fName;
            this.lName = lName;
            this.numberOfQuizzes = numberOfQuizzes;
            this.avg = avg;
            this.grade = grade;
      }

      // these are just getters and setters methods
      // not really needed in your project
      // except one which I have used in addQuizzes method
      public String getfName() {
            return fName;
      }

      public void setfName(String fName) {
            this.fName = fName;
      }

      public String getlName() {
            return lName;
      }

      public void setlName(String lName) {
            this.lName = lName;
      }

      public int getNumberOfQuizzes() {
            return numberOfQuizzes;
      }

      public void setNumberOfQuizzes(int numberOfQuizzes) {
            this.numberOfQuizzes = numberOfQuizzes;
      }

      public double getAvg() {
            return avg;
      }

      public void setAvg(double avg) {
            this.avg = avg;
      }

      public String getGrade() {
            return grade;
      }

      public void setGrade(String grade) {
            this.grade = grade;
      }

      // Student object toString method
      @Override
      public String toString() {
            return "Student [fName=" + fName + ", lName=" + lName + ", numberOfQuizzes=" + numberOfQuizzes + ", avg="
                        + avg + ", grade=" + grade + "]";
      }

}
