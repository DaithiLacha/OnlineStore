import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Driver {
    public static void main(String[] args) {
        Customer dave = new Customer("Premium", "David O'Connor", "Tralee", 50.00, new GregorianCalendar(1900, Calendar.JANUARY, 01).getTime());
        System.out.println(dave.toString());
        Stock tv = new Stock("Electrical", "LG 50 inch UHD", 449.99, "Large");
        System.out.println(tv.toString());
    }
}
