package ua.bolzhelarskii.hw10;

public class Aspirant extends Student {
    protected String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork){
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int GetScholarship(){
        if (averageMark == 5){
            return 200;
        }
        return 180;
    }
}
