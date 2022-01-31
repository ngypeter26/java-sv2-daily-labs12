package day04;

public class Subject {
    private String name;
    private String className;
    private int numberOfLessons;

    public Subject(String name, String className, int numberOfLessons) {
        this.name = name;
        this.className = className;
        this.numberOfLessons = numberOfLessons;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    @Override
    public String toString() {
        return name + " - " + className + " - " + numberOfLessons ;
    }
}
