/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10.metier;

/**
 *
 * @author perussel
 */
public class Jour {

    private int noJour;

    /**
     * Get the value of noJour
     *
     * @return the value of noJour
     */
    public int getNoJour() {
        return noJour;
    }

    public Jour(int noJour) {
        this.noJour = noJour;
    }

    @Override
    public String toString() {
        return "Jour " + noJour;
    }

    /* redefinition de l'egalité (pour la hasmap!)
     *  initialement definie dans la classe Object
     *   
     *    2 jours indetiques ssi noJour identiques
     */
    @Override
    public boolean equals(Object o) {
        Jour jourAComparer;
        
        jourAComparer = (Jour)o; // "cast" de 'o' en Jour
        if(this.getNoJour() == jourAComparer.getNoJour()) // == car int est primitif
            return true;
        else 
            return false;
    }
    
    @Override
    public int hashCode() {
        return this.getNoJour();
    }
}
