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
        ArrayList<CategoryDto> c1 =  BoardDao.getInstance().categorySearch();

        return c1;
    }
    // 글쓰기
    public int writing(BoardDto boardDto){
        // 1. 반환변수
        int result = 0;
        boardDto.setMno( MemberController.getInstance().loginMno);
        result = BoardDao.getInstance().writing(boardDto);
        return result;
    }

}
