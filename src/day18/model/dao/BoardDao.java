package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends Dao{

    // 싱글톤
    private BoardDao(){}
    private static BoardDao boardDao = new BoardDao();
    public  static BoardDao getInstance(){ return boardDao; }

    // 카테고리 조회
    public ArrayList<CategoryDto> categorySearch(){
        // try 안쪽에 ArrayList 선언시
        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
        try {
            // 1.sql 작성한다.
            String sql = "select * from category ORDER BY gno ASC";

            // 2. sql 기재한다.
            ps = conn.prepareStatement(sql);
            // 3. sql 실행
            rs = ps.executeQuery();

            // 4. sql 결과처리
            while (rs.next()){
                CategoryDto categoryDto1 = new CategoryDto();
                categoryDto1.setGno(rs.getInt("gno"));
                categoryDto1.setBcategory(rs.getString("bcategory"));
                categoryDtos.add(categoryDto1);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return categoryDtos;
    }

    // 글쓰기
    public int writing(BoardDto boardDto){
        try {
            // 1. sql 작성
            String sql = "insert into board( btitle , bcontent , gno , mno) values( ? , ? , ? , ?) ";
            // 2. sql 기재
            ps = conn.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setInt(3, boardDto.getGno());
            ps.setInt(4,boardDto.getMno());
            // 3 실행
            int count = ps.executeUpdate();
            if (count == 1){return 0;} // 성공
        }catch (Exception e){
            System.out.println(e);
        }

        return 1; // 실패
    } // 글쓰기 끝

    // 전체 글보기 메서드
    public ArrayList<BoardDto> viewPost(){

        return null;
    }
}
