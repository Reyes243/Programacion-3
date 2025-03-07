import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
	
	@Override
  	public void paint(Graphics g) {
  		
  		super.paint(g);
  		
  		Graphics2D g2d = (Graphics2D) g.create ();
  		g2d.setStroke(new BasicStroke(5));
  		g2d.setColor(Color.CYAN);
  		g2d.fillRect(0, 0, 800, 800);	
  		
  		g2d.setColor(Color.white);
  		g2d.fillRect(0, 460, 200, 20);
  		g2d.fillRect(0, 520, 200, 20);
  		g2d.fillRect(560, 460, 250, 20);
  		g2d.fillRect(560, 520, 250, 20);
  		g2d.fillRect(560, 600, 250, 20);
  		g2d.fillRect(0, 600, 200, 20);
  		
  		g2d.setColor(Color.white);
  		g2d.fillRect(5, 350, 30, 300);
  		g2d.fillRect(50, 350, 30, 300);
  		g2d.fillRect(95, 350, 30, 300);
  		g2d.fillRect(145, 350, 30, 300);
  		g2d.fillRect(190, 350, 30, 300);
  		g2d.fillRect(580, 350, 30, 300);
  		g2d.fillRect(625, 350, 30, 300);
  		g2d.fillRect(670, 350, 30, 300);
  		g2d.fillRect(715, 350, 30, 300);
  		g2d.fillRect(760, 350, 35, 300);
  		
  		
  		g2d.setColor(Color.MAGENTA);
  		g2d.drawRect(200, 200, 380, 380);
  		g2d.fillRect(200, 200, 380, 380);
  		
  		g2d.setColor(Color.BLUE);
  		g2d.drawRect(240, 380, 100, 200);
  		g2d.fillRect(240,380,100,200);
  		
  		g2d.setColor(Color.BLACK);
  		g2d.drawRect(140, 585, 500, 100);
  		g2d.fillRect(140, 585, 500, 100);
  		
  		g2d.setColor(Color.white);
  		g2d.fillRect(420, 280, 100, 80);
  		
  		g2d.setColor(Color.GRAY);
  		g2d.drawRect(420, 280, 100, 80);
  		
  		g2d.setColor(Color.GREEN);
  		g2d.drawRect(0, 650, 800, 40);
  		g2d.fillRect(0, 650, 800, 40);
  		
  		g2d.setColor(Color.yellow);
  		g2d.drawRect(0, 690, 800, 50);
  		g2d.fillRect(0, 690, 800, 50);
  		
  		g2d.setColor(Color.GREEN);
  		g2d.drawRect(0, 730, 800, 30);
  		g2d.fillRect(0, 730, 800, 30);
  		
  		g2d.setColor(Color.yellow);
  		g2d.drawRect(0, 760, 800, 40);
  		g2d.fillRect(0, 760, 800, 40);
  		g2d.setColor(Color.white);
  		
  		g2d.fillArc(325, 470, 15, 15, 0, 360);
        
        g2d.setColor(Color.GRAY);
  		g2d.drawRect(490, 120, 50, 60);
  		g2d.fillRect(490, 120, 50, 60);
  		
  		int[] xs = {600, 200, 350};
        int[] ys = {200, 200, 50};
        
        g2d.setColor(Color.DARK_GRAY);
        
        g2d.drawPolygon(xs, ys, 3);
        g2d.fillPolygon(xs, ys, 3);
        
       
  		
      
	}
}

