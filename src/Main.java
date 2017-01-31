import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int userInput = 0;
        String userCont = "yes";
        String userName;

        System.out.println("Hi, What is your name? ");                                    //prompt username
        userName = scnr.nextLine();


        do {                                                                            //user continue loop

        System.out.println("Please enter an integer between 1 and 100: ");                 //main prompt user input
        userInput = scnr.nextInt();

        if (userInput % 2 != 0 && userInput > 60) {                                        //beginning of if loop to sort odd/even userInput
            System.out.println( userName + ", " + userInput + " is Odd.");
        }
        else if (userInput % 2 == 0 && userInput > 2 && userInput < 25) {
            System.out.println( userName + ", the number is Even and less then 25");
        }
        else if (userInput % 2 == 0 && userInput >=26 && userInput <= 60) {
            System.out.println( userName + ", this is an Even number.");
        }
        else if (userInput % 2 == 0 && userInput > 60) {
            System.out.println( userName + ", " + userInput + " is an Even number.");
        }
        else {
            System.out.println(userInput + " is an Odd number " + userName + ".");
        }

        System.out.println("Would you like to Continue, " + userName + " ? (yes/no): ");                                     //user continue prompt
        userCont = scnr.next();
        } while (userCont.equalsIgnoreCase("yes"));

    }
}
