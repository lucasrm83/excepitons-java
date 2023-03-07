import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Room Number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        String chekin = sc.next();
        System.out.print("Check-out date (dd/MM/yyyy): ");
        String checkout = sc.next();
        Reservation r = new Reservation(number,sdf.parse(chekin),sdf.parse(checkout));
        System.out.println(r);


    }
}