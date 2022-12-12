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
public class Main extends JFrame{
	private JTextField txtValueToConvert;
	public Main() {
		
		JLabel lblNewLabel = new JLabel("Conver Temperature");
		lblNewLabel.setBounds(129, 6, 127, 16);
		
		txtValueToConvert = new JTextField();
		txtValueToConvert.setBounds(126, 25, 130, 26);
		txtValueToConvert.setForeground(new Color(203, 214, 195));
		txtValueToConvert.setToolTipText("Input the value");
		txtValueToConvert.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setBounds(82, 63, 32, 16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(126, 63, 147, 27);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Celcius (°C)", "Fahrenheit (°F)", "Kelvin (°K)", "Rankine (°R)"}));
		
		JLabel lblNewLabel_1_1 = new JLabel("To");
		lblNewLabel_1_1.setBounds(82, 96, 32, 16);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(126, 92, 147, 27);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Celcius (°C)", "Fahrenheit (°F)", "Kelvin (°K)", "Rankine (°R)"}));
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel_1_1);
		getContentPane().add(comboBox_1);
		getContentPane().add(txtValueToConvert);
		getContentPane().add(lblNewLabel);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(136, 142, 117, 29);
		btnNewButton.setOpaque(true);
		getContentPane().add(btnNewButton);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 179, 450, 33);
		getContentPane().add(splitPane);
		
	}
	
	public static void main(String [] args) {
		Main m = new Main();
		m.setVisible(true);
	}
}
