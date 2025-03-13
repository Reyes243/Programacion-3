import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	
	
	public Ventana(){
		this.setTitle("Calculadora");
		this.setVisible(true);
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.repaint();
		this.revalidate();
		
		ImageIcon icono =new ImageIcon("imagenes/DarkSouls.png");
		setIconImage(icono.getImage());
		
		//this.add(this.calculadora());
		//this.add(this.calculadoraPro());
		//this.add(this.InterfazMasterPro());
		this.add(this.login());
		
		
		this.repaint();
		this.revalidate();
		
	}
	
	
	public JPanel calculadora() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#5DE2E7"));
		panel.setOpaque(true);
		panel.setSize(300,400);
		panel.setLocation(0,0);
		panel.setLayout(null);
		
		JTextField pantalla = new JTextField();
		pantalla.setSize(270,80);
		pantalla.setOpaque(true);
		pantalla.setHorizontalAlignment(JLabel.HEIGHT);
		pantalla.setFont(new Font("Arial",Font.BOLD, 15));
		pantalla.setLocation(10,10);
		pantalla.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(pantalla);
		
		JButton Num_0 = new JButton("0");
		Num_0.setSize(60,40);
		Num_0.setBackground(Color.YELLOW);
		Num_0.setFont(new Font("arial",Font.BOLD,15));
		Num_0.setLocation(10,300);
		Num_0.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_0);
		
		JButton Num_1 = new JButton("1");
		Num_1.setSize(60,40);
		Num_1.setBackground(Color.YELLOW);
		Num_1.setFont(new Font("arial",Font.BOLD,15));
		Num_1.setLocation(10,250);
		Num_1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_1);
		
		JButton Num_2 = new JButton("2");
		Num_2.setSize(60,40);
		Num_2.setBackground(Color.YELLOW);
		Num_2.setFont(new Font("arial",Font.BOLD,15));
		Num_2.setLocation(80,250);
		Num_2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_2);
		
		JButton Num_3 = new JButton("3");
		Num_3.setSize(60,40);
		Num_3.setBackground(Color.YELLOW);
		Num_3.setFont(new Font("arial",Font.BOLD,15));
		Num_3.setLocation(150,250);
		Num_3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_3);
		
		JButton Num_4 = new JButton("4");
		Num_4.setSize(60,40);
		Num_4.setBackground(Color.YELLOW);
		Num_4.setFont(new Font("arial",Font.BOLD,15));
		Num_4.setLocation(10,200);
		Num_4.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_4);
		
		JButton Num_5 = new JButton("5");
		Num_5.setSize(60,40);
		Num_5.setBackground(Color.YELLOW);
		Num_5.setFont(new Font("arial",Font.BOLD,15));
		Num_5.setLocation(80,200);
		Num_5.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_5);
		
		JButton Num_6 = new JButton("6");
		Num_6.setSize(60,40);
		Num_6.setBackground(Color.YELLOW);
		Num_6.setFont(new Font("arial",Font.BOLD,15));
		Num_6.setLocation(150,200);
		Num_6.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_6);
		
		JButton Num_7 = new JButton("7");
		Num_7.setSize(60,40);
		Num_7.setBackground(Color.YELLOW);
		Num_7.setFont(new Font("arial",Font.BOLD,15));
		Num_7.setLocation(10,150);
		Num_7.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_7);
		
		JButton Num_8 = new JButton("8");
		Num_8.setSize(60,40);
		Num_8.setBackground(Color.YELLOW);
		Num_8.setFont(new Font("arial",Font.BOLD,15));
		Num_8.setLocation(80,150);
		Num_8.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_8);
		
		JButton Num_9 = new JButton("9");
		Num_9.setSize(60,40);
		Num_9.setBackground(Color.YELLOW);
		Num_9.setFont(new Font("arial",Font.BOLD,15));
		Num_9.setLocation(150,150);
		Num_9.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(Num_9);
		
		JButton limpear = new JButton("CE");
		limpear.setSize(60,40);
		limpear.setBackground(Color.YELLOW);
		limpear.setFont(new Font("arial",Font.BOLD,15));
		limpear.setLocation(10,100);
		limpear.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(limpear);
		
		JButton punto = new JButton(".");
		punto.setSize(60,40);
		punto.setBackground(Color.YELLOW);
		punto.setFont(new Font("arial",Font.BOLD,15));
		punto.setLocation(80,300);
		punto.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(punto);
		
		JButton igual = new JButton("=");
		igual.setSize(60,40);
		igual.setBackground(Color.YELLOW);
		igual.setFont(new Font("arial",Font.BOLD,15));
		igual.setLocation(150,300);
		igual.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(igual);
		
		JButton suma = new JButton("+");
		suma.setSize(60,40);
		suma.setBackground(Color.YELLOW);
		suma.setFont(new Font("arial",Font.BOLD,15));
		suma.setLocation(220,300);
		suma.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(suma);
		
		JButton resta = new JButton("-");
		resta.setSize(60,40);
		resta.setBackground(Color.YELLOW);
		resta.setFont(new Font("arial",Font.BOLD,15));
		resta.setLocation(220,250);
		resta.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(resta);
		
		JButton multi = new JButton("*");
		multi.setSize(60,40);
		multi.setBackground(Color.YELLOW);
		multi.setFont(new Font("arial",Font.BOLD,15));
		multi.setLocation(220,200);
		multi.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(multi);
		
		JButton division = new JButton("/");
		division.setSize(60,40);
		division.setBackground(Color.YELLOW);
		division.setFont(new Font("arial",Font.BOLD,15));
		division.setLocation(220,150);
		division.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(division);
		
		JButton extra = new JButton("");
		extra.setSize(200,40);
		extra.setBackground(Color.YELLOW);
		extra.setFont(new Font("arial",Font.BOLD,15));
		extra.setLocation(80,100);
		extra.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		panel.add(extra);
		
		
		return panel;
	}

	public JPanel calculadoraPro() {
		
		Font fuente = new Font("arial",Font.BOLD,32); 
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#5DE2E7"));
		panel.setOpaque(true);
		panel.setLayout(new BorderLayout());
		
		JLabel pantalla = new JLabel("20.00");
		pantalla.setBackground(Color.WHITE);
		pantalla.setOpaque(true);
		pantalla.setFont(fuente);
		pantalla.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(pantalla,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#000000"));
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		panel.add(centro,BorderLayout.CENTER);
		
		JPanel numeros = new JPanel();
		numeros.setLayout(new GridLayout(4,3));
		centro.add(numeros,BorderLayout.CENTER);
		
		String[] textos = {"9","8","7","6","5","4","3","2","1","0","."};
		
		for (String textos_numeros : textos) {
			
			JButton boton = new JButton(textos_numeros);
			numeros.add(boton);
			
		}
		
		JPanel operaciones = new JPanel();
		operaciones.setLayout(new GridLayout(6,1));
		centro.add(operaciones,BorderLayout.LINE_END);
		
		String[] textos2 = {"+","-","*","/","=","CE"};
		
		for (String textos_operaciones : textos2) {
			
			JButton boton2 = new JButton(textos_operaciones);
			operaciones.add(boton2);
			
		}
		
		
		return panel;
	}

	public JPanel InterfazMasterPro() {
		
		Font fuente = new Font("Arial",Font.BOLD,32); 
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#5DE2E7"));
		panel.setOpaque(true);
		panel.setLayout(new BorderLayout());
		
		JLabel pantalla = new JLabel("Interes");
		pantalla.setBackground(Color.WHITE);
		pantalla.setOpaque(true);
		pantalla.setFont(fuente);
		pantalla.setHorizontalAlignment(JLabel.LEFT);
		panel.add(pantalla,BorderLayout.NORTH);
		
		
	
		
		
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#7DDA58"));
		centro.setOpaque(true);
		centro.setLayout(new GridLayout(5,5,1,1));
		panel.add(centro,BorderLayout.CENTER);
		
		
		JLabel titulo = new JLabel("Calcula interes");
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBorder(BorderFactory.createMatteBorder(0, 0, 50, 0,Color.decode("#7DDA58") ));
		centro.add(titulo);
		
		JLabel titulo2 = new JLabel("");
		centro.add(titulo2);
		
		JLabel texto = new JLabel("capital");
		texto.setBorder(BorderFactory.createMatteBorder(0, 300, 0, 0,Color.decode("#7DDA58") ));
		centro.add(texto);
		
		JTextField tex = new JTextField("1500");
		tex.setBorder(BorderFactory.createMatteBorder(30, 0, 30,120,Color.decode("#7DDA58") ));
		centro.add(tex);
		
		JLabel texto2 = new JLabel("Tiempo");
		texto2.setBorder(BorderFactory.createMatteBorder(0, 300, 0, 0,Color.decode("#7DDA58") ));
		centro.add(texto2);
		
		JTextField tex2 = new JTextField("2");
		tex2.setBorder(BorderFactory.createMatteBorder(30, 0, 30, 120,Color.decode("#7DDA58") ));
		centro.add(tex2);
		
		JLabel texto3 = new JLabel("Tasa de interes");
		texto3.setBorder(BorderFactory.createMatteBorder(0, 300, 0, 0,Color.decode("#7DDA58") ));
		centro.add(texto3);
		
		JTextField tex3 = new JTextField("0.1");
		tex3.setBorder(BorderFactory.createMatteBorder(30, 0, 30, 120,Color.decode("#7DDA58") ));
		centro.add(tex3);
		
		JButton boton1 = new JButton("calcular");
		boton1.setBorder(BorderFactory.createMatteBorder(30, 50, 30, 30,Color.decode("#7DDA58") ));
		centro.add(boton1);
		
		JButton boton2 = new JButton("cancelar");
		boton2.setBorder(BorderFactory.createMatteBorder(30, 30, 30, 50,Color.decode("#7DDA58") ));
		centro.add(boton2);
		
		JPanel abajo = new JPanel();
		abajo.setBackground(Color.MAGENTA);
		abajo.setLayout(new GridLayout(2,2,1,1));
		panel.add(abajo,BorderLayout.SOUTH);
		
		JLabel text = new JLabel("Interes");
		text.setFont(new Font("Arial", Font.BOLD, 24));
		text.setBorder(BorderFactory.createMatteBorder(0, 300, 0, 0,Color.MAGENTA));
		abajo.add(text);
		
		JTextField bot = new JTextField("315.000000002");
		bot.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 120,Color.MAGENTA ));
		abajo.add(bot);
		
		JLabel text2 = new JLabel("Monto");
		text2.setFont(new Font("Arial", Font.BOLD, 24));
		text2.setBorder(BorderFactory.createMatteBorder(0, 300, 0, 0,Color.MAGENTA ));
		abajo.add(text2);
		
		JTextField bot2 = new JTextField("1815.00000002");
		bot2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 120,Color.MAGENTA ));
		abajo.add(bot2);
		
		
	
		
		
		
		
		
		return panel;
	}
	
	public JPanel login() {
		
		JPanel ventanaPanel = new JPanel();
		
		ventanaPanel.setBackground(Color.decode("#feefda"));
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
		
		
		//------------------- OPCIONES LADO IZQUIERDO DEL PANEL -------------------
		JLabel etiqueta2 = new JLabel("Nombre de usuario:");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 100);
		etiqueta2.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta2);
		
		JTextField usuario = new JTextField();
		usuario.setSize(290, 30);
		usuario.setLocation(40, 130);
		usuario.setFont(new Font("Corbel", Font.BOLD, 18));
		ventanaPanel.add(usuario);
		
		JLabel etiqueta3 = new JLabel("Correo electronico:");
		etiqueta3.setSize(200, 30);
		etiqueta3.setLocation(40, 170);
		etiqueta3.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta3);
		
		JTextField email = new JTextField();
		email.setSize(290, 30);
		email.setLocation(40, 200);
		email.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(email);
		
		JLabel etiqueta4 = new JLabel("Contraseña:");
		etiqueta4.setSize(200, 30);
		etiqueta4.setLocation(40, 260);
		etiqueta4.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta4);
		
		JPasswordField password = new JPasswordField();
		password.setSize(290, 30);
		password.setLocation(40, 290);
		password.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(password);
		
		JLabel sexo = new JLabel("Sexo:");
		sexo.setSize(200, 30);
		sexo.setLocation(40, 350);
		sexo.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(sexo);
		
		String[] opcionesSexo = {"Masculino", "Femenimo", "Otro..."};
		JComboBox<String> sexos = new JComboBox<String>(opcionesSexo);
		sexos.setSize(100,30);
		sexos.setLocation(100,350);
		ventanaPanel.add(sexos);
		
		
		JLabel etiqueta5 = new JLabel("Preferencias de contenido:");
		etiqueta5.setSize(220, 30);
		etiqueta5.setLocation(380, 100);
		etiqueta5.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta5);
		
		JCheckBox preferencia1 = new JCheckBox("Deportes");
		preferencia1.setSize(108, 30);
		preferencia1.setOpaque(false);
		preferencia1.setLocation(380, 140);
		preferencia1.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia1);
		
		JCheckBox preferencia2 = new JCheckBox("Peliculas");
		preferencia2.setSize(108, 30);
		preferencia2.setOpaque(false);
		preferencia2.setLocation(500, 140);
		preferencia2.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia2);
		
		JCheckBox preferencia3 = new JCheckBox("Literatura");
		preferencia3.setSize(108, 30);
		preferencia3.setOpaque(false);
		preferencia3.setLocation(380, 180);
		preferencia3.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia3);
		
		JCheckBox preferencia4 = new JCheckBox("Videojuegos");
		preferencia4.setSize(130, 30);
		preferencia4.setOpaque(false);
		preferencia4.setLocation(500, 180);
		preferencia4.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia4);
		
		JCheckBox preferencia5 = new JCheckBox("Noticias");
		preferencia5.setSize(130, 30);
		preferencia5.setOpaque(false);
		preferencia5.setLocation(500, 220);
		preferencia5.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia5);
		
		JCheckBox preferencia6 = new JCheckBox("Ciencia");
		preferencia6.setSize(108, 30);
		preferencia6.setOpaque(false);
		preferencia6.setLocation(380, 220);
		preferencia6.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia6);
		
		
		JLabel bio = new JLabel("Biografia:");
		bio.setSize(200, 30);
		bio.setLocation(40, 410);
		bio.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(bio);
		
		JTextArea biografia = new JTextArea(5,10);
		biografia.setSize(440, 100);
		biografia.setLocation(40, 440);
		biografia.setFont(new Font("Corbel", Font.BOLD, 15));
		biografia.setLineWrap(true);
		biografia.setWrapStyleWord(true);
		ventanaPanel.add(biografia);
		
		
		
		JButton terminos = new JButton("Terminos y condiciones");
		terminos.setSize(200, 30);
		terminos.setLocation(250, 570);
		terminos.setFont(new Font("Corbel", Font.BOLD, 13));	
		ventanaPanel.add(terminos);
		
		JRadioButton opcion1 = new JRadioButton("Aceptar");
		opcion1.setSize(70,20);
		opcion1.setLocation(230, 610);
		opcion1.setOpaque(false);
		ventanaPanel.add(opcion1);
		
		JRadioButton opcion2 = new JRadioButton("Rechazar");
		opcion2.setSize(80,20);
		opcion2.setLocation(390, 610);
		opcion2.setOpaque(false);
		ventanaPanel.add(opcion2);
				
		ButtonGroup grupo1 = new ButtonGroup();	
		grupo1.add(opcion1);
		grupo1.add(opcion2);
		
		
		JCheckBox casilla = new JCheckBox("Mantener sesion iniciada");
		casilla.setSize(200, 30);
		casilla.setOpaque(false);
		casilla.setLocation(130, 660);
		casilla.setFont(new Font("Corbel", Font.BOLD, 12));	
		ventanaPanel.add(casilla);
		
		JLabel olvidada = new JLabel("<html><u>¿Has olvidado la contraseña?</u></html>");//subraya texto
		olvidada.setForeground(Color.BLUE);//color para simular un hipervinculo
		olvidada.setCursor(new Cursor(Cursor.HAND_CURSOR));//aqui se cambia la forma del cursor al tocar el texto
		olvidada.setSize(200, 30);
		olvidada.setLocation(370, 660);
		olvidada.setFont(new Font("Corbel", Font.BOLD, 12));	
		ventanaPanel.add(olvidada);
		
		JButton inicioSesion = new JButton("CREAR CUENTA");
		inicioSesion.setSize(200, 30);
		inicioSesion.setLocation(500, 500);
		inicioSesion.setFont(new Font("Corbel", Font.BOLD, 19));	
		ventanaPanel.add(inicioSesion);
		
		inicioSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(usuario.getText().equals("")) {
					usuario.setBorder(BorderFactory.createLineBorder(Color.red,3));
				}else {
					usuario.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
				}
				
				if(email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
				
				String myPassword = new String (password.getPassword());
				
				if(myPassword.equals("")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					password.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
				
				
				
				
			}
		});
		
		return ventanaPanel;
	}
	
	//@Override
