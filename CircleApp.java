
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class CircleApp {    
	public static void main(String[] args) {

        int counter = 0;
        boolean x = true;
        while (x) {
             try {

                System.out.println("Enter a radius for a circle (ft): ");
                Scanner scan = new Scanner(System.in);
                double intake1 = scan.nextDouble();
                double outtake2 = CircleApp.getArea(intake1);
                DecimalFormat dFormat1 = new DecimalFormat("#.00");
                String outtake3 = dFormat1.format(outtake2); //had to change to String
                double outtake6 = CircleApp.getCircumference(intake1);
                String outtake7 = dFormat1.format(outtake6);
                System.out.println("Area = " + outtake3 + " square ft.");
                System.out.println("Circumference = " + outtake7 + " ft.");
                System.out.println("Do you want to try a different circle? Yes/No?");
                System.out.println( " "); //garbage problem
                String finalFeedback = scan.nextLine();
                System.out.println();
                if (finalFeedback.equalsIgnoreCase("yes")) {
                         x = true;
                    } else x = false;
                            scan.close();
                    counter = counter++;

            } catch (IllegalArgumentException one) {

            System.out.println("Try again.");

            } catch (InputMismatchException two) { //had to import this exception

            System.out.println("Something doesn't add up. Try again.");

            } finally {

            }

        }

        System.out.println( counter + " total circles calculated. Bye!"); //count revolutions     
    }

    public static double getArea(double radius) {
        double getArea1 = Math.PI * Math.pow( radius, 2 ); //.00
        return getArea1;
    }    
    public static double getCircumference(double radius) {    

        double getCircumference1 = 2 * Math.PI * radius; //.00
            return getCircumference1;
    }    
}    