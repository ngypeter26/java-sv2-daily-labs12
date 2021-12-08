package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConcertTest {

    @Test
    void testAddPerson(){
        LocalDate date = LocalDate.now();
        LocalTime concertTime = LocalTime.of(21,00);
        LocalTime enterTime1 = LocalTime.of(19,12);
        LocalTime enterTime2 = LocalTime.of(20,5);

        Person person1 = new Person(new Ticket("RHCP",date,concertTime,10000));
        Person person2 = new Person(new Ticket("RHCP",date,concertTime,10000));

        Concert concert = new Concert();

        concert.addPerson(person1,enterTime2);

        
    }


}
