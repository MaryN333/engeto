package cz.wz.marysidy.hotel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest g1 = new Guest("Adela", "Malikova", LocalDate.of(1993, 3, 13));
        Guest g2 = new Guest("Jan", "Dvoracek", LocalDate.of(1995, 5, 5));
        System.out.println(g2);
        g2.setBirth(LocalDate.of(1995, 4, 5));
        System.out.println(g2);

        System.out.println("*-".repeat(15));
        BookingManager guests= new BookingManager();
        guests.addInfo(g1);
        guests.addInfo(g2);
        guests.printInfo();

        System.out.println("*-".repeat(15));
        Room r1 = new Room(1, 1, true, true, 1000);
        Room r2 = new Room(2, 1, true, true, 1000);
        Room r3 = new Room(3, 3, false, true, 2400);
        BookingManager rooms = new BookingManager();
        rooms.addInfo(r1);
        rooms.addInfo(r2);
        rooms.addInfo(r3);
        rooms.printInfo();

        System.out.println("*-".repeat(15));
        Booking b1 = Booking.makeBooking(g1, r1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), VacationType.WORK);
//        b1.addGuest(g2);

        List<Guest> guestList = Arrays.asList(g1, g2);
        Booking b2 = Booking.makeBooking(guestList, r1, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), VacationType.WORK);
        // b3 - Room is not available for the selected dates.
        Booking b3 = Booking.makeBooking(g2, r1, LocalDate.of(2021, 7, 25), LocalDate.of(2021, 7, 26), VacationType.WORK);
        Booking b4 = Booking.makeBooking(g1, r3, LocalDate.of(2024, 11, 24), LocalDate.of(2024, 11, 30), VacationType.LEASURE);
        Booking b5 = Booking.makeBooking(guestList, r2);

        BookingManager bookings = new BookingManager();
        bookings.addInfo(b1);
        bookings.addInfo(b2);
        bookings.addInfo(b3);
        bookings.addInfo(b4);
        bookings.addInfo(b5);

        bookings.printInfo();










    }
}
