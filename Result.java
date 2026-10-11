public class Result {
  public static void main(String[] args) {
     int marks = 75;

     if (marks >= 90) {
       System.out.println("Grade A = Excellent!");
     } else if (marks >= 60) {
        System.out.println("Grade B - Good job!");
     } else if (marks >= 33) {
        System.out.println("Grade C - Passed");
     } else {
        System.out.println("Fail - Try Again");
     }
  }
} 
