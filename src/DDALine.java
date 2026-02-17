import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DDALine extends JPanel {

    public void drawLineDDA(Graphics g, int x0, int y0, int x1, int y1) {

        int dx = x1 - x0;
        int dy = y1 - y0;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xInc = (float) dx / steps;
        float yInc = (float) dy / steps;

        float x = x0;
        float y = y0;

        for (int i = 0; i <= steps; i++) {
            g.fillRect(Math.round(x), Math.round(y), 1,1);
            x += xInc;
            y += yInc;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point (x0 y0): ");
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        System.out.println("Enter the coordinates of the second point (x1 y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        super.paintComponent(g);
        drawLineDDA(g, x0, y0, x1, y1);

        //drawLineDDA(g, 100, 100, 400, 400);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DDA Line Drawing");
        DDALine panel = new DDALine();

        frame.add(panel);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

