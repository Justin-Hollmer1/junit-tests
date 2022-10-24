import java.util.ArrayList;

public class Student  {

    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student(String name, long id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    public double getGradeAverage() {
        double total = 0;
        for(Integer grade : grades) {
            total += grade;
        }
        return (total / grades.size());
    }



}
