package ua.bolzhelarskii.hw18.Task5;

import lombok.*;

import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Box {
    private List<Item> Item;
    private int size;
}