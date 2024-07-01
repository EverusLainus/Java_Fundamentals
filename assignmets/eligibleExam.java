package Java_Fundamentals.assignmets;

public 
/*
Problem
Write a program to check if a person is eligible for exam or not such that
(a) The person's age must be between 18 and 27
(b) Relaxation in upper age limit is as follow
For applicants of General category No Relaxation
For applicants of OBC category 3 year Relaxation
For applicants of ST/SC category 5 year Relaxation
*/

public class Main {
  public static void main(String[] args) {
    int personAge = 32;
    String personCategory ="general";
    if(personAge >= 18 && personAge <= 27){
      System.out.println("Person is eligible for exam");
    }
    else if(personCategory.equals("OBC") && personAge <= 30){
      System.out.println("Person is eligible for exam");
    }
    else if(personCategory.equals("ST/SC") && personAge <= 32){
      System.out.println("Person is eligible for exam");
    }
    else{
      System.out.println("Person is not eligible for exam");
    }
    
    

  }

} {
    
}
