package 박시현개인연습.guiRPG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JWindowExample {


    public static void main(String[] args) {
        JWindow jWindow = new JWindow();


            // 창 크기
            jWindow.setSize(600 , 350 );

            // 화면중앙 정렬
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();
            int lftX = centerPoint.x - jWindow.getWidth()/2;
            int lftY = centerPoint.y - jWindow.getHeight()/2;
            jWindow.setLocation(lftX , lftY);

            // JWindow 이미지 포함된 Jlabel 추가
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(JWindowExample.class.getResource("game.png")));
            jWindow.getContentPane().add(label , BorderLayout.CENTER);

            // 마우스 클릭 이벤트 처리
            jWindow.addMouseListener(new MouseAdapter() {
                @Override
                // 마우스 체크 시 이벤트 발생
                public void mouseClicked(MouseEvent e) {
                    // jWindow 제거
                    System.out.println(e);
                    jWindow.setSize(300 , 200 );
                    // jWindow.dispose();
                }
            });

            jWindow.setVisible(true);
    }

} // c e
