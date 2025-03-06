import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LegalDrivingAge {
    private Scanner input;

    public LegalDrivingAge() {
        input = new Scanner(System.in); // Initialize Scanner
    }

    /**
     * Calculates the user's age.
     * @param prompt The prompt text for user input.
     * @return The user's age.
     */
    public int calculateAge(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String birthdate = input.nextLine();
                LocalDate dob = LocalDate.parse(birthdate); // Parse the date
                LocalDate now = LocalDate.now();
                Period diff = Period.between(dob, now);
                System.out.println("You are " + diff.getYears() + " years old.");
                return diff.getYears();
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
            }
        }
    }

    /**
     * Checks if the user is of legal driving age.
     */
    public void checkLegalDrivingAge() {
        int age = calculateAge("Enter your birthdate (YYYY-MM-DD): ");
        if (age < 18) {
            System.out.println("You are not of legal age to drive.");
        } else {
            System.out.println("You are of legal age to drive.");
        }
    }

    /**
     * Closes the Scanner resource.
     */
    public void close() {
        input.close();
    }

    public void isLegalAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLegalAge'");
    }
}