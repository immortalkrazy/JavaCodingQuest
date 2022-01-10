package Quizzes;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

      public static void main(String[] args) throws IOException {

            // Student objects array
            Student[] studentArray = new Student[7];
            // scanner object to read in the txt file
            Scanner reader = new Scanner(new FileReader("quizzes.txt"));
            // student counter to use in populating studendArray
            int studentCounter = 0;
            // loop to read in the file
            while (reader.hasNext()) {
                  // string s is a line by line iteration from file
                  String s = reader.nextLine();
                  // s is split to get the name and quizz scores
                  String[] stringArray = s.split(" ");
                  // first and second parts of s are first and last name
                  String fName = stringArray[0];
                  String lName = stringArray[1];
                  // this is to calculate average of scores
                  int numberOfQuizzes = 0;
                  int sum = 0;
                  // we start for loop from 2 since that's where scores start in our line
                  for (int i = 2; i < stringArray.length; i++) {
                        numberOfQuizzes++;
                        sum += Integer.parseInt(stringArray[i]);
                  }

                  double avg = sum / numberOfQuizzes;
                  // student object is created with the args costructor
                  Student std = new Student(fName, lName, numberOfQuizzes, avg, getGrade(avg));
                  // we put student object in the studentArray at the position studentCounter
                  // note: since requirement is to use array but ArrayList works much better
                  studentArray[studentCounter] = std;
                  // we increase counter to put the next object on the next index
                  studentCounter++;

            }
            // reader is closed
            reader.close();

            // this is to sort array by the last name of student object
            Arrays.sort(studentArray, new Comparator<Student>() {
                  @Override
                  public int compare(Student o1, Student o2) {
                        return o1.getlName().compareTo(o2.getlName());
                  }
            });
            // print sorted array
            printStudents(studentArray);
      }

      // you can make is as elaborated as you have already done in your code
      private static String getGrade(double avg) {
            if (avg >= 90) {
                  return "A";
            } else if (avg >= 80) {
                  return "B";
            } else if (avg >= 70) {
                  return "c";
            } else if (avg >= 60) {
                  return "C";
            } else {
                  return "F";
            }
      }

      public static void printStudents(Student[] array) {

            for (int i = 0; i < array.length; i++) {

//                  System.out.println(array[i].getfName() + " " + array[i].getlName() + " " + " "
//                              + array[i].getNumberOfQuizzes() + " " + array[i].getGrade());
                  System.out.printf("%10s, %10s\t\t%d\t%s\n", array[i].getfName(), array[i].getlName(),
                              array[i].getNumberOfQuizzes(), array[i].getGrade());
            }
      }

      // it will just add the number of quizzes for the respective student object
      // and return true
      public static boolean addQuizz(Student student) {

            student.setNumberOfQuizzes(student.getNumberOfQuizzes() + 1);
            return true;
      }

}
