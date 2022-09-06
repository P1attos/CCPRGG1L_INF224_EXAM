public class Student{
    String Surname;
    String firstName;
    Character middleInitial;  
    int dateOfBirth;
    int studentNumber;
    String emailAddress;
    Boolean iAmAwesome;
 
    public void sayMystudentNumber(){
 
        System.out.println("My Student Number is " + studentNumber);      
 
    }
 
    public void sayMyEmailAddress(){
        System.out.println("My Email Address is " + emailAddress);
    }
 
    public void sayIamAwesome(){
 
        System.out.println("I am Awesome " + iAmAwesome);
    }
 
 
 }
