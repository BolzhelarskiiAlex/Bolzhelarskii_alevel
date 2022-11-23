package ua.bolzhelarskii.hw16;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String text = "Для подключения нужно подать питание на колонку. " +
                "Ей понадобится некоторое время для загрузки, после чего на верхней " +
                "части загорится светодиодная подсветка. После этого колонка сразу обнаруживается " +
                "в сети как ChromeCast устройство, которое сразу предлагается добавить в Google Home.";
        List<String> list = Arrays.asList(text.replaceAll("А-Яа-яA-Za-z", " ").split(" +"));
        Map<Integer, List<String>> hashMap = ListToMap(list);
        System.out.println(hashMap);
    }

    public static Map<Integer, List<String>> ListToMap(List<String> list) {
        List<String> newList = new ArrayList<>();
        newList.add(list.get(0));
        Map<Integer, List<String>> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (String s : list) {
                if (list.get(i).length() == s.length()) {
                    newList.add(s);
                    hashMap.put(list.get(i).length(), new ArrayList<>(newList));
                }
            }
            newList.clear();
        }
        return hashMap;
    }
}