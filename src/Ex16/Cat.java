package Ex16;

public class Cat extends Animal{
    Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Miavvv";
    }

    @Override
    public String toString() {
        return name + " says " + makeSound();
    }
}
