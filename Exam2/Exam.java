import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Pos();
        lastDigits();
        Names();
        numSize();
        alpha();
        sNumber();
        letterc();
        course();
        strand();
        email();
    }

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)

        static void Pos(){
            System.out.println("1. Positive, negative, zero");
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
    
    
           if (number > 0) {
                System.out.println("POSITIVE");
            } else if (number < 0) {
                System.out.println("NEGATIVE");
            } else if (number == 0) {
                System.out.println("ZERO");
            }
    
        }
        


        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)

        static void lastDigits(){

            System.out.println("2. PRIME or COMPOSITE number");
            System.out.print("Enter the last digit of your student number: ");
            int lastDigit = scan.nextInt();
    
            if (lastDigit % 3 == 0) {
                System.out.println("PRIME");
            } else if (lastDigit % 2 == 0) {
                System.out.println("COMPOSITE");
            } else if (lastDigit == 1) {
                System.out.println("NEITHER");
            }
    
        }

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)

        static void Names(){
            System.out.println("3. Length of your fullname");
            System.out.print("Enter your firstname: ");
            String firstName = scan.next();
            int Stringsize1 = firstName.length();
            System.out.print("Enter your surname: ");
            String surName = scan.next();
            int Stringsize2 = surName.length();
            System.out.println("The sum of the character of your firstname and surname is: " + (Stringsize1 + Stringsize2));
        }

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest number.
   
        static void numSize(){
            System.out.println("4. Largest Number");
            System.out.print("Enter first number: ");
            int firstNumber = scan.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = scan.nextInt();
            System.out.print("Enter third number: ");
            int thirdNumber = scan.nextInt();
    
            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                System.out.println("The largest number is: " + firstNumber);
            } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
                System.out.println("The largest number is: " + secondNumber);
            } else
                System.out.println("The largest number is: " + thirdNumber);
            }

        // ==============================================================================

        // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
        
        static void alpha(){

            System.out.println("5. Vowel or Consonant");
            System.out.print("Enter the first character of your first name: ");
            char firstChar = scan.next().charAt(0);
    
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'
            || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U')
                 System.out.println(true);
                 else
                 System.out.println(false);
    
            }
        
        
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)

        static void sNumber(){
            System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        if (studentNumber == 2022104869) {
            System.out.println("VALID");
        } else
            System.out.println("INVALID");
    }

    

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)

        static void letterc(){
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();

        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase()) {
            System.out.println("VALID");
        } else
            System.out.println("INVALID");
    }


        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        static void course(){
        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        // If BSIT
        if (course.toLowerCase().equals("bsit") || course.toUpperCase().equals("BSIT")) {

            System.out.print("Enter your specialization (MWAA or MAA): ");
            String specialization1 = scan.next();
            if (specialization1.toLowerCase().equals("mwaa") || specialization1.toUpperCase().equals("MWAA"))
            {
                System.out.println("YOUR SPEACILIZATION IS MWAA");
            } else
                System.out.println("YOUR SPEACILIZATION IS MAA");

        }

        // If BSCS
        else if (course.toLowerCase().equals("bscs") || course.toUpperCase().equals("BSCS")) {

            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();
            if (specialization2.toLowerCase().equals("df") || specialization2.toUpperCase().equals("DF"))
            {
                System.out.println("YOUR SPEACILIZATION IS DF");
            } else
                System.out.println("YOUR SPEACILIZATION IS ML");
        }

    }

        

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME
        static void strand(){ 
        System.out.println("9. SHS Strand selection ");


        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();
        switch(strand){
            case "STEM":
            System.out.println("Your strand is STEM");
            break;
            case "ICT":
            System.out.println("Your strand is ICT");
            break;
            case "HUMSS":
            System.out.println("Your strand is HUMSS");
            break;
            case "HOME ECONOMICS":
            System.out.println("Your strand is HOME ECONOMICS");
            break;
            case "ARTS AND DESIGN":
            System.out.println("Your strand is ARTS AND DESIGN");
            break;
            case "TVL MARITIME":
            System.out.println("Your strand is TVL MARITIME");
            break;
            default:
            System.out.println("Invalid");
            break;
        }

    }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the following pattern:
        // - Your surname
        // - The string "@student.national-u.edu.ph"
        //(10 pts)

        static void email(){
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains("montales")) {
            System.out.println("VALID EMAIL");
        } else
            System.out.println("INVALID EMAIL");
    }
        }
