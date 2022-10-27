package com.aurionpro.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Form {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Form");
		JMenuBar bar = new JMenuBar();
		frame.add(bar);

		JMenu Login = new JMenu("Login");
		JMenu SignUp = new JMenu("SignUp");
		JMenu Contact = new JMenu("Contact");

		JMenuItem email = new JMenuItem("Email");
		JMenuItem phone = new JMenuItem("Phone");

		bar.add(Login);
		bar.add(SignUp);
		bar.add(Contact);
		Contact.add(email);
		Contact.add(phone);

		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(50, 10, 100, 50);
		nameLabel.setForeground(Color.blue);
		frame.add(nameLabel);

		JTextField name = new JTextField();
		name.setBounds(50, 50, 300, 40);
		frame.add(name);

		JLabel passLabel = new JLabel("Password");
		passLabel.setBounds(50, 110, 200, 50);
		passLabel.setForeground(Color.blue);
		frame.add(passLabel);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(50, 150, 300, 40);
		pass.setEchoChar('*');
		frame.add(pass);

		JRadioButton male = new JRadioButton("Male");
		male.setBounds(50, 200, 100, 50);
		male.setForeground(Color.blue);
		frame.add(male);
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(150, 200, 100, 50);
		female.setForeground(Color.blue);
		frame.add(female);

		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);

		JLabel courseLabel = new JLabel("Select Courses");
		courseLabel.setBounds(50, 250, 100, 50);
		courseLabel.setForeground(Color.blue);
		frame.add(courseLabel);

		JCheckBox checkBox1 = new JCheckBox("C++");
		checkBox1.setBounds(50, 280, 100, 50);
		frame.add(checkBox1);
		JCheckBox checkBox2 = new JCheckBox("Java", true);
		checkBox2.setBounds(50, 320, 100, 50);
		frame.add(checkBox2);

		JButton submitButton = new JButton("SUBMIT");
		submitButton.setBounds(50, 370, 300, 40);
		submitButton.setBackground(Color.green);
		frame.add(submitButton);
		submitButton.addActionListener(new ActionListener() {

//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showConfirmDialog(frame, "Are you sure?");
//				frame.dispose();
//			}

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Form submitted successfully.");
				frame.dispose();
			}
		});

		frame.setSize(500, 500);
		frame.setJMenuBar(bar);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
