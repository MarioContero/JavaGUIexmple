import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
    JFrame frame = new JFrame("Chat Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLayout(new BorderLayout());    

        //creacion  de menu de ventana
    JMenuBar menuBar = new JMenuBar();
    JMenu filewJMenu = new JMenu("Archivo");
    JMenu helpMenu = new JMenu("Ayuda");
    menuBar.add(filewJMenu);
    menuBar.add(helpMenu);

    JMenuItem openItem = new JMenuItem("Abrir");
    JMenuItem saveItem = new JMenuItem("Guardar como");
    filewJMenu.add(openItem);
    helpMenu.add(saveItem);

    // creacion de panel
        
    JPanel panel = new JPanel(); //no es visible
    JLabel messageLabel = new JLabel("Mensaje:  ");
    JTextField chatTextField = new JTextField(10);
    JButton sendButton = new JButton("Enviar ");
    JButton resetButton = new JButton("Restablecer");
    panel.setLayout(new FlowLayout()); //agregando valores con panel
    panel.add(messageLabel);
    panel.add(chatTextField);
    panel.add(sendButton);
    panel.add(resetButton);

    // area de texto en el centro
    JTextArea chatHistory = new JTextArea();

    //agregar componente al marco}
    frame.getContentPane().add(BorderLayout.SOUTH, panel);
    frame.getContentPane().add(BorderLayout.NORTH, menuBar);
    frame.getContentPane().add(BorderLayout.CENTER, chatHistory);
    frame.setVisible(true);

    
    }
}
