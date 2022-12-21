import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends  JFrame{
    GamePanel panel ;
    private JButton btn;

    public GameFrame() {
        //select_menu = new MenuPanel();

        super("Hello World");

        setLayout(new BorderLayout());

 
        btn = new JButton("Mode 2V2");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel = new GamePanel();

                add(panel);
                setTitle("Pong Game");
                setResizable(false);
                setBackground(Color.BLACK);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pack();
                setVisible(true);
                setLocationRelativeTo(null);

            }
        });


        add(btn, BorderLayout.CENTER);
        setBackground(Color.BLACK);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);




    }
}
