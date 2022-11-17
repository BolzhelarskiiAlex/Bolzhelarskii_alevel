package ua.bolzhelarskii.hw19;

public class Task {
    public static void main(String[] args) {
        Box boxJson = new Box();
        BoxService.fillFromResources(boxJson, "Task19Box.json");
        System.out.println(boxJson);
        Box boxXml = new Box();
        BoxService.fillFromResources(boxXml, "Task19Box.xml");
        System.out.println(boxXml);
    }
}