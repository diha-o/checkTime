package com.dd.time;

import javax.swing.*;

/**
 * Created by User on 04.01.2017. //dd pc
 */
public class check_time_form extends JFrame {
    private JPanel rootJPanel;
    private JLabel label;


    public check_time_form(String welcomeText) {

        try {

            label.setText(welcomeText); // set text
            setContentPane(rootJPanel); //
            pack();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setVisible(true);
            System.out.print( "\n"+ "Form creating success");

        } catch (Exception e) {System.out.print("error while try creating form");  e.printStackTrace();};
    }

}
