package homeworksss.homework38;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = {
                new Sportsman("Alice", 25, 90),
                new Sportsman("Bob", 30, 85),
                new Sportsman("Charlie", 20, 95),
                new Sportsman("Diana", 27, 88)
        };

        // 1. Сортировка по естественному порядку (по имени)
        Arrays.sort(sportsmen);
        System.out.println("Сортировка по имени (естественный порядок):");
        System.out.println(Arrays.toString(sportsmen));

        // 2. Сортировка по рейтингу с использованием класса ScoreComparator
        Arrays.sort(sportsmen, new ScoreComparator());
        System.out.println("\nСортировка по рейтингу (score):");
        System.out.println(Arrays.toString(sportsmen));

        // 3. Сортировка по возрасту с использованием анонимного класса Comparator
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        System.out.println("\nСортировка по возрасту (age):");
        System.out.println(Arrays.toString(sportsmen));


    }
}



