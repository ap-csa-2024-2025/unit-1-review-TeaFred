public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = "AP Computer Science A";
    int avgSpentWeek = 237;
    double quiz1 = 93.4;
    double quiz2 = 84.6;
    int hw1 = 100;
    int hw2 = 92;
    int hw3 = 98;
    int hw4 = 80;
    double finalExam = 94.7;
    System.out.println("Course Name: " + courseName);
    System.out.println("Average time spent per week in minutes: " + avgSpentWeek + " minutes.");
    System.out.println("Homework Grades: ");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println("Quiz Grades: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println("Final Exam Grade: ");
    System.out.println(finalExam);
    System.out.println("Weekly Time Spent: " + (avgSpentWeek/60) + " hours and " + (avgSpentWeek%60) + " minutes.");
    double hwAvg = ((double)hw1+hw2+hw3+hw4)/4;
    double quizAvg = (quiz1+quiz2)/2;
    int overallGrade = (int) ((hwAvg * 0.35) + (quizAvg*0.15) + (finalExam * .50));
    System.out.println("Average Homework Grade: " + hwAvg);
    System.out.println("Average Quiz Grade: " + quizAvg);
    System.out.println("Final Exam Grade: " + finalExam);
    System.out.println("Overall Grade: " + overallGrade);
  }
}
