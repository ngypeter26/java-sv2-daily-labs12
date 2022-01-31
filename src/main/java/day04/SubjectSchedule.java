package day04;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class SubjectSchedule {
    private Map<String, List<Subject>> schedule = new TreeMap<>();
    private List<Integer> data = new ArrayList();

    public void createScheadule(Path path) {
        String[] lines = new String[4];
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                lines[0] = scanner.nextLine();
                lines[1] = scanner.nextLine();
                lines[2] = scanner.nextLine();
                lines[3] = scanner.nextLine();
                load(lines);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }

    }

    public int getSumLessons(String teacherName){
        List<Subject> subjects = schedule.get(teacherName);
        int sum = 0;
        for (Subject s : subjects){
            sum += s.getNumberOfLessons();
        }
        return sum;
    }


    private void load(String[] lines) {
        String teacher = lines[0];
        Subject subject = new Subject(lines[1], lines[2], Integer.parseInt(lines[3]));

        if (!schedule.containsKey(teacher)) {
            List<Subject> initialList = new ArrayList<>(Arrays.asList(subject));
            schedule.put(teacher, initialList);
        } else {
            schedule.get(teacher).add(subject);
        }
    }

    public Map<String, List<Subject>> getSchedule() {
        return schedule;
    }

    public List<Integer> getEvenNumbers(List<String> nr) {
        List<Integer> output = new ArrayList<>();
          nr.stream().mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num % 3 == 0).forEach(num -> output.add(num));
        return output;
    }
}
