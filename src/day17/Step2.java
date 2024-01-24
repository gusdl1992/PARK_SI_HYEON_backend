package day17;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step2 {

    public static void main(String[] args) {
        Connection connection;

        // 1. DB 연동
            // 1. mysql 드라이버를 메모리에 로딩한다.
            // 2. 예외처리 필수 : try{} catch(예외클래스명 매개변수){}
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 위에서 등록된 드라이버객체를 이용한 DB 연동 ( jdbc:mysql://ip 번호:port 번호/db명 , 계정 , 비밀번호 )
            // * 예외처리 필수! : try{} catch(예외클래스명 매개변수){} // SQLException ( 오류발생이유 )
            // * 연동성공시 반환객체 : Connection 객체 ( statement ) 구현객체 생성, 트랜잭션 처리 , DB 연결 끓을때 사용
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234"
            );
            System.out.println("DB 연동 성공!");

            // 3. SQL 작성하고 SQL 실행
            // [ C ]
            connection.prepareStatement("insert into table1 values( 1 , '유재석')").executeUpdate();
            // [ U ]
            connection.prepareStatement("update table1 set 데이터필드2 = '강호동' ").executeUpdate();
            // [ D ]
            connection.prepareStatement("delete from table1").executeUpdate();

        }catch (ClassNotFoundException e){
            System.out.println("오류발생 " + e);
        }catch (SQLException e){
            System.out.println("오류발생" + e);
        }



    }
}
