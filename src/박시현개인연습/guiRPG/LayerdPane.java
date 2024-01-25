package 박시현개인연습.guiRPG;

import javax.swing.*;
import java.awt.*;

public class LayerdPane {

    public static void main(String[] args) {

        // JFrame jFrame = new JFrame();

        // JWindow 게임애플리케이션 처럼 제목표시줄이 없는 윈도우
        JWindow jWindow = new JWindow();
        // 창 사이즈
        jWindow.setSize(500 , 500);
        // 그래픽 환경 정보 객체
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // 화면 중앙지점의 x 좌표 y좌표 리턴
        Point centerPoint = ge.getCenterPoint();
        // 화면 크기만큼 빼고 가운데 출력
        int leftTopX = centerPoint.x - jWindow.getWidth()/2;
        int leftTopY = centerPoint.y - jWindow.getHeight()/2;
        // 초기 실행 위치
        jWindow.setLocation(leftTopX , leftTopY);

        // 사이즈
        // jFrame.setSize(500 , 500);

        // 상위 메뉴 보여주는 MenuBar 추가 getContentPane 없이 바로 추가 가능
        //jFrame.setJMenuBar(new JMenuBar());

        // 버튼과 같은 UI 컴포넌트는 직접배치 불가 getContentPane() 메소드를 이용해서 ContentPane 얻은후에 배치해야함
        //jFrame.getContentPane().add(new JButton("확인") , BorderLayout.SOUTH);


        jWindow.getContentPane().add(new JButton("확인") , BorderLayout.SOUTH);
        // LayeredPane 컴포넌트들이 겹쳐질때 상하 위치 결정 z-index 개념인듯


        // 윈도우를 보여줌
        // jFrame.setVisible(true);

        // 윈도우를 보여줌
        jWindow.setVisible(true);



        // Jwindow 화면에서 완전 제거
        // jWindow.dispose();
    } // m e
} // c e
