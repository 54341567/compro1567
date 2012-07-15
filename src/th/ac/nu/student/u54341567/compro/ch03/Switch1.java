package th.ac.nu.student.u54341567.compro.ch03;
import java.util.Scanner;
public class Switch1 {
   public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 char grade = in.next().charAt(0);
 switch (grade) {
 case 'A':
System.out.println("Excellent");
 case 'B':
 System.out.println("Good");
case 'C':
 System.out.println("So so");
 case 'D':
 System.out.println("Fails");
 case 'F':
 System.out.println("Get lost");
 default:
 System.out.println("Invalid");
 }

} 
}
