package 박시현개인연습.조별과제2_연습;

public class Member {

    static int count = 0;

    String id;
    String pw;
    String name;
    String rrn;
    String phone;
    int memberNum;

    Member(String id, String pw, String name, String rrn, String phone){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.rrn = rrn;
        this.phone = phone;
        this.memberNum = count;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", rrn='" + rrn + '\'' +
                ", phone='" + phone + '\'' +
                ", memberNum=" + memberNum +
                '}';
    }

}
