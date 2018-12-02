package com.drools.cartoons;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Goji {
    private JFrame frame;
    private JButton yes;
    private JButton no;
    private JTextField question;
    private JTextArea cartoons;

    private boolean clickedYes = false;
    private boolean clickedNo = false;

    public Goji() {
        frame = new JFrame("Cartoons");
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setResizable(false);

        spawnYesButton();
        spawnNoButton();
        spawnQuestion();
        spawnCartoons();

        frame.add(question);
        frame.add(yes);
        frame.add(no);
        frame.add(cartoons);
        frame.setVisible(true);
    }

    public Decision answerQuestion(Question q) {
        question.setText(q.getQuestion());

        while (true) {
            if (clickedYes) {
                clickedYes = false;
                return Decision.YES;
            }

            if (clickedNo) {
                clickedNo = false;
                return Decision.NO;
            }

            sleepSilent();
        }
    }

    public void showCartoons(List<String> cartoons) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < cartoons.size(); i++) {
            if (i > 0)
                s.append("\n");
            s.append(cartoons.get(i));
        }

        System.out.println(s);
        this.cartoons.setText(s.toString());
    }

    private void spawnYesButton() {
        yes = new JButton("Yes");
        yes.setVisible(true);
        yes.setSize(100, 50);
        yes.setLocation(250, 50);
        yes.addActionListener(e -> {
            clickedYes = true;
        });
    }

    private void spawnNoButton() {
        no = new JButton("no");
        no.setVisible(true);
        no.setSize(100, 50);
        no.setLocation(250, 100);
        no.addActionListener(e -> {
            clickedNo = true;
        });
    }

    private void spawnQuestion() {
        question = new JTextField();
        question.setEnabled(false);
        question.setVisible(true);
        question.setSize(600, 50);
        question.setLocation(0, 0);
        question.setFont(new Font("Serif", Font.PLAIN, 16));
        question.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void spawnCartoons() {
        cartoons = new JTextArea();
        cartoons.setEnabled(false);
        cartoons.setVisible(true);
        cartoons.setSize(500, 250);
        cartoons.setLocation(50, 150);
        cartoons.setFont(new Font("Serif", Font.PLAIN, 16));
    }


    private void sleepSilent() {
        try {
            Thread.sleep(100, 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
