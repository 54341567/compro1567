package th.ac.nu.student.u54341567.compro.ch01;
import java.util.Scanner;
public class homework7 {
public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("The cost of a new car:");
        double cost = in.nextDouble();
        System.out.print("The estimated miles driven per year:");
        double miles = in.nextDouble();
        System.out.print("The estimated gas price:");
        double priceGas = in.nextDouble();
        System.out.print("The effciency in miles per gallon:");
        double milesPerGallon = in.nextDouble();
        System.out.print("The estimated resale value after 5 years:");
        double sale = in.nextDouble();
        double totalCost = cost + (((miles*5)/milesPerGallon)*priceGas) - sale;
        System.out.println("Total cost of use car in 5 years"+totalCost);
    }
}