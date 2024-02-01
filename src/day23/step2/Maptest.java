package day23.step2;

public class Maptest {
    public static void main(String[] args) {

        SimpleHashMap<String ,Integer> simpleHashMap = new SimpleHashMap<>();
        simpleHashMap.add("유재석" , 50);
        simpleHashMap.add("강호동" , 40);
        simpleHashMap.add("신동엽" , 80);
        simpleHashMap.add("서장훈" , 60);
        simpleHashMap.add("유재석" , 90);
        System.out.println("리스트의 상태" + simpleHashMap);
        System.out.println(simpleHashMap.size());
        System.out.println("서장훈 값 호출 :" + simpleHashMap.get("서장훈"));

        // 삭제
        simpleHashMap.remove("신동엽");
        System.out.println("리스트의 상태" + simpleHashMap);


    }// m e
} // c e
