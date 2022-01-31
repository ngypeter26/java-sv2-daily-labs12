package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class testSubjectSchedule {


    @Test
    void testReadFile(){
        Path path = Paths.get("src/main/resources/beosztas.txt");
        SubjectSchedule ss = new SubjectSchedule();
        ss.createScheadule(path);

        Map<String, List<Subject>> actualSchedule =  ss.getSchedule();
        List<String> teachers = actualSchedule.keySet().stream().toList();
        String name1 = teachers.get(0);
                System.out.println(actualSchedule.get(teachers.get(0)).toString());

        System.out.println(teachers.get(0));

        System.out.println(ss.getSumLessons(teachers.get(0)));
        System.out.println(ss.getSumLessons(teachers.get(2)));
        System.out.println(ss.getSumLessons(teachers.get(3)));
//        System.out.println(actualSchedule.keySet());
//        System.out.println(actualSchedule.get(actualSchedule.get(teachers.get(0))));



    }
}
