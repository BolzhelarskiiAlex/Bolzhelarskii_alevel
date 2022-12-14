package ua.bolzhelarskii.module2.technique;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Telephone extends Technique {
    private String model;

    public Telephone(Category category, String series, String screenType, Integer price, String model) {
        super(category, series, screenType, price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", screenType='" + screenType + '\'' +
                ", price=" + price +
                '}';
    }
}
