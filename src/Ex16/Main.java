package Ex16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        cats.add(new Cat("Elsa"));
        cats.add(new Cat("Tuborg"));
        cats.add(new Cat("Lizzie"));

        dogs.add(new Dog("Rollo"));
        dogs.add(new Dog("Lisa"));
        dogs.add(new Dog("Edward"));


        for (int i = 0; i < dogs.size(); i++){
            System.out.println(dogs.get(i));
        }

        for (Cat cat : cats){
            System.out.println(cat);
        }

    }
}
