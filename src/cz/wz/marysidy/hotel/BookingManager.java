package cz.wz.marysidy.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Object> bookings = new ArrayList<>();

    public BookingManager() {
    }

    public List<Object> getBookings() {
        return bookings;
    }

    public void addInfo(Object info){
        bookings.add(info);
    }

    public void printInfo(){
        for(Object info : bookings){
            if(info != null){
                System.out.println(info);
            }
        }
    }
}
