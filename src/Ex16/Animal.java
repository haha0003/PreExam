package Ex16;

abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    public String makeSound(){
        return "Sound";
    }

}
