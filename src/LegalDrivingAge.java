import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LegalDrivingAge {
    private int age;

    public int calculateAgeMethodOne(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate (YYYY-MM-DD): ");
        
        String birthdate = input.nextLine();
        int year = Integer.parseInt(birthdate.substring(0, 4));
        int month = Integer.parseInt(birthdate.substring(5, 7));
        int day = Integer.parseInt(birthdate.substring(8, 10));

        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(dob, now);

        
        System.out.println("You are " + diff.getYears() + " years old.");

        input.close();

        return diff.getYears(); 

    }


    public int calculateAgeMethodTwo(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate (separate them using spaces)): ");
        
        int year = input.nextInt(); 
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(dob, now);

        
        System.out.println("You are " + diff.getYears() + " years old.");

        input.close();

        return diff.getYears(); 

    }

    public int calculateAgeMethodThree(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate (YYYY-02-22)): ");
        String str = input.nextLine();

        LocalDate dob = LocalDate.parse(str);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(dob, now);

        
        System.out.println("You are " + diff.getYears() + " years old.");

        input.close();

        return diff.getYears(); 

    }
    public void isLegalAge(){
        
        age = calculateAgeMethodThree();

        if(age<18){
            System.out.println("You are not of legal age to drive.");
        } else{
            System.out.println("You are of legal age to drive.");
        }

    }
    
}
