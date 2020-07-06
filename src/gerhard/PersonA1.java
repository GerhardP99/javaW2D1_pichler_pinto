package gerhard;

import java.util.*;

public class PersonA1 {
    String firstName = "Allan";
    String lastName = "Norman";

    public void getFullName(){
        System.out.printf("Full name is: %s %s",firstName,lastName);
    }

    public static void main(String[] args) {
        boolean stop = false;
        while (!stop) {
            Scanner userInput = new Scanner(System.in);

            int waitTime = 3000; // 3000ms = 3s

            PersonA1 firstName = new PersonA1();
            PersonA1 lastName = new PersonA1();

            System.out.printf("\nFirst Name: %s \nLast Name is: %s\n",firstName.firstName,lastName.lastName);
            try {
                Thread.sleep(waitTime); // waiting time
            } catch (InterruptedException ignored) {
            }
            PersonA1 obj = new PersonA1();
            obj.getFullName();

            System.out.println("\n\nWould you like to repeat? Yes/No");
            String s = userInput.nextLine();
            if (s.equalsIgnoreCase("no")) {
            stop = true;
        }
        }
    }
}
