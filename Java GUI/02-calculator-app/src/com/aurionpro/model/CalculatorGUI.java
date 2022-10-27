package com.aurionpro.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {

	JFrame frame;
	JTextField text;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bEq, bDel, bDec, bClr;
	static double a = 0, b = 0, result = 0;
	static int operator = 0;

	public CalculatorGUI() {
		frame = new JFrame("Calculator");

		frame.setBounds(20, 20, 290, 370);
		frame.setResizable(true);
		Font font = new Font("Arial", Font.BOLD, 20);
		Font fontDelClr = new Font("Arial", Font.BOLD, 15);
		text = new JTextField();
		text.setFont(font);
		final Color VERY_LIGHT_YELLOW = new Color(255,255,204);
		text.setBackground(VERY_LIGHT_YELLOW);
		text.setForeground(Color.BLACK);
		text.setBounds(40, 40, 200, 50);

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		
		bAdd = new JButton("+");
		bSub = new JButton("-");
		bMul = new JButton("*");
		bDiv = new JButton("/");
		
		bEq = new JButton("=");
		bDec = new JButton(".");
		bDel = new JButton("Delete");
		bClr = new JButton("Clear");
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);
		b7.setFont(font);
		b8.setFont(font);
		b9.setFont(font);
		b0.setFont(font);
		bAdd.setFont(font);
		bSub.setFont(font);
		bMul.setFont(font);
		bDiv.setFont(font);
		bEq.setFont(font);
		bDec.setFont(font);
		bDel.setFont(fontDelClr);
		bClr.setFont(fontDelClr);
		
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);
		b9.setForeground(Color.WHITE);
		b0.setForeground(Color.WHITE);
		bAdd.setForeground(Color.WHITE);
		bSub.setForeground(Color.WHITE);
		bMul.setForeground(Color.WHITE);
		bDiv.setForeground(Color.WHITE);
		bDec.setForeground(Color.WHITE);
		bEq.setForeground(Color.WHITE);
		bDel.setForeground(Color.WHITE);
		bClr.setForeground(Color.WHITE);

		b1.setBackground(Color.GRAY);
		b2.setBackground(Color.GRAY);
		b3.setBackground(Color.GRAY);
		b4.setBackground(Color.GRAY);
		b5.setBackground(Color.GRAY);
		b6.setBackground(Color.GRAY);
		b7.setBackground(Color.GRAY);
		b8.setBackground(Color.GRAY);
		b9.setBackground(Color.GRAY);
		b0.setBackground(Color.GRAY);
		bAdd.setBackground(Color.DARK_GRAY);
		bSub.setBackground(Color.DARK_GRAY);
		bMul.setBackground(Color.DARK_GRAY);
		bDiv.setBackground(Color.DARK_GRAY);
		bDec.setBackground(Color.GRAY);
		bEq.setBackground(Color.GRAY);
		bDel.setBackground(Color.RED);
		bClr.setBackground(Color.RED);
		

		
		b7.setBounds(40, 100, 50, 40);
		b8.setBounds(90, 100, 50, 40);
		b9.setBounds(140, 100, 50, 40);
		bDiv.setBounds(190, 100, 50, 40);

		b4.setBounds(40, 140, 50, 40);
		b5.setBounds(90, 140, 50, 40);
		b6.setBounds(140, 140, 50, 40);
		bMul.setBounds(190, 140, 50, 40);

		b1.setBounds(40, 180, 50, 40);
		b2.setBounds(90, 180, 50, 40);
		b3.setBounds(140, 180, 50, 40);
		bSub.setBounds(190, 180, 50, 40);

		bDec.setBounds(40, 220, 50, 40);
		b0.setBounds(90, 220, 50, 40);
		bEq.setBounds(140, 220, 50, 40);
		bAdd.setBounds(190, 220, 50, 40);

		bDel.setBounds(40, 260, 100, 40);
		bClr.setBounds(140, 260, 100, 40);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bEq.addActionListener(this);
		bDel.addActionListener(this);
		bDec.addActionListener(this);
		bClr.addActionListener(this);

		frame.add(text);

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b0);
		frame.add(bAdd);
		frame.add(bSub);
		frame.add(bMul);
		frame.add(bDiv);
		frame.add(bEq);
		frame.add(bDel);
		frame.add(bDec);
		frame.add(bClr);

		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CalculatorGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			text.setText(text.getText().concat("1"));
		}
		if (e.getSource() == b2) {
			text.setText(text.getText().concat("2"));
		}
		if (e.getSource() == b3) {
			text.setText(text.getText().concat("3"));
		}
		if (e.getSource() == b4) {
			text.setText(text.getText().concat("4"));
		}
		if (e.getSource() == b5) {
			text.setText(text.getText().concat("5"));
		}
		if (e.getSource() == b6) {
			text.setText(text.getText().concat("6"));
		}
		if (e.getSource() == b7) {
			text.setText(text.getText().concat("7"));
		}
		if (e.getSource() == b8) {
			text.setText(text.getText().concat("8"));
		}
		if (e.getSource() == b9) {
			text.setText(text.getText().concat("9"));
		}
		if (e.getSource() == b0) {
			text.setText(text.getText().concat("0"));
		}
		if (e.getSource() == bDec) {
			text.setText(text.getText().concat("."));
		}
		if (e.getSource() == bAdd) {
			a = Double.parseDouble(text.getText());
			operator = 1;
			text.setText("");
		}
		if (e.getSource() == bSub) {
			a = Double.parseDouble(text.getText());
			operator = 2;
			text.setText("");
		}
		if (e.getSource() == bMul) {
			a = Double.parseDouble(text.getText());
			operator = 3;
			text.setText("");
		}
		if (e.getSource() == bDiv) {
			a = Double.parseDouble(text.getText());
			operator = 4;
			text.setText("");
		}
		if (e.getSource() == bEq) {
			b = Double.parseDouble(text.getText());
			switch (operator) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
			case 4:
				result = a / b;
				break;
			}
			text.setText("" + result);
		}

		if (e.getSource() == bClr) {
			text.setText("");
		}
		if (e.getSource() == bDel) {
			String s = text.getText();
			text.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				text.setText(text.getText() + s.charAt(i));
		}

	}
}