//Duy Truong
//ID:1354824
//Date: 08/27/2019
//In class assignment
import java.util.Scanner;
public class InClass {
    public static void main (String[] args){
        Scanner input= new Scanner (System.in);
        char repeat='Y'; //value for the while loop
        String answer; // input value for user to input if they want to repeat
        String grade; //value for letter grade
        int counter=1;

        while ((repeat=='Y') || (repeat=='y')){ //Loop will terminate if user press 'N'
            System.out.println("Enter a grade: ");
            int number = input.nextInt(); //input value
            //Enter the 12 cases using if-else statement
            if ((number<=100) && (number>=94)){
                grade="A";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=93) && (number>=90)){
                grade="A-";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=89) && (number>=87)){
                grade="B+";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=86) && (number>=83)){
                grade="B";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=82) && (number>=80)){
                grade="B-";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=79) && (number>=77)){
                grade="C+";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=76) && (number>=73)){
                grade="C";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=72) && (number>=70)){
                grade="C-";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=69) && (number>=67)){
                grade="D+";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=66) && (number>=63)){
                grade="D";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if ((number<=62) && (number>=60)){
                grade="D-";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            else if (number<60){
                grade="F";
                System.out.println("Student number "+counter+" grade is : "+grade);
            }
            counter=counter+1; //add 1 for each input students
            System.out.println ("Do you want to enter another grade ? [Y/N]: ");
            input.nextLine();
            answer= input.nextLine();
            repeat=answer.charAt(0);

        }
    }
}
