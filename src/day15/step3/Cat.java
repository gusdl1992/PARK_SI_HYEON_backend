package day15.step3;

public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void breathe(){
        super.breathe();
    }
}
