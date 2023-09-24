import java.util.Scanner;

public class AskName {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = in.nextLine();
        System.out.println("Your name is " + userName+".");
        in.close();
    }
}