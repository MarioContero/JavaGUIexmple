import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        JFrame frame = new JFrame("Mi primera vez ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        JButton button = new JButton("Press");
        JButton button2 = new JButton("Press2");
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }
}
