import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {
	
	@Before
	public void creerUtilisateur() {
		// Create a new user and save it
        new Utilisateur("gpledran", "azerty", "Gaudéric Pledran").save();
	}

    @Test
    public void retrouverUtilisateur() {
        // Rechercher utilisateur par login
        Utilisateur gpledran = Utilisateur.find("byLogin", "gpledran").first();
        
        // Test 
        assertNotNull(gpledran);
        assertEquals("gpledran", gpledran.login);
    }
    
    @Test
    public void connecterUtilisateur() {
        // Test 
        assertNotNull(Utilisateur.connect("gpledran", "azerty"));
        assertNull(Utilisateur.connect("gpledran", "badpassword"));
        assertNull(Utilisateur.connect("badlogin", "azerty"));
    }

}
