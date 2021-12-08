package day01;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private String band;
    private LocalDate date;
    private LocalTime time;
    private int price;

    public Ticket(String band, LocalDate date, LocalTime time, int price) {
        this.band = band;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public LocalTime entryTime(){
        return time.minusHours(1) ;
    }

    public String getBand() {
        return band;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }
}
