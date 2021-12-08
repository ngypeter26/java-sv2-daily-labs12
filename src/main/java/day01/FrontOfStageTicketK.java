package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicketK extends TicketK { // ezt nem engedi

    private String extraCode;

    public FrontOfStageTicketK(String band, LocalDateTime startTime, int price,String extraCode) {
        super(band, startTime, price);
        this.extraCode = extraCode;
    }

    @Override       // felülírom, mert -2 óra
    public LocalTime entryTime(){
        return super.entryTime().minusHours(1);
    }

    public String getExtraCode() {
        return extraCode;
    }

    public void saySomeThing(){
        System.out.println("something");
    }
}
