package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ConcertK {

    private List<PersonK> personList = new ArrayList<>();


    public void addPerson(PersonK person, LocalTime actualTime){
        if (person.getTicket().entryTime().isAfter(actualTime)){
            throw new IllegalArgumentException("You can not enter!");
        }else {
            personList.add(person);
        }
    }

}
