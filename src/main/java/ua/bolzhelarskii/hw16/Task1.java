package ua.bolzhelarskii.hw16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String text = "Для подключения нужно подать питание на колонку. " +
        "Ей понадобится некоторое время для загрузки, после чего на верхней " +
        "части загорится светодиодная подсветка. После этого колонка сразу обнаруживается " +
        "в сети как ChromeCast устройство, которое сразу предлагается добавить в Google Home.";
        List<String> list = Arrays.asList(text.replaceAll("^ А-Яа-яA-Za-z", " ").split(" +"));
        Map<String, Integer> hashMap = ListToMap(list);
        System.out.println(hashMap);
        //не пойму,почему слова в разнобой идут
    }
    static Map<String, Integer> ListToMap(List<String> list) {
        if (list == null) {
            return null;
        }
        Map<String, Integer> hashMap = new HashMap<>(list.size());
        for (String string : list) {
            if (string != null) {
                hashMap.put(string, string.length());
            }
        }
        return hashMap;
    }
}
