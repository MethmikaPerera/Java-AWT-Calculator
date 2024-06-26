package gui;

import java.awt.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author mamet
 */
class close extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;

    String fv, sv, op;
    Double fdv, sdv, tot;

    public Cal() {
        Frame f = new Frame();
        f.addWindowListener(new close());
        f.setBackground(Color.darkGray);
        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(500, 600);
        f.setLocationRelativeTo(null);

        //Fonts
        Font f1 = new Font("Poppins", Font.BOLD, 30);
        Font f2 = new Font("Quicksand", Font.BOLD, 30);
        Font f3 = new Font("Quicksand", Font.BOLD, 40);

        //Menu Bar
        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("File");
        MenuItem mi1 = new MenuItem("New Cal");
        m1.add(mi1);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        mb.add(m1);
        mb.add(m2);

        f.setMenuBar(mb);

        //Panels
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(5, 4, 4, 4);
        p2.setLayout(g1);
        p2.setBackground(Color.DARK_GRAY);
        
        //Text Field
        tf = new TextField(20);
        tf.setFont(f3);
        tf.setEditable(false);
        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.WHITE);
        tf.setText("0");

        p1.add(tf);

        //Buttons
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("x");
        b14 = new Button("/");
        b15 = new Button("%");
        b16 = new Button("+/-");
        b17 = new Button("√");
        b18 = new Button(".");
        b19 = new Button("CE");
        b20 = new Button("=");

        //Button Background Color
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        b10.setBackground(Color.WHITE);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.LIGHT_GRAY);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        b16.setBackground(Color.LIGHT_GRAY);
        b17.setBackground(Color.LIGHT_GRAY);
        b18.setBackground(Color.LIGHT_GRAY);
        b19.setBackground(Color.LIGHT_GRAY);
        b20.setBackground(Color.BLUE);

        //Button Foreground Color
        b20.setForeground(Color.WHITE);

        //Button Font
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
        b10.setFont(f1);
        b11.setFont(f1);
        b12.setFont(f1);
        b13.setFont(f1);
        b14.setFont(f1);
        b15.setFont(f1);
        b16.setFont(f1);
        b17.setFont(f1);
        b18.setFont(f1);
        b19.setFont(f1);
        b20.setFont(f1);

        //Add Buttons to Panel
        p2.add(b19); //1
        p2.add(b15); //2
        p2.add(b17); //3
        p2.add(b14); //4
        p2.add(b7); //5
        p2.add(b8); //6
        p2.add(b9); //7
        p2.add(b13); //8
        p2.add(b4); //9
        p2.add(b5); //10
        p2.add(b6); //11
        p2.add(b12); //12
        p2.add(b1); //13
        p2.add(b2); //14
        p2.add(b3); //15
        p2.add(b11); //16
        p2.add(b16); //17
        p2.add(b10); //18
        p2.add(b18); //19
        p2.add(b20); //20

        //Button Event Listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        
        //Add Panels to Frame
        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent d) {
        Object o = d.getSource();

        if (o.equals(b1)) {
            if (tf.getText().equals("0")) {
                tf.setText(b1.getLabel());
            } else {
                tf.setText(tf.getText() + b1.getLabel());
            }
        } else if (o.equals(b2)) {
            if (tf.getText().equals("0")) {
                tf.setText(b2.getLabel());
            } else {
                tf.setText(tf.getText() + b2.getLabel());
            }
        } else if (o.equals(b3)) {
            if (tf.getText().equals("0")) {
                tf.setText(b3.getLabel());
            } else {
                tf.setText(tf.getText() + b3.getLabel());
            }
        } else if (o.equals(b4)) {
            if (tf.getText().equals("0")) {
                tf.setText(b4.getLabel());
            } else {
                tf.setText(tf.getText() + b4.getLabel());
            }
        } else if (o.equals(b5)) {
            if (tf.getText().equals("0")) {
                tf.setText(b5.getLabel());
            } else {
                tf.setText(tf.getText() + b5.getLabel());
            }
        } else if (o.equals(b6)) {
            if (tf.getText().equals("0")) {
                tf.setText(b6.getLabel());
            } else {
                tf.setText(tf.getText() + b6.getLabel());
            }
        } else if (o.equals(b7)) {
            if (tf.getText().equals("0")) {
                tf.setText(b7.getLabel());
            } else {
                tf.setText(tf.getText() + b7.getLabel());
            }
        } else if (o.equals(b8)) {
            if (tf.getText().equals("0")) {
                tf.setText(b8.getLabel());
            } else {
                tf.setText(tf.getText() + b8.getLabel());
            }
        } else if (o.equals(b9)) {
            if (tf.getText().equals("0")) {
                tf.setText(b9.getLabel());
            } else {
                tf.setText(tf.getText() + b9.getLabel());
            }
        } else if (o.equals(b10)) {
            if (tf.getText().equals("0")) {
                tf.setText(b10.getLabel());
            } else {
                tf.setText(tf.getText() + b10.getLabel());
            }
        } else if (o.equals(b11)) {
            sv = tf.getText();
            op = b11.getLabel();
            tf.setText("0");
        } else if (o.equals(b12)) {
            sv = tf.getText();
            op = b12.getLabel();
            tf.setText("0");
        } else if (o.equals(b13)) {
            sv = tf.getText();
            op = b13.getLabel();
            tf.setText("0");
        } else if (o.equals(b14)) {
            sv = tf.getText();
            op = b14.getLabel();
            tf.setText("0");
        } else if (o.equals(b15)) {
            sv = tf.getText();
            op = b15.getLabel();
            tf.setText("0");
        } else if (o.equals(b16)) {
            sv = tf.getText();
            op = b16.getLabel();
            tf.setText("0");
        } else if (o.equals(b17)) {
            sv = tf.getText();
            sdv = Double.parseDouble(sv);
            tf.setText("0");
            tot = Math.sqrt(sdv);
            tf.setText(tot + "");
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText("0");
            sv = null;
            op = null;
            fv = null;
            fdv = null;
            sdv = null;
            tot = null;
        } else if (o.equals(b20)) {
            fv = tf.getText();

            sdv = Double.parseDouble(sv);
            fdv = Double.parseDouble(fv);
            tf.setText("");

            if (op.equals("+")) {
                tot = sdv + fdv;
                tf.setText(tot + "");
            } else if (op.equals("-")) {
                tot = sdv - fdv;
                tf.setText(tot + "");
            } else if (op.equals("x")) {
                tot = sdv * fdv;
                tf.setText(tot + "");
            } else if (op.equals("/")) {
                tot = sdv / fdv;
                tf.setText(tot + "");
            } else if (op.equals("%")) {
                tot = sdv * fdv / 100;
                tf.setText(tot + "");
            }
        }
    }
}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }
}
