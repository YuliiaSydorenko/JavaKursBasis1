package homeworksss.homework39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task1 {

        public static void main(String[] args) {
            Collection<String> strings = new ArrayList<>();


            strings.add("Картофель");
            strings.add("Колбаса");
            System.out.println(strings.toString());



            strings.addAll(List.of("Морковь", "Огурец", "Лук", "Горошек", "Майонез"));
            System.out.println("Ингредиенты для салата Оливъе: " + strings);



        }
    }


