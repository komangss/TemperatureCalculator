package src;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main extends JFrame{
	private JTextField inputValue;
	private JTextField result;
	
	public Main() {
		JLabel lblNewLabel = new JLabel("Conver Temperature");
		lblNewLabel.setBounds(129, 6, 127, 16);
		
		inputValue = new JTextField();
		inputValue.setBounds(126, 25, 130, 26);
		inputValue.setForeground(new Color(203, 214, 195));
		inputValue.setToolTipText("Input the value");
		inputValue.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setBounds(82, 63, 32, 16);
		
		JComboBox comboFrom = new JComboBox();
		comboFrom.setBounds(126, 63, 147, 27);
		comboFrom.setModel(new DefaultComboBoxModel(new String[] {"Celcius (°C)", "Fahrenheit (°F)", "Kelvin (°K)", "Rankine (°R)"}));
		
		JLabel lblNewLabel_1_1 = new JLabel("To");
		lblNewLabel_1_1.setBounds(82, 96, 32, 16);
		
		JComboBox comboTo = new JComboBox();
		comboTo.setBounds(126, 92, 147, 27);
		comboTo.setModel(new DefaultComboBoxModel(new String[] {"Celcius (°C)", "Fahrenheit (°F)", "Kelvin (°K)", "Rankine (°R)"}));

		
		JButton btnCalculate = new JButton("Calculate");
		
		
		btnCalculate.addActionListener(new ActionListener() {
			// saat button di click
			public void actionPerformed(ActionEvent e) {
				// dapetin input value nya
				// dapetin combo from 
				// dapetin combo to
				// kalkulasi 
				// tampilin hasil kalkulasi
//				JOptionPane.showMessageDialog(Main.this, comboFrom.getSelectedItem());
			}
		});
		
		btnCalculate.setForeground(Color.BLACK);
		btnCalculate.setBounds(121, 135, 117, 29);
		btnCalculate.setOpaque(true);

		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(6, 171, 61, 16);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(16, 193, 130, 26);
		result.setColumns(10);
		
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel_1_1);
		getContentPane().add(comboTo);
		getContentPane().add(inputValue);
		getContentPane().add(lblNewLabel);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(comboFrom);
		getContentPane().add(btnCalculate);
		getContentPane().add(lblNewLabel_2);
		getContentPane().add(result);
		
	}
	
	public static void main(String [] args) {
		Main m = new Main();
		m.setSize(300,300);
		// bikin jframe ini muncul dilayar
		m.setVisible(true);
	}
}
