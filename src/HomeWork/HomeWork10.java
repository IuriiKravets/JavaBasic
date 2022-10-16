package HomeWork;
/*
@ HomeWork 10
@ autor Iurii Kravets.
@ todo 10.10.2022
@ date 16.10.2022
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HomeWork10 extends JFrame{

    final  Color [] COLORS = {Color.red, Color.green,Color.blue, Color.magenta,
            Color.cyan,Color.orange,Color.pink, Color.black};
    private Random random = new Random();


    public static void main(String[] args) {
        new JavaBasic.Lesson10();
    }

    public HomeWork10() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,500);

        HomeWork10.CanvasPanel canvasPanel = new HomeWork10.CanvasPanel();
        canvasPanel.setBackground(Color.white);

        Button button = new Button("Repaint");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repaint");
                canvasPanel.repaint();
            }
        });

        add(canvasPanel,BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < 500; i++) {
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                int x = random.nextInt(500);
                int y = random.nextInt(400);
                int dx = random.nextInt(100);
                int dy = random.nextInt(100);
                if (random.nextBoolean()) {
                    g.fillRect(x,y,dx,dy);
                }else {
                    g.fillOval(x,y,dx,dy);
                }
            }
        }
    }
}
