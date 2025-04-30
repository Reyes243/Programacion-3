package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AuthView {
	public AuthView() { 
	}
	
public void login() {
		
		JFrame ventana = new JFrame();
		
		ventana.setTitle("Login"); 
	    ventana.setSize(1000, 600);
	    ventana.setLocationRelativeTo(null);
	    ventana.setResizable(true); 
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
		
		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#33fcff"));
		panel.setOpaque(true);
		panel.setSize(1000, 600);
		panel.setLocation(0, 0);
		panel.setLayout(null);

		JLabel etiqueta1 = new JLabel("Welcome");
		etiqueta1.setSize(100, 50);
		etiqueta1.setLocation(200, 10);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(etiqueta1);

		JLabel etiqueta2 = new JLabel("Username/Email: ");
		etiqueta2.setSize(200, 30);
		// etiqueta2.setOpaque(true);
		etiqueta2.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta2.setFont(new Font("Cambria", Font.BOLD, 14));
		etiqueta2.setLocation(200, 75);
		panel.add(etiqueta2);

		JTextField email = new JTextField();
		email.setSize(250, 30);
		email.setOpaque(true);
		email.setHorizontalAlignment(JLabel.HEIGHT);
		email.setFont(new Font("Cambria", Font.BOLD, 14));
		email.setLocation(125, 105);
		panel.add(email);

		JLabel etiqueta3 = new JLabel("Password: ");
		etiqueta3.setSize(200, 30);
		// etiqueta2.setOpaque(true);
		etiqueta3.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta3.setFont(new Font("Cambria", Font.BOLD, 14));
		etiqueta3.setLocation(200, 135);
		panel.add(etiqueta3);

		JPasswordField pass = new JPasswordField();
		pass.setSize(250, 30);
		pass.setOpaque(true);
		pass.setHorizontalAlignment(JLabel.HEIGHT);
		pass.setFont(new Font("Cambria", Font.BOLD, 14));
		pass.setLocation(125, 165);
		panel.add(pass);

		JButton join = new JButton("Log in");
		join.setSize(100, 50);
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("Cambria", Font.BOLD, 14));
		join.setLocation(200, 250);
		panel.add(join);

		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Boolean flag1 = false, flag2 = false;

				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					flag1 = true;
				}

				String myPassword = new String(pass.getPassword());
				if (myPassword.equals("")) {
					pass.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

				} else {
					pass.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					flag2 = true;
				}

				if (flag1 && flag2) {
					if (email.getText().equals("luquin@gmail.com")) {
						if (myPassword.equals("contra123"))
							JOptionPane.showMessageDialog(null, "Bienvenido", "hola", JOptionPane.WARNING_MESSAGE);
						else
							JOptionPane.showMessageDialog(null, "Fatal error", "hola", JOptionPane.WARNING_MESSAGE);
					} else
						JOptionPane.showMessageDialog(null, "Fatal error", "hola", JOptionPane.WARNING_MESSAGE);
				}
			}

		});
		JButton ir_registro = new JButton("ir al registro");
		ir_registro.setSize(130, 50);
		ir_registro.setBackground(Color.LIGHT_GRAY);
		ir_registro.setFont(new Font("Cambria", Font.BOLD, 12));
		ir_registro.setLocation(200, 320);
		panel.add(ir_registro);

		ir_registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.dispose();
				AuthView.this.registro();

				
			}

		});

		JLabel etiqueta4 = new JLabel("Forgot your password? ");
		etiqueta4.setSize(200, 30);
		// etiqueta2.setOpaque(true);
		etiqueta4.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta4.setFont(new Font("Cambria", Font.BOLD, 10));
		etiqueta4.setLocation(270, 200);
		panel.add(etiqueta4);

		JCheckBox boton = new JCheckBox("Remindme");
		boton.setSize(85, 30);
		boton.setLocation(120, 200);
		boton.setFont(new Font("Cambria", Font.BOLD, 10));
		boton.setBackground(Color.decode("#33fcff"));
		panel.add(boton);

		
		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
		ventana.setVisible(true);
		
		
	}
	public void registro() {
	JFrame ventana = new JFrame();
	
	ventana.setTitle("Registro"); 
    ventana.setSize(1000, 600);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(true); 
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel ventanaPanel = new JPanel();
	
	ventanaPanel.setBackground(Color.decode("#3bf484"));
	ventanaPanel.setOpaque(true);
	ventanaPanel.setSize(500,500);
	ventanaPanel.setLocation(0,0);
	ventanaPanel.setLayout(null);
	
	
	
	JLabel etiqueta1 = new JLabel("Registro de usuario");
	etiqueta1.setSize(200,60);
	etiqueta1.setLocation(250, 30);
	etiqueta1.setHorizontalAlignment(JLabel.CENTER);
	etiqueta1.setFont(new Font("Corbel", Font.BOLD, 24));	
	ventanaPanel.add(etiqueta1);
	
	JLabel etiqueta2 = new JLabel("Nombre de usuario:");
	etiqueta2.setSize(200, 30);
	etiqueta2.setLocation(240, 100);
	etiqueta2.setFont(new Font("Corbel", Font.BOLD, 18));	
	ventanaPanel.add(etiqueta2);
	
	JTextField usuario = new JTextField();
	usuario.setSize(290, 30);
	usuario.setLocation(240, 130);
	usuario.setFont(new Font("Corbel", Font.BOLD, 18));
	ventanaPanel.add(usuario);
	
	JLabel etiqueta3 = new JLabel("Correo electronico:");
	etiqueta3.setSize(200, 30);
	etiqueta3.setLocation(240, 170);
	etiqueta3.setFont(new Font("Corbel", Font.BOLD, 18));	
	ventanaPanel.add(etiqueta3);
	
	JTextField email = new JTextField();
	email.setSize(290, 30);
	email.setLocation(240, 200);
	email.setFont(new Font("Corbel", Font.BOLD, 18));	
	ventanaPanel.add(email);
	
	JLabel etiqueta4 = new JLabel("Contraseña:");
	etiqueta4.setSize(200, 30);
	etiqueta4.setLocation(240, 260);
	etiqueta4.setFont(new Font("Corbel", Font.BOLD, 18));	
	ventanaPanel.add(etiqueta4);
	
	JPasswordField password = new JPasswordField();
	password.setSize(290, 30);
	password.setLocation(240, 290);
	password.setFont(new Font("Corbel", Font.BOLD, 18));	
	ventanaPanel.add(password);
	
	JLabel sexo = new JLabel("Sexo:");
	sexo.setSize(200, 30);
	sexo.setLocation(240, 350);
	sexo.setFont(new Font("Corbel", Font.BOLD, 18));	
	ventanaPanel.add(sexo);
	
	String[] opcionesSexo = {"Masculino", "Femenimo", "Otro..."};
	JComboBox<String> sexos = new JComboBox<String>(opcionesSexo);
	sexos.setSize(100,30);
	sexos.setLocation(300,350);
	ventanaPanel.add(sexos);
	
	JButton inicioSesion = new JButton("CREAR CUENTA");
	inicioSesion.setSize(200, 30);
	inicioSesion.setLocation(160, 400);
	inicioSesion.setFont(new Font("Corbel", Font.BOLD, 19));	
	ventanaPanel.add(inicioSesion);
	
	JButton btnNewButton = new JButton("ir al login");
	btnNewButton.setFont(new Font("Corbel", Font.BOLD, 19));	
	btnNewButton.setBounds(380, 400, 200, 30);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.dispose();
				AuthView.this.login();

				
			}

		});
		ventanaPanel.add(btnNewButton);
		
		ventana.add(ventanaPanel);
		ventana.repaint();
		ventana.revalidate();
		ventana.setVisible(true);
		
	}

}
