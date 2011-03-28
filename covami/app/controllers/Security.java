package controllers;
 
import models.*;
 
public class Security extends Secure.Security {
 
	static boolean authentify(String username, String password) {
	    return Utilisateur.connect(username, password) != null;
	}
	
	static void onDisconnected() {
	    Application.index();
	}
	
	static void onAuthenticated() {
	    Application.index();
	}
    
}