import java.util.Scanner;

public class ConditionalStatement {
    public static void main (String[] args ){
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Input now"); /* tells the user to input something from the terminal */
        int input = reader.nextInt();

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
