package 박시현개인연습.guiRPG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {

    public static void main(String[] args) {
        // JFrame 객체 생성
        JFrame jFrame = new JFrame();

        // 제목 설정
        jFrame.setTitle("제목");

        // 윈도우 크기 설정
        jFrame.setSize(800 , 600);
        // 시작시 시작 위치 설정
        jFrame.setLocation(200 , 100);
        // Jbutton 추가 AWT : Button ---- >    Swing : JButton  스윙은 J가 들어간다.
        jFrame.getContentPane().add(new JButton("OK") , BorderLayout.SOUTH);
        // AWT 버튼 추가
        jFrame.getContentPane().add(new Button("123") , BorderLayout.NORTH);
        // 윈도우 종료 버튼 클릭하면 프로세스 종료
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }); // m e

        // 이벤트 큐에 Runnable 넣기 ( 이벤트 디스패칭 스레드 )
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                // 윈도우를 보여줌
                jFrame.setVisible(true);
                System.out.println(Thread.currentThread().getName());

            }
        });

        } // main end

    } // c e

