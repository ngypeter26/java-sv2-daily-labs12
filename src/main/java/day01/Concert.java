package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> personList = new ArrayList<>();


    public void addPerson(Person person, LocalTime time){
        System.out.println(person.getTicket().getTime());
        if (person.getTicket().entryTime().isAfter(time)){
            throw new IllegalArgumentException("You can not enter!");
        }else {
            personList.add(person);
        }
    }

}
