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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
		//this.add(this.registro());
		
		
		JMenuBar barra = new JMenuBar();
        JMenu file = new JMenu("Archivo");
        barra.add(file);
        JMenuItem open = new JMenuItem("Abrir");
        file.add(open);
        JMenuItem op_2 = new JMenuItem("Guardar");
        file.add(op_2);
        JMenuItem close = new JMenuItem("Cerrar");
        file.add(close);
        
        JMenu file2 = new JMenu("Cuenta");
        barra.add(file2);
        JMenuItem log = new JMenuItem("Inicio de sesion");
        file2.add(log);
        JMenuItem registro = new JMenuItem("Registro");
        file2.add(registro);
        JMenuItem recuperacion = new JMenuItem("Recuperacion de cuenta");
        file2.add(recuperacion);
        
        JMenu file3 = new JMenu("Usuario");
        barra.add(file3);
        JMenuItem alta = new JMenuItem("Dar de alta a un usuario");
        file3.add(alta);
        JMenuItem baja = new JMenuItem("Dar de baja a un usuario");
        file3.add(baja);
        JMenuItem consulta = new JMenuItem("Consulltar a un usuario");
        file3.add(consulta);
        
        JMenu file4 = new JMenu("Ayuda");
        barra.add(file4);
        JMenuItem Ayudausuario = new JMenuItem("Ayuda para crear un usuario");
        file4.add(Ayudausuario);
        JMenuItem ayudaacceso = new JMenuItem("Ayuda para acceder a sistema");
        file4.add(ayudaacceso);
        JMenuItem ayudarecuperar = new JMenuItem("Ayuda para recuperar contraseña");
        file4.add(ayudarecuperar);
        
        
        
        this.setJMenuBar(barra);
        this.repaint();
		this.revalidate();
        
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                router("login");
            }
        });

        
        registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                router("register");
            }
        });
        
        consulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                router("Consultar");
            }
        });
    
		recuperacion.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            router("Recuperacion");
	        }
	    });
		ayudarecuperar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            router("Ayuda para recuperacion contra");
	        }
	    });
		Ayudausuario.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            router("ayuda crear usuario");
	        }
	    });
		ayudaacceso.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            router("ayuda para acceder al sistema");
	        }
	    });
		alta.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            router("Dar de alta a un usuario");
	        }
	    });
		baja.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            router("Dar de baja a un usuario");
	        }
	    });
	}

  
    public void router(String page) {
        this.getContentPane().removeAll(); 
        

        
        if (page.equals("login")) {
            this.add(this.login());
        }  
        if (page.equals("register")) {
            this.add(this.registro());
        }
        if (page.equals("Consultar")) {
            this.add(this.Consultar());
        }
        if (page.equals("Recuperacion")) {
            this.add(this.RecuperacionDeCuenta());
        }
        if (page.equals("Ayuda para recuperacion contra")) {
            this.add(this.AyudaContra());
        }
        if (page.equals("ayuda crear usuario")) {
            this.add(this.ayudaUsuario());
        }
        if (page.equals("ayuda para acceder al sistema")) {
            this.add(this.AyudaAcceso());
        }
        if (page.equals("Dar de alta a un usuario")) {
            this.add(this.AltaUsuario());
        }
        if (page.equals("Dar de baja a un usuario")) {
            this.add(this.BajaUsuario());
        }
      
        
        
		
		
		
		
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

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#076990"));
		panel.setOpaque(true);
		panel.setSize(1000, 500);
		panel.setLocation(0, 0);
		panel.setLayout(null);

		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(100, 50);
		etiqueta1.setLocation(200, 10);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(etiqueta1);

		JLabel etiqueta2 = new JLabel("Usuario/Email: ");
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

		JLabel etiqueta3 = new JLabel("Contraseña: ");
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
		
	
		JButton join = new JButton("Iniciar sesion");
		join.setSize(150, 50);
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("Cambria", Font.BOLD, 14));
		join.setLocation(200, 250);
		panel.add(join);
		
		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Boolean flag1 = false, flag2 = false;
				
				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.RED,3));
					JOptionPane.showMessageDialog(null, "Fatal error","hola",JOptionPane.WARNING_MESSAGE);
					
				}else {
					email.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag1 = true;
				}
				
				String myPassword = new String(pass.getPassword());
				if (myPassword.equals("")) {
					pass.setBorder(BorderFactory.createLineBorder(Color.RED,3));
					JOptionPane.showMessageDialog(null, "Fatal error","hola",JOptionPane.WARNING_MESSAGE);
					
				}else {
					pass.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag2 = true;
				}
				
				if (flag1 && flag2) {
					if(email.getText().equals("reyes@gmail.com")) {
						if(myPassword.equals("contra123"))
							JOptionPane.showMessageDialog(null, "Bienvenido","hola",JOptionPane.WARNING_MESSAGE);
						else
							JOptionPane.showMessageDialog(null, "Fatal error","hola",JOptionPane.WARNING_MESSAGE);
					}
					else
						JOptionPane.showMessageDialog(null, "Fatal error","hola",JOptionPane.WARNING_MESSAGE);
				}
			}
			
		});
		
		JButton ir_registro = new JButton("Ir al registro");
		ir_registro.setSize(130, 50);
		ir_registro.setBackground(Color.LIGHT_GRAY);
		ir_registro.setFont(new Font("Cambria", Font.BOLD, 12));
		ir_registro.setLocation(200, 320);
		panel.add(ir_registro);
		
		ir_registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("register");
				
			}
			
		});
	
	
		
		
		

		JLabel etiqueta4 = new JLabel("Olvidaste tu contraseña? ");
		etiqueta4.setSize(200, 30);
		// etiqueta2.setOpaque(true);
		etiqueta4.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta4.setFont(new Font("Cambria", Font.BOLD, 10));
		etiqueta4.setLocation(270, 200);
		panel.add(etiqueta4);

		JCheckBox boton = new JCheckBox("Recordar");
		boton.setSize(85, 30);
		boton.setLocation(120, 200);
		boton.setFont(new Font("Cambria", Font.BOLD, 10));
		boton.setBackground(Color.decode("#789090"));
		panel.add(boton);
		
		ImageIcon imagen = new ImageIcon("imagenes/usuario.png");
		JLabel icon_user = new JLabel();
		icon_user.setBounds(90, 103, 30, 30);
		icon_user.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(icon_user.getWidth(), icon_user.getHeight(),Image.SCALE_DEFAULT)));
		panel.add(icon_user);
		
		ImageIcon imagen2 = new ImageIcon("imagenes/password.png");
		JLabel icon_pass = new JLabel();
		icon_pass.setBounds(90, 165, 30, 30);
		icon_pass.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(icon_pass.getWidth(), icon_pass.getHeight(),Image.SCALE_DEFAULT)));
		panel.add(icon_pass);
		
		ImageIcon imagen3 = new ImageIcon("imagenes/logo.png");
		JLabel logo = new JLabel();
		logo.setBounds(400, 0, 500, 500);
		logo.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(),Image.SCALE_SMOOTH)));
		panel.add(logo);
		
		



		return panel;
	}
	
	public JPanel registro() {
		
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
		inicioSesion.setLocation(280, 400);
		inicioSesion.setFont(new Font("Corbel", Font.BOLD, 19));	
		ventanaPanel.add(inicioSesion);
		
		inicioSesion.addActionListener(new ActionListener() {
			
			 Boolean pas1=false; Boolean pas2=false;
			
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
					pas1=true;
				}
				
				String myPassword = new String (password.getPassword());
				
				if(myPassword.equals("")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					password.setBorder(BorderFactory.createLineBorder(Color.green,3));
					pas2=true;
				}
				
				if(pas1 && pas2) {
					
					if(email.getText().equals("reyes@gmail.com")) {
						if(myPassword.equals("contra123"))
							JOptionPane.showMessageDialog(null, "Bienvenido","hola",JOptionPane.WARNING_MESSAGE);
						else
							JOptionPane.showMessageDialog(null, "Fatal error","hola",JOptionPane.WARNING_MESSAGE);
					}
					else
						JOptionPane.showMessageDialog(null, "Fatal error","hola",JOptionPane.WARNING_MESSAGE);
					
				}
				
				
			}
		});
		
		return ventanaPanel;
	}
	
	public JPanel Consultar() {
		
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 174, 160));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuarios totales 20");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(53, 177, 174, 89);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 328, 526, 302);
		panel.add(scrollPane);
		
		JTable table = new JTable(20,1);
		table.setModel(new DefaultTableModel(
			    new Object[][] {
			        {"usuario1@example.com"},
			        {"usuario2@example.com"},
			        {"usuario3@example.com"},
			        {"usuario4@example.com"},
			        {"usuario5@example.com"},
			        {"usuario6@example.com"},
			        {"usuario7@example.com"},
			        {"usuario8@example.com"},
			        {"usuario9@example.com"},
			        {"usuario10@example.com"},
			        {"usuario11@example.com"},
			        {"usuario12@example.com"},
			        {"usuario13@example.com"},
			        {"usuario14@example.com"},
			        {"usuario15@example.com"},
			        {"usuario16@example.com"},
			        {"usuario17@example.com"},
			        {"usuario18@example.com"},
			        {"usuario19@example.com"},
			        {"usuario20@example.com"},
			    },
			new String[] {
				"Usuarios"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Unispace", Font.BOLD, 12));
		btnNewButton.setBounds(629, 455, 104, 54);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Unispace", Font.BOLD, 12));
		btnNewButton_1.setBounds(629, 551, 104, 54);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Consulta de usuarios");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(253, 11, 298, 128);
		panel.add(lblNewLabel_1);
	
		
		
		return panel;
	}
	
	public JPanel RecuperacionDeCuenta() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(180, 166, 236));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Recuperacion de cuenta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(234, 11, 315, 128);
		panel.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(168, 244, 455, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 367, 455, 38);
		panel.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Introdusca su correo de recuperacion");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(168, 195, 242, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo de verificacion");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(168, 324, 175, 32);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(460, 468, 89, 47);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(234, 468, 89, 47);
		panel.add(btnNewButton_1);
	
		return panel;
	}
	
	public JPanel AyudaContra() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(187, 243, 253));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Como recuperar tu contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(168, 11, 408, 83);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 155, 539, 333);
		panel.add(scrollPane);
		
		
		JTextArea txtrabrirLaPgina = new JTextArea(80, 50);
		txtrabrirLaPgina.setTabSize(0);
		txtrabrirLaPgina.setLineWrap(true);
		scrollPane.setViewportView(txtrabrirLaPgina);
		txtrabrirLaPgina.setWrapStyleWord(true); 
		
				txtrabrirLaPgina.setText("1-Abrir la página de inicio de sesión:\r\nAccede a la página donde normalmente inicias sesión.\r\n2-Seleccionar opción \"¿Olvidaste tu contraseña?\":\r\nBusca y selecciona el enlace que dice \"¿Olvidaste tu contraseña?\" o algo similar.\r\n3-Introducir tu correo electrónico o nombre de usuario: \r\nIngresa la dirección de correo electrónico o el nombre de usuario asociado a la cuenta.\r\n4-Recibir correo de recuperación: \r\nRevisa tu bandeja de entrada para encontrar el correo de recuperación enviado por el servicio.\r\n5-Abrir el correo de recuperación: \r\nHaz clic en el enlace proporcionado en el correo para iniciar el proceso de restablecimiento de contraseña.\r\n6-Ingresar nueva contraseña: \r\nEn la página de restablecimiento, ingresa una nueva contraseña que cumpla con los requisitos de seguridad.\r\n7-Confirmar nueva contraseña: \r\nVuelve a ingresar la nueva contraseña para confirmarla.\r\n8-Guardar cambios:\r\nHaz clic en \"Guardar\" o \"Restablecer contraseña\" para completar el proceso.\r\n9-Iniciar sesión con la nueva contraseña: \r\nRegresa a la página de inicio de sesión e ingresa la nueva contraseña para acceder a tu cuenta.");
		return panel;
	}
	
	public JPanel ayudaUsuario() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 218, 167));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Como crear un usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(211, 11, 309, 83);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 155, 539, 333);
		panel.add(scrollPane);
		
		
		JTextArea txtrabrirLaPgina = new JTextArea(80, 50);
		txtrabrirLaPgina.setTabSize(0);
		txtrabrirLaPgina.setLineWrap(true);
		scrollPane.setViewportView(txtrabrirLaPgina);
		txtrabrirLaPgina.setWrapStyleWord(true); 
		
				txtrabrirLaPgina.setText("1. Acceder a la página de registro:\r\nVe a la página web donde deseas crear tu cuenta. Generalmente, encontrarás un botón o enlace que dice \"Registrarse\" o \"Crear cuenta\".\r\n"
				        + "2. Seleccionar la opción \"Crear cuenta\":\r\nHaz clic en el botón o enlace que te permite crear una nueva cuenta.\r\n"
				        + "3. Ingresar datos personales:\r\nCompleta el formulario con tus datos personales, como nombre completo, dirección de correo electrónico, número de teléfono, etc.\r\n"
				        + "4. Crear un nombre de usuario:\r\nElige un nombre de usuario único que usarás para acceder a la cuenta. Asegúrate de que sea fácil de recordar y cumpla con los requisitos del sitio (por ejemplo, longitud mínima o uso de caracteres especiales).\r\n"
				        + "5. Establecer una contraseña:\r\nCrea una contraseña segura que cumpla con los requisitos del sitio (por ejemplo, longitud mínima, uso de letras mayúsculas, números y caracteres especiales). Asegúrate de que sea difícil de adivinar.\r\n"
				        + "6. Confirmar la contraseña:\r\nVuelve a ingresar la misma contraseña para confirmarla y asegurarte de que no haya errores tipográficos.\r\n"
				        + "7. Aceptar los términos y condiciones:\r\nLee los términos y condiciones del servicio. Si estás de acuerdo, marca la casilla correspondiente para aceptarlos.\r\n"
				        + "8. Verificación de correo electrónico:\r\nRevisa tu bandeja de entrada para encontrar un correo de verificación. Abre el correo y haz clic en el enlace de verificación para confirmar tu dirección de correo electrónico.\r\n"
				        + "9. Completar el registro:\r\nDespués de hacer clic en el enlace de verificación, serás redirigido a la página de confirmación o inicio de sesión. En este punto, tu cuenta estará activa.\r\n"
				        + "10. Iniciar sesión:\r\nAhora puedes usar tu nombre de usuario y la contraseña que elegiste para iniciar sesión en el sitio.");
		return panel;		
	}
	
	public JPanel AyudaAcceso() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(203, 163, 211));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Como acceder al sistema");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(211, 11, 360, 83);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 155, 539, 333);
		panel.add(scrollPane);
		
		
		JTextArea txtrabrirLaPgina = new JTextArea(80, 50);
		txtrabrirLaPgina.setTabSize(0);
		txtrabrirLaPgina.setLineWrap(true);
		scrollPane.setViewportView(txtrabrirLaPgina);
		txtrabrirLaPgina.setWrapStyleWord(true); 
		
				txtrabrirLaPgina.setText("1. Abrir la página de inicio de sesión:\r\nAccede a la página web del sistema donde normalmente inicias sesión.\r\n"
				        + "2. Ingresar nombre de usuario:\r\nIntroduce el nombre de usuario o dirección de correo electrónico que registraste en el sistema.\r\n"
				        + "3. Ingresar contraseña:\r\nIntroduce la contraseña asociada con tu cuenta. Asegúrate de que esté correctamente escrita, respetando mayúsculas, minúsculas y caracteres especiales.\r\n"
				        + "4. Verificar los datos ingresados:\r\nRevisa que tanto el nombre de usuario como la contraseña sean correctos. Si alguno es incorrecto, recibirás un mensaje de error.\r\n"
				        + "5. Seleccionar la opción de inicio de sesión:\r\nHaz clic en el botón \"Iniciar sesión\" para proceder a ingresar al sistema.\r\n"
				        + "6. Verificar autenticación:\r\nUna vez que presiones el botón de inicio de sesión, el sistema verificará tus credenciales y te permitirá acceder a tu cuenta si son correctas.\r\n"
				        + "7. Resolver problemas de acceso:\r\nSi no puedes acceder, asegúrate de que tu usuario y contraseña sean correctos. Si olvidaste tu contraseña, utiliza la opción de recuperación para restablecerla.\r\n"
				        + "8. Acceder al sistema:\r\nUna vez autenticado, serás redirigido al panel principal del sistema donde podrás utilizar todas las funciones disponibles.\r\n");
		return panel;		
	}
	
	public JPanel AltaUsuario() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(215, 208, 159));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Regristar un usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(219, 11, 309, 57);
		panel.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(42, 232, 200, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(308, 232, 200, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(42, 313, 434, 30);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre(s):");
		lblNewLabel.setBounds(42, 196, 150, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setBounds(42, 277, 137, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Primer apellido:");
		lblNewLabel_3.setBounds(308, 196, 137, 25);
		panel.add(lblNewLabel_3);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(548, 232, 200, 30);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Segundo apellido:");
		lblNewLabel_4.setBounds(548, 196, 150, 25);
		panel.add(lblNewLabel_4);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(42, 399, 200, 30);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contraseña:\r\n");
		lblNewLabel_5.setBounds(42, 363, 137, 25);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(219, 527, 130, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(439, 527, 130, 50);
		panel.add(btnNewButton_1);
		return panel;
	}
	
	public JPanel BajaUsuario() {
		JPanel panel = new JPanel();
		return panel;
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

