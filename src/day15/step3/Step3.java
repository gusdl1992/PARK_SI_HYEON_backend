package day15.step3;

public class Step3 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Animal dog1 = new Dog();

        // 매개변수의 다형성
        animalSound( dog1 );
        animalSound( new Cat() );

    }// m e

    // 매개변수 다형성
    public static void  animalSound(Animal animal){
        animal.sound();
    }
} // c e