//  	public void paint(Graphics g) {
//  		
//  		super.paint(g);
//  		
//  		Graphics2D g2d = (Graphics2D) g.create ();
  			//Casa
//  		g2d.setStroke(new BasicStroke(5));
//  		g2d.setColor(Color.CYAN);
//  		g2d.fillRect(0, 0, 800, 800);	
//  		
//  		g2d.setColor(Color.white);
//  		g2d.fillRect(0, 460, 200, 20);
//  		g2d.fillRect(0, 520, 200, 20);
//  		g2d.fillRect(560, 460, 250, 20);
//  		g2d.fillRect(560, 520, 250, 20);
//  		g2d.fillRect(560, 600, 250, 20);
//  		g2d.fillRect(0, 600, 200, 20);
//  		
//  		g2d.setColor(Color.white);
//  		g2d.fillRect(5, 350, 30, 300);
//  		g2d.fillRect(50, 350, 30, 300);
//  		g2d.fillRect(95, 350, 30, 300);
//  		g2d.fillRect(145, 350, 30, 300);
//  		g2d.fillRect(190, 350, 30, 300);
//  		g2d.fillRect(580, 350, 30, 300);
//  		g2d.fillRect(625, 350, 30, 300);
//  		g2d.fillRect(670, 350, 30, 300);
//  		g2d.fillRect(715, 350, 30, 300);
//  		g2d.fillRect(760, 350, 35, 300);
//  		
//  		
//  		g2d.setColor(Color.MAGENTA);
//  		g2d.drawRect(200, 200, 380, 380);
//  		g2d.fillRect(200, 200, 380, 380);
//  		
//  		g2d.setColor(Color.BLUE);
//  		g2d.drawRect(240, 380, 100, 200);
//  		g2d.fillRect(240,380,100,200);
//  		
//  		g2d.setColor(Color.BLACK);
//  		g2d.drawRect(140, 585, 500, 100);
//  		g2d.fillRect(140, 585, 500, 100);
//  		
//  		g2d.setColor(Color.white);
//  		g2d.fillRect(420, 280, 100, 80);
//  		
//  		g2d.setColor(Color.GRAY);
//  		g2d.drawRect(420, 280, 100, 80);
//  		
//  		g2d.setColor(Color.GREEN);
//  		g2d.drawRect(0, 650, 800, 40);
//  		g2d.fillRect(0, 650, 800, 40);
//  		
//  		g2d.setColor(Color.yellow);
//  		g2d.drawRect(0, 690, 800, 50);
//  		g2d.fillRect(0, 690, 800, 50);
//  		
//  		g2d.setColor(Color.GREEN);
//  		g2d.drawRect(0, 730, 800, 30);
//  		g2d.fillRect(0, 730, 800, 30);
//  		
//  		g2d.setColor(Color.yellow);
//  		g2d.drawRect(0, 760, 800, 40);
//  		g2d.fillRect(0, 760, 800, 40);
//  		g2d.setColor(Color.white);
//  		
//  		g2d.fillArc(325, 470, 15, 15, 0, 360);
//        
//        	g2d.setColor(Color.GRAY);
//  		g2d.drawRect(490, 120, 50, 60);
//  		g2d.fillRect(490, 120, 50, 60);
//  		
//  		int[] xs = {600, 200, 350};
//        	int[] ys = {200, 200, 50};
//        
//       	 g2d.setColor(Color.DARK_GRAY);
//        
//       	 g2d.drawPolygon(xs, ys, 3);
//        	g2d.fillPolygon(xs, ys, 3);
  		
  		
  		
  		//SUPER MARIO 3
