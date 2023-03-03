import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;


public class MainMenu extends JFrame{
    MainMenu(){

        //JLabel
        JLabel imageLabel = new JLabel();
        //pepe image download from internet
        ImageIcon frogImage= new ImageIcon("pepe3.gif");
        //Set image to label
        imageLabel.setIcon(frogImage);
    

        //JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Times new roman", Font.BOLD, 25));

        //add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        //Add label to frame
        this.add(imageLabel);
        this.add(startButton);
        //Frame Layout
        this.setLayout(new FlowLayout());

        //Frame Title
        this.setTitle("Snake Game");
        //terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Frame Size
        this.setSize(700,500);
        //puts frame in the middle
        this.setLocationRelativeTo(null);
        //make frame appear
        this.setVisible(true);
        //disable resize
        this.setResizable(false);
        //set bg color
        this.getContentPane().setBackground(Color.MAGENTA);

    }
    //Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            //goes to color menu
            new ColorMenu();
            //closes frame
            dispose();



        }
    }
}
