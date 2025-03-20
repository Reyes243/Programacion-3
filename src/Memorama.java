import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Font;

public class Memorama {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama window = new Memorama();
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
	public Memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 20, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Puntaje:");
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tiempo:");
		lblNewLabel_2.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Movimientos:");
		lblNewLabel_3.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Juego de Memorama");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setBorder(BorderFactory.createMatteBorder(0, 120, 0, 120, new Color(20,30,120)));
		panel_1.setLayout(new GridLayout(4, 4, 10, 10));
		
		JButton btnNewButton_1 = new JButton("");
		panel_1.add(btnNewButton_1);
		
		ImageIcon portada =new ImageIcon("imagenes/portada.png");
		Image portada2= portada.getImage();
		Image portada3=portada2.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
		btnNewButton_1.setIcon(new ImageIcon(portada3));
		
		JButton btnNewButton_1_15 = new JButton("");
		panel_1.add(btnNewButton_1_15);
		
		ImageIcon portada4 =new ImageIcon("imagenes/portada.png");
		Image portada5= portada4.getImage();
		Image portada6=portada5.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
		btnNewButton_1_15.setIcon(new ImageIcon(portada6));
		
		JButton btnNewButton_1_14 = new JButton("");
		panel_1.add(btnNewButton_1_14);
		ImageIcon port =new ImageIcon("imagenes/portada.png");
		Image port1= port.getImage();
		Image port2=port1.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
		btnNewButton_1_14.setIcon(new ImageIcon(port2));
		
		JButton btnNewButton_1_13 = new JButton("");
		panel_1.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_12 = new JButton("");
		panel_1.add(btnNewButton_1_12);
		
		JButton btnNewButton_1_11 = new JButton("");
		panel_1.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_10 = new JButton("");
		panel_1.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_9 = new JButton("");
		panel_1.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_8 = new JButton("");
		panel_1.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_7 = new JButton("");
		panel_1.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_6 = new JButton("");
		panel_1.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_5 = new JButton("");
		panel_1.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_4 = new JButton("");
		panel_1.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_3 = new JButton("");
		panel_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2 = new JButton("");
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1 = new JButton("");
		panel_1.add(btnNewButton_1_1);
	}

}