//  		g2d.setStroke(new BasicStroke(5));
//		g2d.setColor(Color.decode("#85fff5"));
//		g2d.fillRect(0, 0, 1400, 700);
//		
//		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillRoundRect(445, 170, 260, 410, 25, 25);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillRoundRect(480, 220, 260, 410, 25, 25);
//		g2d.setColor(Color.decode("#2eb5ec"));
//  		g2d.fillRoundRect(450, 175, 250, 400, 25, 25);
//  		
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillRoundRect(295, 320, 260, 260, 25, 25);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillRoundRect(330, 370, 260, 260, 25, 25);
//  		g2d.setColor(Color.decode("#fdc2af"));
//  		g2d.fillRoundRect(300, 325, 250, 250, 25, 25);
//  		
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillRoundRect(1195, 320, 260, 260, 25, 25);
//  		g2d.setColor(Color.decode("#42c20f"));
//  		g2d.fillRoundRect(1200, 325, 250, 250, 25, 25);
//  		
//  		g2d.setColor(Color.decode("#2d7f0c"));
//  		g2d.fillRoundRect(950, 320, 125, 70, 25, 25);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.drawRoundRect(875, 320, 200, 70, 25, 25);
//  		
//  		g2d.setColor(Color.decode("#2d7f0c"));
//  		g2d.fillRoundRect(950, 390, 100, 200, 25, 25);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.drawRoundRect(900, 390, 150, 200, 25, 25);
//		
//  		g2d.setColor(Color.decode("#e89729"));
//  		g2d.fillRect(120, 170, 50, 50);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.drawRect(120, 170, 50, 50);
//  		
//  		g2d.setColor(Color.decode("#e89729"));
//  		g2d.fillRect(200, 50, 50, 50);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.drawRect(200, 50, 50, 50);
//  		
//  		g2d.setColor(Color.decode("#e89729"));
//  		g2d.fillRect(250, 50, 50, 50);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.drawRect(250, 50, 50, 50);
//  		
//  		g2d.setColor(Color.decode("#e89729"));
//  		g2d.fillRect(1300, 85, 50, 50);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.drawRect(1300, 85, 50, 50);
//  		
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(125, 175, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(160, 175, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(125, 210, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(160, 210, 6, 6);
//  		
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(205, 55, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(205, 90, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(240, 55, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(240, 90, 6, 6);
//  		
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(255, 55, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(255, 90, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(290, 55, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(290, 90, 6, 6);
//  		
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(1305, 90, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(1305, 125, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(1340, 90, 6, 6);
//  		g2d.setColor(Color.decode("#000000"));
//  		g2d.fillOval(1340, 125, 6, 6);
//  		
//		g2d.setColor(Color.decode("#b28553"));
//		g2d.fillRect(0, 600, 1400, 100);
//
//		g2d.setColor(Color.decode("#f6ab58"));
//		g2d.fillRect(0, 575, 1400, 25);
//		
//		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(305, 330, 20, 20);
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(305, 550, 20, 20);
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(525, 330, 20, 20);
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(525, 550, 20, 20);
//  		
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(455, 180, 20, 20);
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(675, 180, 20, 20);
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(675, 550, 20, 20);
//  		
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(1205, 330, 20, 20);
//  		g2d.setColor(Color.decode("#d7ecf0"));
//  		g2d.fillOval(1205, 550, 20, 20);
//		
//  		
//		g2d.setStroke(new BasicStroke(5));
//		g2d.setColor(Color.decode("#6f491e"));
//		g2d.drawRect(10, 600, 1380, 90);
//  		g2d.fillRect(0, 630, 1400, 5);
//  		g2d.fillRect(0, 660, 1400, 5);
//  		g2d.fillRect(50, 600, 5, 90);
//  		g2d.fillRect(90, 600, 5, 90);
//  		g2d.fillRect(130, 600, 5, 90);
//  		g2d.fillRect(170, 600, 5, 90);
//  		g2d.fillRect(210, 600, 5, 90);
//  		g2d.fillRect(250, 600, 5, 90);
//  		g2d.fillRect(290, 600, 5, 90);
//  		g2d.fillRect(330, 600, 5, 90);
//  		g2d.fillRect(370, 600, 5, 90);
//  		g2d.fillRect(410, 600, 5, 90);
//  		g2d.fillRect(450, 600, 5, 90);
//  		g2d.fillRect(490, 600, 5, 90);
//  		g2d.fillRect(530, 600, 5, 90);
//  		g2d.fillRect(570, 600, 5, 90);
//  		g2d.fillRect(610, 600, 5, 90);
//  		g2d.fillRect(650, 600, 5, 90);
//  		g2d.fillRect(690, 600, 5, 90);
//  		g2d.fillRect(730, 600, 5, 90);
//  		g2d.fillRect(770, 600, 5, 90);
//  		g2d.fillRect(810, 600, 5, 90);
//  		g2d.fillRect(850, 600, 5, 90);
//  		g2d.fillRect(890, 600, 5, 90);
//  		g2d.fillRect(930, 600, 5, 90);
//  		g2d.fillRect(970, 600, 5, 90);
//  		g2d.fillRect(1010, 600, 5, 90);
//  		g2d.fillRect(1050, 600, 5, 90);
//  		g2d.fillRect(1090, 600, 5, 90);
//  		g2d.fillRect(1130, 600, 5, 90);
//  		g2d.fillRect(1170, 600, 5, 90);
//  		g2d.fillRect(1210, 600, 5, 90);
//  		g2d.fillRect(1250, 600, 5, 90);
//  		g2d.fillRect(1290, 600, 5, 90);
//  		g2d.fillRect(1330, 600, 5, 90);
//  		g2d.fillRect(1370, 600, 5, 90);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		

       
  		
      
	//}
}

