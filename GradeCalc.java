import java .util.Scanner;
public class GradeCalc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name =sc.nextLine();
        System.out.println("----------- "+ name +"   Welcome to Student Grade Calculator ----------");
        System.out.println("----------- " + name + "------------------");
        System.out.println("Please enter the Total number of subjects :-");
        int Sub=sc.nextInt();
        int mark[]=new int[Sub];
        
        for(int m=0; m<mark.length; m++)
        {
            System.out.println("\nEnter marks for subject" + (m+1) +":" );
            mark[m]=sc.nextInt(); 
        

            while(mark[m] < 0 || mark[m] > 100)
            {
                System.out.println("\nPlease enter the correct marks for subject" +(m+1)+":");
                mark[m]=sc.nextInt();
            }
        }
        int Total=0;
        double Average=0.0;
        String grade="";

        for(int m=0; m < mark.length; m++)
        {
            Total+=mark[m];
        }
        Average=Total/Sub;
        if(Average >=80)
        {
            grade="A";
        }
        else if(Average >=70 && Average < 80)
        {
            grade="B";
        }
        else if(Average >=60 && Average < 70)
        {
            grade="C";
        }
        else if(Average >=50 && Average < 60)
        {
            grade="D";
        }
        else if(Average >=40 && Average < 50)
        {
            grade="E";
        }
        else if(Average >=30 && Average < 40)
        {
            grade="F";
        }
        else
        {
            grade="FF";
        }

        System.out.printf("\n\nStudent Name: %s\nTotal Subjects: %d\nTotal Marks: %d\nAverage Marks: %.2f\nGrade: %s",name,Sub,Total,Average,grade);
        
    }
}