package day01;

import java.time.LocalDate;
import java.time.LocalTime;

public class FrontOfStageTicket {

    private String band;
    private LocalDate date;
    private LocalTime time;
    private int price;
    private String extraCode;

    public FrontOfStageTicket(String band, LocalDate date, LocalTime time, int price, String extraCode) {
        this.band = band;
        this.date = date;
        this.time = time;
        this.price = price;
        this.extraCode = extraCode;
    }

    public LocalTime entryTime(){
        return time.minusHours(2) ;
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

    public String getExtraCode() {
        return extraCode;
    }
}
