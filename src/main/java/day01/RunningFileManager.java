package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunningFileManager {
    private List<Run> running = new ArrayList<>();

    public double sumOfMonthAndYear(int year, Month month){
        double sum = 0;
        for (Run actual : running){
            if(actual.getDate().getYear()==year && actual.getDate().getMonth()==month){
                sum+=actual.getKm();
            }
        }
        return sum;
    }
    public void readAllLines(String filename){
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename))){
                String line ;
                br.readLine();
                while((line = br.readLine())==null){
                    Run run = createRunObjectFromLine(line);
                    running.add(run);
                }


        }catch (IOException ioe){
            throw new IllegalStateException("Cannot reach file",ioe);
        }
    }

    private Run createRunObjectFromLine(String line){
        String[]  temp = line.split(";");
        return new Run(Double.parseDouble(temp[0].split(" ")[0]), LocalDate.parse(temp[1]));
    }
}
