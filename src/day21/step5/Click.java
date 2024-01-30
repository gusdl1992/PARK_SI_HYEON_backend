package day21.step5;

public class Click implements Button.ClickListener{
    @Override
    public void onClick() {
        System.out.println("[ 구현 객체를 이용한 OK 버튼 클릭했습니다. ]");
    }
}
