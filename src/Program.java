import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)   {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Room Number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date chekin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());
            Reservation r = new Reservation(number, chekin, checkout);
            System.out.println("Reservation " + r);
            System.out.println();
            System.out.println("Enter date to update reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            chekin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());
            r.updateDates(chekin, checkout);
            System.out.println("Reservation "+r);
        }
        catch(ParseException e){
            System.out.println("Invalid data format!");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error in reservation");
        }









    }
}