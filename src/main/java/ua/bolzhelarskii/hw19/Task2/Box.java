package ua.bolzhelarskii.hw19.Task2;

import lombok.*;
import ua.bolzhelarskii.hw19.Task2.Cargo;
import ua.bolzhelarskii.hw19.Task2.MaxLiftingCapacity;

import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Box {
    private String from;
    private String material;
    private String color;
    private MaxLiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    private Date deliveryDate;
}