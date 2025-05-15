package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controllers.AuthController;

public class AuthView {

    private AuthController controller;

    public AuthView(AuthController controller) {
        this.controller = controller;
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
        etiqueta2.setFont(new Font("Cambria", Font.BOLD, 14));
        etiqueta2.setLocation(200, 75);
        panel.add(etiqueta2);

        JTextField email = new JTextField();
        email.setSize(250, 30);
        email.setFont(new Font("Cambria", Font.BOLD, 14));
        email.setLocation(125, 105);
        panel.add(email);

        JLabel etiqueta3 = new JLabel("Password: ");
        etiqueta3.setSize(200, 30);
        etiqueta3.setFont(new Font("Cambria", Font.BOLD, 14));
        etiqueta3.setLocation(200, 135);
        panel.add(etiqueta3);

        JPasswordField pass = new JPasswordField();
        pass.setSize(250, 30);
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

                boolean flag1 = false, flag2 = false;

                if (email.getText().equals("")) {
                    email.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                    JOptionPane.showMessageDialog(null, "El email no puede estar vacío", "Error",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    email.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                    flag1 = true;
                }

                String myPassword = new String(pass.getPassword());
                if (myPassword.equals("")) {
                    pass.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                    JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía", "Error",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    pass.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                    flag2 = true;
                }

                if (flag1 && flag2) {
                    boolean loginOk = controller.validarLogin(email.getText(), myPassword);
                    if (loginOk) {
                        JOptionPane.showMessageDialog(null, "Bienvenido", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Email o contraseña incorrectos", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
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
                ventana.dispose();
                controller.registro();

            }

        });

        JLabel etiqueta4 = new JLabel("Forgot your password? ");
        etiqueta4.setSize(200, 30);
        etiqueta4.setFont(new Font("Cambria", Font.BOLD, 10));
        etiqueta4.setLocation(270, 200);
        panel.add(etiqueta4);

        JCheckBox boton = new JCheckBox("Remind me");
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
        ventana.setSize(500, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel etiqueta = new JLabel("pendienteb el  registro");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        panel.add(etiqueta, BorderLayout.CENTER);

        JButton btnLogin = new JButton("Volver al login");
        btnLogin.addActionListener(e -> {
            ventana.dispose();
            controller.login();
        });
        panel.add(btnLogin, BorderLayout.SOUTH);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}
