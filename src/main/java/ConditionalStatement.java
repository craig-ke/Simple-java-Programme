import java.util.Scanner;

public class ConditionalStatement {
    public static void main (String[] args ){
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Input now"); /* tells the user to input something from the terminal */
       /*Intagers*/
        int input = reader.nextInt();
/*Conditional statements*/
        if(input > 10)
        {
            System.out.println("More");
        }
        if(input <= 10 )
        {
            System.out.println("Less");
        }
    }
}
