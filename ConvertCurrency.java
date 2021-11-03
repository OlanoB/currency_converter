package hhu;
//OLANO, SARRA & LISA Group Project-- 
//Java program for currency converter
//Chinese Yuan to Dollar and vice-versa
//Using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class ConvertCurrency {

 // Function to convert from Yuan
 // to Dollars and vice-versa
 // using Java Swing
 public static void converter()
 {
     // Creating a new frame using JFrame
     JFrame f = new JFrame("SOL Currency Converter");
     // Creating two labels
     JLabel l1, l2;
     // Creating two text fields.
     // One for Yuan and one for
     // the dollar
     JTextField t1, t2;
     // Creating three buttons
     JButton b1, b2, b3, b4, b5;
     // Naming the labels and setting
     // the bounds for the labels
     l1 = new JLabel("YUAN:");
     l1.setBounds(20, 40, 60, 30);
     l2 = new JLabel("USD:");
     l2.setBounds(170, 40, 60, 30);
     // Initializing the text fields with
     // 0 by default and setting the
     // bounds for the text fields
     t1 = new JTextField("0");
     t1.setBounds(70, 40, 90, 30);
     t2 = new JTextField("0");
     t2.setBounds(210, 40, 90, 30);

     // Creating a button for INR,
     // one button for the dollar
     // and one button to close
     // and setting the bounds
     b1 = new JButton("To USD");
     b1.setBounds(50, 80, 110, 30);
     b2 = new JButton("To RMB");
     b2.setBounds(190, 80, 110, 30);
     b3 = new JButton("Exit/Close");
     b3.setBounds(120, 125, 110, 30);
     b4 = new JButton("Reset");
     b4.setBounds(120, 160, 110, 30);
     b5 = new JButton("HHU-SOL");
     b5.setBounds(120, 195, 110, 30);

     // Adding action listener
     b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
             // Converting to double
             double d
                 = Double.parseDouble(t1.getText());
             // Converting RMB to dollars
             double d1 = (d * 0.15);
             // Getting the string value of the
             // calculated value
             String str1 = String.valueOf(d1);
             // Placing it in the text box
             t2.setText(str1);
         }
     });
     // Adding action listener
     b2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
             // Converting to double
             double d2
                 = Double.parseDouble(t2.getText());
             // converting Dollars to RMB
             double d3 = (d2 * 6.46);
             // Getting the string value of the
             // calculated value
             String str2 = String.valueOf(d3);
             // Placing it in the text box
             t1.setText(str2);
         }
     });
     // Action listener to close the form
     b3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
             f.dispose();
         }
     });
     b4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
        	// Resetting Text Field 2
             String str5 = String.valueOf("");
             // Placing it in the text box
             t2.setText(str5);
             
          // Resetting Text Field 2
             String str6 = String.valueOf("");
             // Placing it in the text box
             t1.setText(str6);
         }
     });
     // Default method for closing the frame
     f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e)
         {
             System.exit(0);
         }
     });
     // Adding the created objects
     // to the form
     f.add(l1);
     f.add(t1);
     f.add(l2);
     f.add(t2);
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(b4);
     f.add(b5);

     f.setLayout(null);
     f.setSize(400, 300);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setLocationRelativeTo(null);
     //f.setLayout(new FlowLayout());
 }
 // Driver code
 public static void main(String args[])
 {
     converter();
 }
}