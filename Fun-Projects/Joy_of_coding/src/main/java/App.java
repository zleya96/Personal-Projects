import javax.swing.*;

public class App {
    public static void main(String[] args) {
        //create window frame and set title in the toolbar
        JFrame window = new JFrame("My First Java Painting");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyCanvas canvas = new MyCanvas();
        //give myself something to actually draw on
        window.add(canvas);

        //fit the window around my components(aka my canvas)
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null); //set window to center of screen
        window.setVisible(true);
    }
}
