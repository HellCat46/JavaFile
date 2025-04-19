import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

class Program6 extends Frame implements MouseListener {
    int radius, xLoc, yLoc;
    boolean initDraw = true;

    Program6() {
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        addMouseListener(this);
    }
    @Override
    public void paint(Graphics g) {
        if(initDraw) return;
        if(radius < 500) {
            Graphics2D g2d = (Graphics2D) g;
            Ellipse2D circle = new Ellipse2D.Double(xLoc, yLoc, radius, radius);
            radius += 50;
            xLoc -= 20;
            yLoc -= 20;
            g2d.draw(circle);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            repaint();
        }else {
            radius =0;
        }
    }

    public void mouseClicked(MouseEvent e) {
        initDraw = false;
        repaint();
        xLoc = e.getX();
        yLoc = e.getY();
    }


    public static void main(String[] args){
        new Program6();
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}