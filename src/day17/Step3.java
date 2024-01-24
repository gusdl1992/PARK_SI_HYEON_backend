package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {

    public static void main(String[] args) {
        // 입력 객체
        Scanner scanner = new Scanner(System.in);
        // DB 연동
        Connection connection = null; // try{} 와 while{} 에서 모두  사용하기 위해 선언만 먼저 작성
        try {
            // 1. JDBC 드라이버 로딩한다.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. db 서버와 연동 후 연동객체를 반환 받는다.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234"
            );
            // 3. DB 연동시 필요한 메소드 중에 Class.forName , getConnection 일반 예외 발생.
            System.out.println("< DB 연동 성공. >");

        }catch (Exception e){
            System.out.println("<오류 발생>" + e);
        }

        while (true){ // 무한 루프

            System.out.println("  고객명단 : 1.삽입 2.출력 3.수정 4.삭제");
            System.out.print("선택 > ");

            try {

                int ch = scanner.nextInt(); // 만일 int 타입 범위 벗어난 입력시 오류 발생

                if ( ch == 1 ){
                    // 1. 입력받기
                    System.out.print("저장 고객명 : "); String name = scanner.next();
                    // 2. DB에 저장한다. // SQLException 예외처리 필수
                    // connection.prepareStatement("insert into members values('유재석'); ").executeUpdate();
                    // String sql = "insert into member values('입력받은값')"
                    String sql = "insert into members values('"+ name +"')";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                } else if ( ch == 2 ) {

                } else if ( ch == 3 ) { // 수정
                    // 1. 입력받기
                    System.out.print("수정할 고객명 : "); String oldName = scanner.next();
                    System.out.print("새로운 고객명 : "); String newName = scanner.next();
                    // 2. DB에 수정처리 한다.
                    // String sql = "update members set name = '"+ 새로운고객명 +"' where name = '"+ 기존고객명 +"'; ";
                    String sql = "update members set name = '"+ newName +"' where name = '"+ oldName +"'; ";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                } else if ( ch == 4 ) {
                    // 1. 입력받기 // 누구를 삭제할 껀지 입력
                    System.out.print("삭제할 고객명 : "); String deleteName = scanner.next();
                    // 2. db에 삭제처리한다. // String sql = "delete from members where name = '삭제할 고객명' ";
                    String sql = "delete from members where name = '"+ deleteName +"' ";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                }

            }catch (InputMismatchException e){
                System.out.println("<시스템오류> 정상적인 입력값이 아닙니다." + e );
                scanner = new Scanner(System.in); // 기존에 입력받은 바이트를 지우기/초기화
            }catch (SQLException e){
                System.out.println("<시스템오류> SQL 에서 오류가 발생했습니다." + e );
            } // catch end


        } // w e
    } // m e
} //  c e
