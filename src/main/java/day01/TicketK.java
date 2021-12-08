package day01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TicketK {

    private String band;
    private LocalDateTime startTime;
    private int price;

    public TicketK() {
        super();
    }

    public TicketK(String band, LocalDateTime startTime, int price) {
//        super(); mindig így kezdődik, ez a szuperhívás az object törzsosztály konstuktorára
        this.band = band;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime(){
        return startTime.toLocalTime().minusHours(1) ;
    }



    public String getBand() {
        return band;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}
