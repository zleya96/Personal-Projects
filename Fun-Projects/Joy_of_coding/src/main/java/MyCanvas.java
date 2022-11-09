import javax.swing.*;
import java.awt.*;

public class MyCanvas extends JPanel {

    public MyCanvas() {
        setPreferredSize(new Dimension(1000, 700));

        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Paintbrush myBrush = new Paintbrush(g);

        myBrush.drawSky();

        myBrush.drawMountains();
    }
}
