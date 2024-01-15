package Ex16;

public class Dog extends Animal{
    Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Wuff";
    }

    @Override
    public String toString() {
        return name + " says " + makeSound();
    }
}
