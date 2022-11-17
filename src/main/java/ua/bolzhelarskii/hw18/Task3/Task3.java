package ua.bolzhelarskii.hw18.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2002/02/20", "2016/04/11", "2022/01/24", "2033/11/11", "1987/12/04");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(list.stream()
                .map(x -> LocalDate.parse(x, dateTimeFormatter))
                .anyMatch(x -> x.getYear() == 2022));
    }
}