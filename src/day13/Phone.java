package day13;

public class Phone {

    // 멤버
    // 1. 필드
    public  String model;
    public  String color;
    private  String name;
    // 2. 생성자
    public Phone(){}

    public Phone(String model , String color){
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 3. 메서드
    // 1. 매개변수 X , 리턴값 X
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    // 2. 매개변수 String , 리턴값 X
    public void sendVoice(String message){
        System.out.println("자기 :" + message);
    }
    // 3. 매개변수 String , 리턴값 X
    public void receiveVoice(String message){
        System.out.println("상대방 :" + message);
    }
    // 4. 매개변수 X , 리턴값 X
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    } 

}
