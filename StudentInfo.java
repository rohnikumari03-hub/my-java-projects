// Anand Ka Dusra Java Project - Student Info
import java.util.Scanner;

public class StudentInfo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== Anand ka Student Portfolio ===");

  // Tera data - yahan apna naam change kar sakta hai
    String name = "Anand";
    String className = "10th";
    String school = "Barabanki,UP";
    String dream = "Elon Musk jaisa banna";
    String skill = "Java, HTML, Website Banana";

    // Print karna
    System.out.println("Name: " + name);
    System.out.println("Class: " + ClassName);
    System.out.println("School: " + school);
    System.out.println("Dream: " + dream);
    System.out.println("Skills: " + skill);
    System.out.println("------------------------------");
    System.out.println("Ye mere GitHub portfolio hai!");
    
    sc.close();
  }
}
