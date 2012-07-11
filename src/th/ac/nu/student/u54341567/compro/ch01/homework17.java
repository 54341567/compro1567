package th.ac.nu.student.u54341567.compro.ch01;
import java.util.Scanner;
public class homework17 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        String input = in.nextLine();
        int i = 0;
        String output = "";
        while(i < input.length()){
            output = output+input.charAt(i)+" ";
            i++;
        }
        System.out.println(output);
        }
}