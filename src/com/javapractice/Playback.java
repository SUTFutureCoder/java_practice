package com.javapractice;

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {

    public Playback() {
        super("Playback");
        setLookAndFeel();
        setSize(225, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        add(play);
        add(stop);
        add(pause);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        Playback pb = new Playback();
    }

}
