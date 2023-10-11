import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length;
        double width;
        boolean done = false;
        System.out.println("Enter the sides of the rectangle!");
        do {
            System.out.println("Length:");
            if (scan.hasNextDouble()) {
                length = scan.nextDouble();
                System.out.println("Width:");
                if (scan.hasNextDouble()) {
                    width = scan.nextDouble();
                    if (width > 0 && length > 0) {
                        System.out.printf("%-13s%13.2f", "Area:", length*width);
                        System.out.printf("\n%-13s%13.2f", "Perimeter:", length*2 + width*2);
                        System.out.printf("\n%-13s%13.2f", "Length of diaganol:", Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)));
                        done = true;
                    }else{
                        System.out.println("You have entered something negative!");
                        scan.nextLine();
                    }
                }else{
                    System.out.println("Oops! You entered something invalid!");
                    scan.nextLine();
                }
            }else{
                System.out.println("Oops! You entered something invalid!");
                scan.nextLine();
            }
        } while (!done);
    }
}