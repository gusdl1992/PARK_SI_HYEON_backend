package day22.step1;

public class Step1{

    public static void main(String[] args) {

        // 1. 특정 타입의 필드가 아닌 다형성을 이용한 다양한 타입의 필드
        Box box = new Box();
        // 2. Object 타입 필드에 문자 데이터 삽입
        box.content = "안녕하세요";
        // 3. 꺼내기
        System.out.println(box.content);
        // String content = box.content1;  // 오류 발생. 강제 타입 변환 필요!
        String content1 = (String) box.content;
        // 강제 타입 변환
        System.out.println(content1);
        // - 혹여나 자식 클래스의 타입을 모르는 경우 instanceOf 연산자 사용 필요.
        // - 매번 instanceOf 사용하는데는 한계가 있다.


        // Object 타입 필드에 정수 데이터 대입
        box.content = 100;
        System.out.println(box.content);
        // int content2 = box.content1;
        // 강제 타입 변환
        int content2 = (Integer)box.content;
        System.out.println(content2);


        // =================================================================/

        // 1. 클래스로 객체생성 할떄 <T> 제네릭 타입 정의
        Box2<String> box2 = new Box2<>();

        // 2.
        box2.content = "안녕하세요";
        System.out.println(box2.content);
        String content3 = box2.content;


        //
        Box2<Integer> box3 = new Box2<>();
        box3.content = 100;
        System.out.println(box3.content);
        int content4 = box3.content;

        // ======================================================================//
        // 만일 제네릭에 타입을 지정을 안했을때 자동으로 Object
        Box2 box4 = new Box2();




    }
}
