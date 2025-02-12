import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produkt> produkts = new ArrayList<>(List.of(
                new Produkt("Laptop", 5000,4.7, 10),
                new Produkt("Smartphone", 1000,5, 25),
                new Produkt("Tablett", 800,4.5, 8),
                new Produkt("Kopfhörer", 200,3, 50)
        ));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите критерий сортировки: ");
        System.out.println("1.Цена по возрастанию");
        System.out.println("2.Цена по убыванию");
        System.out.println("3.Рейтинг");
        System.out.println("4.Количество на складе");

        int select = scanner.nextInt();
        switch (select) {
            case 1:
                produkts.sort(Comparator.comparingInt(p->p.getPrice()));
                break; // сортирует по возрастанию цены
            case 2:
                produkts.sort(Comparator.comparingInt(Produkt::getPrice).reversed());
                break; // сортирует по убыванию цены
            case 3:
                produkts.sort(Comparator.comparingDouble(Produkt::getRating).reversed());
                break; // сортирует по рейтингу
            case 4:
                produkts.sort(Comparator.comparingInt(Produkt::getStock).reversed());
                break; // сортирует по количеству на складе
            default:
                System.out.println("Неверный выбор");
        }
        System.out.println("Отсортированные товары:");
        for (Produkt produkt:produkts){
            System.out.println(produkt);
        }

    }
}