package day01;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        FrontOfStageTicketK fost = new FrontOfStageTicketK("Quenn", LocalDateTime.now(),20000,"hbiluzdba");
//
//        System.out.println(fost.getBand());
//
//        PersonK person1 = new PersonK(new TicketK("Quenn", LocalDateTime.now(),20000));
//        PersonK person2 = new PersonK(new FrontOfStageTicketK("Quenn", LocalDateTime.now(),20000,"hbiluzdba"));

        TicketK ticketK = new TicketK("Quen",LocalDateTime.now(),20000);
        TicketK frontTicket = new FrontOfStageTicketK("Quen",LocalDateTime.now(),30000,"#gfefra");
        FrontOfStageTicketK frontTicket2 = new FrontOfStageTicketK("Quen",LocalDateTime.now(),30000,"#gfefra");
        // baloldal legyen bővebb, mint a jobboldal

        System.out.println(ticketK.getPrice()); //20000
        System.out.println(frontTicket.getPrice()); //30000
        System.out.println(frontTicket2.getPrice()); //30000  nincs benne getprice, de öröklődik a metódus

        frontTicket2.saySomeThing();
//        frontTicket1.saySomeThing(); // nem megy
//        ticketK.saySomeThing(); // nem megy
        // statikus diktál

//        FrontOfStageTicketK myTicket = frontTicket;  // ez nem megy, mert a statikus diktál
        FrontOfStageTicketK myTicket = (FrontOfStageTicketK) frontTicket;  // ez  megy, típuskényszerítés castolás
        // FORDÍTÓ SZÓL, H NEM JÓ. , én mondom, hogy tudom mit csinálok. Ekkor a forsító leveszi a kezét, ezért lehet majd hiba

        //Szabály:
        // CSak olyan metódust hívhatok, ami a statikus típusban szerepel (bal oldal)
        // vizsont, ha a statikus és dinamikus típusban is szerepel a metódus, akkor a dinamikus diktál (jobb oldal)
    }



}
