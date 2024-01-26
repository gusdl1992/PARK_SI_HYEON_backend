package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {

    // 싱글톤
    private BoardView(){}
    private static BoardView boardView = new BoardView();
    public static BoardView getInstance(){
        return boardView;
    }
    // 입력객체
    Scanner scanner = new Scanner(System.in);


    // 0.로그인 성공시 출력되는 화면.
    public void run(){
        while (true){
            System.out.println("==================== ezen게시판 ========================");
            // 추후에 현재 게시물 출력 메소드 가 들어갈 자리
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택 > "); int ch = scanner.nextInt();

            if (ch == 1){
                writing();
            }
            else if( ch == 2 ){}
            else if(ch == 3){
                System.out.println("<안내>로그아웃이 되었습니다.");
                MemberController.getInstance().logout(); // 회원컨트롤러에 로그아웃 처리 요청
                return; // 현재 메소드 종료.
            }

        } // w e
    } // run m e

    // 카테고리조회 메서드
    public void categorySearch(){
        // 카테고리 조회
        ArrayList<CategoryDto> categoryDtoArrayList = new ArrayList<>();
        CategoryDto categoryDto = new CategoryDto();
        // 객체 넘기기
        categoryDtoArrayList = BoardController.getInstance().categorySearch(categoryDtoArrayList);
        // 결과 처리
        int conut = 0;
        for (CategoryDto i : categoryDtoArrayList){
            System.out.print(categoryDtoArrayList.get(conut).getGno()+ ".  ");
            System.out.print(categoryDtoArrayList.get(conut).getBcategory());
            System.out.print("\t\t");
            conut++;
        }

        System.out.println();

    }


    // 글쓰기 메서드
    public void writing(){
        // 0. 카테고리조회
        categorySearch();
        // 1. 입력받기
        System.out.print("카테고리를 선택해주세요."); int canum = scanner.nextInt();
        scanner.nextLine(); // 엔터값 초기화
        System.out.print("제목을 입력해주세요."); String btitle = scanner.next();
        System.out.print("내용을 입력해주세요."); String bcontent = scanner.next();
        // 2. 객체화
        BoardDto boardDto = new BoardDto(btitle , bcontent);
        boardDto.setGno(canum);
        // 3. 컨트롤러 전달
        int result = BoardController.getInstance().writing(boardDto);
        
        // 4. 결과처리
        if(result == 0){
            System.out.println("글등록 성공!");
        }else {
            System.out.println("글등록 실패");
        }

        // 5. 함수종료
    }

} // c e
