import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Teclado {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado window = new Teclado();
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
	public Teclado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel lblNewLabel_28 = new JLabel("Espacio");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_28);
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_29 = new JLabel("Borrar");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_29);
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 255));
		panel.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("Esperando");
		lblNewLabel_27.setBackground(new Color(0, 128, 255));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_2.add(lblNewLabel_27);
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_30 = new JLabel("0");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_2.add(lblNewLabel_30);
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 128));
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(3, 9, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Q");
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("W");
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("E");
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("R");
		panel_3.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("T");
		panel_3.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel("Y");
		panel_3.add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_6 = new JLabel("U");
		panel_3.add(lblNewLabel_6);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_7 = new JLabel("I");
		panel_3.add(lblNewLabel_7);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_8 = new JLabel("O");
		panel_3.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_9 = new JLabel("P");
		panel_3.add(lblNewLabel_9);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_10 = new JLabel("A");
		panel_3.add(lblNewLabel_10);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_11 = new JLabel("S");
		panel_3.add(lblNewLabel_11);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_12 = new JLabel("D");
		panel_3.add(lblNewLabel_12);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_13 = new JLabel("F");
		panel_3.add(lblNewLabel_13);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_14 = new JLabel("G");
		panel_3.add(lblNewLabel_14);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_15 = new JLabel("H");
		panel_3.add(lblNewLabel_15);
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_16 = new JLabel("J");
		panel_3.add(lblNewLabel_16);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_17 = new JLabel("K");
		panel_3.add(lblNewLabel_17);
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_18 = new JLabel("L");
		panel_3.add(lblNewLabel_18);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_19 = new JLabel("Ñ");
		panel_3.add(lblNewLabel_19);
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_20 = new JLabel("Z");
		panel_3.add(lblNewLabel_20);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_21 = new JLabel("X");
		panel_3.add(lblNewLabel_21);
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_22 = new JLabel("C");
		panel_3.add(lblNewLabel_22);
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_23 = new JLabel("V");
		panel_3.add(lblNewLabel_23);
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_24 = new JLabel("B");
		panel_3.add(lblNewLabel_24);
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_25 = new JLabel("N");
		panel_3.add(lblNewLabel_25);
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_26 = new JLabel("M");
		panel_3.add(lblNewLabel_26);
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
	}

}
