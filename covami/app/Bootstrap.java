import play.*;
import play.jobs.*;
import play.test.*;
 
import models.*;
 
@OnApplicationStart
public class Bootstrap extends Job {
 
    public void doJob() {
        // Verifie que la table Utilisateur soir vide
        if(Utilisateur.count() == 0) {
            Fixtures.load("initial-data.yml");
        }
    }
 
}