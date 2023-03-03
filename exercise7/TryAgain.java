import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class TryAgain extends JFrame {
   TryAgain(){

    //JLabel
    JLabel imageLabel = new JLabel();
    //pepe image download from internet
    ImageIcon sadImage= new ImageIcon("sadge.gif");
    //Set image to label
    imageLabel.setIcon(sadImage);

    JButton tryAgainButton = new JButton();
    JButton exitButton = new JButton();

    //try again button
    tryAgainButton.setText("TRY AGAIN!");
    tryAgainButton.setFont(new Font("Times new roman", Font.BOLD, 18));
    //event for try again
    EventHandler tryHandler = new EventHandler();
    tryAgainButton.addActionListener(tryHandler);

    //exit button
    exitButton.setText("EXIT!");
    exitButton.setFont(new Font("Times new roman", Font.BOLD, 18));
    //Event for exit
    ExitHandler exit = new ExitHandler();
    exitButton.addActionListener(exit);

    //add frame 
    this.add(imageLabel);
    this.add(tryAgainButton);
    this.add(exitButton);


    //Frame Layout
    this.setLayout(new FlowLayout());
    //Frame Title
    this.setTitle("Snake Game");
    //terminates java program on close
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //Frame Size
    this.setSize(500,600);
    //puts frame in the middle
    this.setLocationRelativeTo(null);
    //make frame appear
    this.setVisible(true);
    //disable resize
    this.setResizable(false);
    //set bg color
    this.getContentPane().setBackground(Color.RED);
    
}
//Event Handler
private class EventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){
        //goes to game frame
        new MainMenu();
        //closes frame
        dispose();
    
    }
}
//event handler
private class ExitHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){

            //closes frame
            dispose();
        }
    
    }
}


