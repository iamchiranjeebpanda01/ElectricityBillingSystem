package Electricity;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener{ //JFrame is a container in Java.swing class that helps to create the GUI for the application.
                                                            /*ActionListener is notified whenever a button or menu item is clicked. Found in java.awt.event package.
                                                            Only one method with this interface actionPerformed(). actionPerformed() is invoked automatically whenever
                                                            we click on a registered component.
                                                             */
    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About(){
        setLayout(null); /*setLayout() allows to set the layout of the container(JFrame).
                            setLayout(null) lets us to position our components with no restrictions. */

        JButton b1 = new JButton("Exit");               /*JButton is used to create labeled button that has platform independent implementation.
                                                               The application result in some action when the button is pushed. Found in java.swing package. */
        add(b1);    //adding button in JFrame
        b1.setBounds(180,430,120,20);  //JButton's position in x and y axis, width and height of JButton
        b1.addActionListener(this);  // Registering JButton 'b1' with the ActionListener

        Font f = new Font("RALEWAY",Font.BOLD,180); //Font class from java.aws package.
        setFont(f); //Method from JFrame class that sets the general fount used in the JFrame.

        s = "                           About Project                          \n"
           +"Electricity billing system is a software based application "
           +"developed in Java Programming Language. The Project aims at serving "
           +"the department of electricity by computerizing the billing system. "
           +"It mainly focuses on the calculation of units consumed during the "
           +"specified time and the money to be paid to the electricity offices. "
           +"This computerized system will make the overall billing system easy, "
           +"accessible,  comfortable and effective for consumer.\n\n";

        TextArea t1 = new TextArea(s,10,40,Scrollbar.VERTICAL);  //Objects of TextArea class are multiline region that displays text.
        t1.setEditable(false); //setEditable method allows to type into the textArea or not, according to boolean parameter passed.
        t1.setBounds(20,100,450,300); //TextArea's positions in x and y axis and width and height
        add(t1); //adding  TextArea in JFrame.

        Font f1  = new Font("RALEWAY",Font.BOLD,16);
        t1.setFont(f1);

        Container contentPage = this.getContentPane(); //Objects of container class holds gathering of component objects.
                                                        //Content Pane: Most basic layout tile that is used to hold objects.
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project"); //Used to display a single line of read only text. Found in javax.swing package.
        add(l1);  //adding JLabel to JFrame
        l1.setBounds(170,10,180,80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY",Font.BOLD,20);
        l1.setFont(f2);

        setBounds(700,220,500,550);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
