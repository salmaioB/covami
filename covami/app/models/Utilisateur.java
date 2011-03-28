package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Utilisateur extends Model{
	@Required
	public String login;
	
	@Required
    public String password;
	
	@Required
	public String fullname;
    
    public Utilisateur(String login, String password, String fullname) {
        this.login = login;
        this.password = password;
        this.fullname = fullname;
    }
    
    public static Utilisateur connect(String login, String password) {
    	return find("byLoginAndPassword", login, password).first();
    }
    
    public String toString() {
        return fullname;
    }
}
