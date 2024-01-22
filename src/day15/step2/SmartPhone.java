package day15.step2;

public class SmartPhone extends Phone{
    // 부모생성자를 호출 !!!!!!!! 필수

    // 생성자 선언
    SmartPhone(String owner){
        // Phone 생성자 호출
        super(owner);
    }

    // 메소드 선언
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }

}
