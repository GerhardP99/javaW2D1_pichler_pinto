package gerhard;

import java.util.*;

public class PersonA2 {
    String firstName = "Allan";
    String lastName = "Norman";


    public void getFullName(){
        System.out.printf("Full name is: %s %s",firstName,lastName.toUpperCase());
    }

    public static void main(String[] args) {
        boolean stop = false;
        while (!stop) {
            Scanner userInput = new Scanner(System.in);

            int waitTime = 3000; // 3000ms = 3s

            PersonA2 firstName = new PersonA2();
            PersonA2 lastName = new PersonA2();

            System.out.printf("\nFirst Name: %s \nLast Name is: %s\n",firstName.firstName,lastName.lastName.toUpperCase());
            try {
                Thread.sleep(waitTime); // waiting time
            } catch (InterruptedException ignored) {
            }
            PersonA2 obj = new PersonA2();
            obj.getFullName();

            System.out.println("\n\nWould you like to repeat? Yes/No");
            String s = userInput.nextLine();
            if (s.equalsIgnoreCase("no")) {
                stop = true;
            }
        }
    }
}
