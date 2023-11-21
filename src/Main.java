import com.piotrgorny.test.Animal;
import com.piotrgorny.test.Cat;
import com.piotrgorny.test.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        ArrayList<Animal> animal_list = new ArrayList<>();
        animal_list.add(new Cat("Pusia", 4));
        animal_list.add(new Cat("Felusia", 4));
        animal_list.add(new Cat("Kretka", 4));
        animal_list.add(new Cat("Mania", 4));

        animal_list.add(new Dog("Aros", 4));


        animal_list.forEach((animal) -> {
            System.out.println("Zwierze: " + animal.get_name() + " wydaje dzwięk:");
            animal.make_sound();
        });

    }
}