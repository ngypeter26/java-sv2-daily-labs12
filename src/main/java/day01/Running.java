package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Running {





    public double getSumKm(Path path,int year, int month){
        List<String> lines = readFile(path);
        double sum = 0;
        double[] data;
        for (int i =1; i<lines.size();i++){
            data = getArrayFromLine(lines.get(i));

            if (data[1] == year & data[2] == month ){
                sum+=data[0];
            }
        }
        return sum;
    }





    public double[] getArrayFromLine(String line){
        String[] lineArray = line.split(";");
        double km = Double.parseDouble(lineArray[0].split(" ")[0]);
        double year = Double.parseDouble(lineArray[1].split("-")[0]);
        double month = Double.parseDouble(lineArray[1].split("-")[1]);
        double[] output={km,year,month};
        return output;
    }

    public List<String> readFile(Path path){
        try{
            return Files.readAllLines(path);
        }catch(IOException ioe){
            throw new IllegalStateException("File is nout found!",ioe);
        }
    }
}
