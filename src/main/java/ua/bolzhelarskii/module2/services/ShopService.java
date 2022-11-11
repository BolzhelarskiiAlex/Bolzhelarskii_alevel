package ua.bolzhelarskii.module2.services;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.bolzhelarskii.module2.objects.Invoice;
import ua.bolzhelarskii.module2.technique.Category;
import ua.bolzhelarskii.module2.technique.Technique;
import ua.bolzhelarskii.module2.technique.Telephone;
import ua.bolzhelarskii.module2.technique.Television;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

@Data
@NoArgsConstructor
public class ShopService {
    public static List<List<String>> allItemsToBuy = getListFromCSV();

    public static Invoice getInvoice() {
        Random random = new Random();
        Invoice check = new Invoice();
        check.setCustomer(PersonService.getRandomCustomer());
        check.setLimit(random.nextInt(3500));
        List<Technique> techniques = createListOfTechnique();
        check.setTechniques(techniques);
        int allCost = (check.getTechniques().stream()
                .map(Technique::getPrice)
                .mapToInt(x -> x)
                .sum());
        if (allCost <= check.getLimit()) {
            check.setType("retail");
        } else {
            check.setType("wholesale");
        }
        writerLogsOfOrder(check);
        return check;
    }

    private static List<Technique> createListOfTechnique() {
        List<Technique> techniques = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            int randomItem = 1 + random.nextInt(allItemsToBuy.size() - 1);
            Set<Integer> wrongItemIndex = new HashSet<>();
            for (int j = 0; j < allItemsToBuy.get(randomItem).size(); j++) {
                if (allItemsToBuy.get(randomItem).get(j).isEmpty()) {
                    try {
                        throw new Uncorrected();
                    } catch (Uncorrected e) {
                        wrongItemIndex.add(randomItem);
                    }
                }
            }
            if (!wrongItemIndex.contains(randomItem)) {
                techniques.add(getTechniqueFromCSV(randomItem));
            } else {
                i--;
            }
        }
        return techniques;
    }

    private static Technique getTechniqueFromCSV(int index) {
        switch (allItemsToBuy.get(index).get(0)) {
            case ("Telephone") -> {
                return new Telephone(Category.TELEPHONE,
                        allItemsToBuy.get(index).get(1),
                        allItemsToBuy.get(index).get(4),
                        Integer.parseInt(allItemsToBuy.get(index).get(6)),
                        allItemsToBuy.get(index).get(2));
            }
            case ("Television") -> {
                return new Television(Category.TELEVISION,
                        allItemsToBuy.get(index).get(1),
                        allItemsToBuy.get(index).get(4),
                        Integer.parseInt(allItemsToBuy.get(index).get(6)),
                        Integer.parseInt(allItemsToBuy.get(index).get(3)),
                        allItemsToBuy.get(index).get(5));
            }
        }
        return new Technique();
    }

    private static List<List<String>> getListFromCSV() {
        List<List<String>> list = new ArrayList<>();
        String text;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/CSV"))) {
            while ((text = reader.readLine()) != null) {
                list.add(Arrays.stream(text.split(",")).toList());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void writerLogsOfOrder(Invoice order) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/Order.txt", true))) {
            writer.write(System.lineSeparator() + LocalDateTime.now() + " this is time of create order " +
                    System.lineSeparator() + " For users " + order.getCustomer().toString() + System.lineSeparator() +
                    " All his Order by Now " + order.getTechniques());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}