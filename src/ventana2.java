import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 window = new ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 64));
		panel.setBorder(new LineBorder(new Color(0, 255, 64),20));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 64));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setBorder(new LineBorder(new Color(0, 255, 64),10));
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		panel_2.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 255, 255));
		panel_2.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(6, 6, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(panel_8);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mexico", "Peru"}));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 255));
		panel_1.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("Regristro de Usuario");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		frame.setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 430, 430);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
