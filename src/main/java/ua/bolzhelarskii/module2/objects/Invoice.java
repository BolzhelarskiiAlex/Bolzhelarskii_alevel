package ua.bolzhelarskii.module2.objects;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.bolzhelarskii.module2.technique.Technique;

import java.util.List;

@Data
@NoArgsConstructor
public class Invoice {
    private List<Technique> techniques;
    private Customer customer;
    private int limit;
    private String type;
}