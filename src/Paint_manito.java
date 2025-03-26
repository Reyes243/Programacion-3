import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Paint_manito {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint_manito window = new Paint_manito();
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
	public Paint_manito() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 130, 589);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(10, 37, 30, 30);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(50, 37, 30, 30);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(50, 78, 30, 30);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(0, 128, 255));
		btnNewButton_3.setBounds(10, 78, 30, 30);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(128, 128, 128));
		btnNewButton_4.setBounds(90, 37, 30, 30);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(0, 255, 64));
		btnNewButton_5.setBounds(90, 78, 30, 30);
		panel_1.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("Colores");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 110, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Figuras");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 119, 110, 17);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setBounds(10, 147, 30, 30);
		panel_1.add(btnNewButton_6);
		ImageIcon p1 =new ImageIcon("imagenes/cir.png");
		Image p2= p1.getImage();
		Image p3=p2.getScaledInstance(25, 25,Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(p3));
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setBounds(50, 147, 30, 30);
		panel_1.add(btnNewButton_7);
		ImageIcon port =new ImageIcon("imagenes/triangulo.png");
		Image port1= port.getImage();
		Image port2=port1.getScaledInstance(25, 25,Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(port2));
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setBounds(10, 188, 30, 30);
		panel_1.add(btnNewButton_8);
		ImageIcon l1 =new ImageIcon("imagenes/rectangulo.png");
		Image l2= l1.getImage();
		Image l3=l2.getScaledInstance(30, 30,Image.SCALE_SMOOTH);
		btnNewButton_8.setIcon(new ImageIcon(l3));
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setBounds(50, 188, 30, 30);
		panel_1.add(btnNewButton_9);
		ImageIcon j1 =new ImageIcon("imagenes/linea.jpg");
		Image j2= j1.getImage();
		Image j3=j2.getScaledInstance(30, 30,Image.SCALE_SMOOTH);
		btnNewButton_9.setIcon(new ImageIcon(j3));
		
		JLabel lblNewLabel_2 = new JLabel("Heramientas\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 229, 110, 14);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton_10 = new JButton("Lapiz");
		btnNewButton_10.setBounds(10, 254, 110, 23);
		panel_1.add(btnNewButton_10);
		ImageIcon d1 =new ImageIcon("imagenes/lapiz.png");
		Image d2= d1.getImage();
		Image d3=d2.getScaledInstance(20, 20,Image.SCALE_SMOOTH);
		btnNewButton_10.setIcon(new ImageIcon(d3));
		
		JButton btnNewButton_11 = new JButton("Pincel");
		btnNewButton_11.setBounds(10, 288, 110, 23);
		panel_1.add(btnNewButton_11);
		ImageIcon t1 =new ImageIcon("imagenes/picel.png");
		Image t2= t1.getImage();
		Image t3=t2.getScaledInstance(20, 20,Image.SCALE_SMOOTH);
		btnNewButton_11.setIcon(new ImageIcon(t3));
		
		JButton btnNewButton_11_1 = new JButton("Borrador");
		btnNewButton_11_1.setBounds(10, 322, 110, 23);
		panel_1.add(btnNewButton_11_1);
		ImageIcon e1 =new ImageIcon("imagenes/borrador.png");
		Image e2= e1.getImage();
		Image e3=e2.getScaledInstance(20, 20,Image.SCALE_SMOOTH);
		btnNewButton_11_1.setIcon(new ImageIcon(e3));
		
		JLabel lblNewLabel_3 = new JLabel("Grosor del dibujo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 356, 110, 14);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_12.setBounds(20, 381, 89, 23);
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_13.setBounds(20, 458, 89, 23);
		panel_1.add(btnNewButton_13);
		
		textField = new JTextField();
		textField.setText("10");
		textField.setBounds(50, 421, 30, 20);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_14 = new JButton("Limpear todo");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_14.setBounds(10, 527, 110, 51);
		panel_1.add(btnNewButton_14);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(150, 11, 724, 589);
		panel.add(panel_2);
		panel_2.setLayout(null);
	}

}
