package 박시현개인연습.guiRPG;

import javax.swing.*;
import java.awt.FlowLayout;

public class Main {

    public static void main(String[] args) {
//
//        // 프레임 생성
//        JFrame frm = new JFrame("RPG 게임 연습");
//
//        // 프레임 크기 설정
//        frm.setSize(500 , 500);
//
//        // 프레임을 화면 가운데에 배치
//        frm.setLocationRelativeTo(null);
//
//        // 프레임을 닫았을 떄 메모리에서 제거 되도록 설정
//        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // ★ 레이아웃 설정
//        FlowLayout fLay = new FlowLayout();
//        frm.getContentPane().setLayout(fLay);
//
//        // ★ 버튼 생성
//        JButton btn1 = new JButton("슬라삐");
//        JButton btn2 = new JButton("슬라임");
//
//        // ★ 프레임에다가 버튼 추가
//        frm.getContentPane().add(btn1);
//        frm.getContentPane().add(btn2);
//
//        // 프레임이 보이도록 설정
//        frm.setVisible(true);


        // 프레임 생성
        JFrame frm = new JFrame("슬라임 퇴치하기");

        // 프레임 크기 설정
        frm.setSize(350, 300);

        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ★ 레이아웃 설정
        frm.getContentPane().setLayout(null);

        // 프레임이 보이도록 설정
        frm.setVisible(true);

        // ★ 컨텐츠 영역의 크기 표시
        System.out.println(frm.getContentPane().getSize());
    }
}
