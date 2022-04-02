package HomeWork;
import javax.swing.*;
import java.awt.*;

public class Border2 {
      public static class MyWindow extends JFrame {
            public MyWindow() {
             setBounds(500, 500, 400, 400);
             setTitle("FlowLayoutDemo");
             setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
             JButton[] jbs = new JButton[10];
             setLayout(new FlowLayout());
             for (int i = 0; i < jbs.length; i++) {
                 jbs[i] = new JButton("#" + i);
                 jbs[i].setPreferredSize(new Dimension(200, 30));
                 add(jbs[i]);
                }
                setVisible(true);
            }
        }
       public static void main(String[] args) {
           new MyWindow();
    }
}
