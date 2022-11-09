import javax.swing.*;
import java.awt.event.KeyListener;

public class Application {

    public static void main(String[] args) {
        // invokeLater() is used here to prevent our graphics processing from
        // blocking the GUI. https://stackoverflow.com/a/22534931/4655368
        // this is a lot of boilerplate code that you shouldn't be too concerned about.
        // just know that when main runs it will call initWindow() once.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initWindow();
            }
        });
    }
    private static void initWindow() {
        JFrame window = new JFrame("This is my game!!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Board board = new Board(); //create jpanel to draw on; also initializes game loop

        window.add(board); // add the jpanel to the window

        window.addKeyListener(board); // pass keyboard inputs to jpanel

        window.setResizable(false);



        window.pack(); // fit the window size around the components (just our jpanel).
                        // pack() should be called after setResizable() to avoid issues on some platforms
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
