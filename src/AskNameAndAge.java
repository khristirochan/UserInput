import java.util.Scanner;

public class AskNameAndAge {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = in.nextLine();

        System.out.println("How old are you?");
        int userAge = in.nextInt();

        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");

        in.close();
    }
}
	