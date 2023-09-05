import java.util.Scanner;

class Student
{
    public int numSubjects;
    public int[] marks;

    public Student(int numSubjects)
    {
        this.numSubjects = numSubjects;
        this.marks = new int[numSubjects];
    }

    public void inputMarks() 
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numSubjects; i++) 
        {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public int getTotalMarks() 
    {
        int total = 0;
        for (int mark : marks) 
        {
            total += mark;
        }
        return total;
    }

    public double getAveragePercentage() 
    {
        int total = getTotalMarks();
        return ((double) total / (numSubjects * 100)) * 100;
    }

    public char getGrade()
    {
        double averagePercentage = getAveragePercentage();
        if (averagePercentage >= 90)
        {
            return 'A';
        }
        else if (averagePercentage >= 80)
        {
            return 'B';
        }
        else if (averagePercentage >= 70)
        {
            return 'C';
        } 
        else if (averagePercentage >= 60) 
        {
            return 'D';
        } 
        else 
        {
            return 'F';
        }
    }
}

public class StudentGradeCalculator
 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        Student student = new Student(numSubjects);

        student.inputMarks();

        System.out.println("Total Marks obtained in all subject : " + student.getTotalMarks()+ " out of 100");
        System.out.println("Average Percentage: " + student.getAveragePercentage() + "%");
        System.out.println("Grade: " + student.getGrade());

        scanner.close();
    }
}
