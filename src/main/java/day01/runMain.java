package day01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class runMain {
    public static void main(String[] args) {


        Running running = new Running();
        Path path = Paths.get("src/main/resources/running.csv");
        double sumKm = running.getSumKm(path,2021,12);
        System.out.println(sumKm);

    }
}
