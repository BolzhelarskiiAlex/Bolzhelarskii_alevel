package ua.bolzhelarskii.hw10;

public class Task1 {
    public static void main(String[] args){
        Student[] student = new Student[2];
        student[0] = new Student("Peter", "Parker", "GoodNeighbor", 3.9);
        student[1] = new Aspirant("Tony", "Stark", "GoodNeighbor", 5, "CourseWork");
        System.out.println(student[0].getScholarship());
        System.out.println(student[1].getScholarship());
    }
}
