package ua.bolzhelarskii.module2.objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private String id;
    private String email;
    private int age;
}