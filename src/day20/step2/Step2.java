package day20.step2;

public class Step2 {

    public static void main(String[] args) {

        RemoteControl2 rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
        System.out.println(rc.toString());
        // rc.search("주소");
        Searchable rc2 = (Searchable)rc;  // 형변환
        rc2.search("주소1");          // rc 랑 rc2 랑 같은 주소
        System.out.println(rc2.toString());

        Searchable searchable = new SmartTelevision();

        searchable.turnOn();
        // searchable.turnOff();
        searchable.search("주소");



    } // m e
} // c e
