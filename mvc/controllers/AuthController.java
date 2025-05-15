package controllers;

import models.AuthModel;
import views.AuthView;

public class AuthController {

    private AuthView vista;
    private AuthModel modelo;

    public AuthController() {
        vista = new AuthView(this);
        modelo = new AuthModel();
    }

    public void login() {
        vista.login();
    }

    
    public boolean validarLogin(String email, String password) {
        return modelo.login(email, password);
    }

    public void registro() {
        vista.registro();
    }
}
