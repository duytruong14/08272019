import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int a,b;
        System.out.println("Enter a number: ");
        a=in.nextInt();
        String answer;
        char repeat='y';
        System.out.println("Enter a sentence: ");
        in.nextLine();
        answer=in.nextLine();
        repeat=answer.charAt(0);
        System.out.println("The number is: "+a+" and first letter is: "+repeat);
        System.out.println(""+answer);
    }
}
