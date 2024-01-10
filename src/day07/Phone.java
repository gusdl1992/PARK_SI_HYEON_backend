package day07;

public class Phone {

    public static int count = 1;
    String name;
    String ponNumber;
    int countNumber;

    public Phone(){
        super();
    }
    public Phone( String name , String ponNumber){
        super();
        this.name = name;
        this.ponNumber = ponNumber;
        countNumber = count;
        count++;    // 생성시 마다 값 증가
    }




}
