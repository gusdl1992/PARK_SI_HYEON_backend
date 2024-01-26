package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardController {

    // 싱글톤
    private BoardController(){};
    private static BoardController boardController = new BoardController();
    public static BoardController getInstance(){return boardController;}

    // 카테고리 조회
    public ArrayList<CategoryDto> categorySearch(){
        // Dao categoryDto 리스트 넘기기
        // Dao 에서 받을 배열 담을 ArrayList c1 선언
        ArrayList<CategoryDto> c1 =  BoardDao.getInstance().categorySearch();

        // Dao categorySearch() 메서드 반환값 뷰로 리턴
        return c1;
    }
    // 글쓰기
    public int writing(BoardDto boardDto){
        // 1. 반환변수
        int result = 0;
        // 2. 고유 회원번호를 boardDto.setMno 에 대입
        boardDto.setMno( MemberController.getInstance().loginMno);
        // 3. DAO 에 boardDto 객체 넘겨준후 반환
        result = BoardDao.getInstance().writing(boardDto);
        return result;
    } // 글쓰기 끝

    // 전체 글보기 메서드
    public ArrayList<BoardDto> viewPost(){

        return null;
    }

}
