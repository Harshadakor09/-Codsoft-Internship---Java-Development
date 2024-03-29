// Codsoft Internship
// Task_2

import java.util.Scanner;

public class StudentGradeCalculator1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the Number of Subjects: ");
    int numSub = scanner.nextInt();

    int[] marks = new int[numSub];
    int totalMarks = 0;

    for (int i = 0; i < numSub; i++)
    {
      System.out.print("Enter marks obtained out of 100 in each Subject " + (i + 1) + ": ");
        marks[i] = scanner.nextInt();
        totalMarks += marks[i];
    }

    double averagePercentage = (double) totalMarks / (numSub * 100) * 100;

    System.out.println("Your Result is Here:");
    System.out.println("Your Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + averagePercentage + "%");

    String grade = calculateGrade(averagePercentage);
    System.out.println("Grade: " + grade);
    

    scanner.close();
}

public static String calculateGrade(double percentage)
{
    if (percentage >= 90) 
    {
        return "A+";
    }
    else if (percentage >= 80)
    {
        return "A";
    }
    else if (percentage >= 70)
    {
        return "B";
    }
    else if (percentage >= 60)
    {
        return "C";
    } 
    else if (percentage >= 50) 
    {
        return "D";
    } 
    else 
    {
        return "F";
    }
}
}

