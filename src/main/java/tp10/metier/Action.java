/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10.metier;

/**
 *
 * @author perussel
 */
public abstract class Action {

    private String nom;

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }

    public Action(String nom) {
        this.nom = nom;
    }

    public abstract float valeur(Jour j);

    @Override
    public boolean equals(Object obj) {
        Action actionAComparer;
        
        actionAComparer = (Action)obj;
       return (this.getNom().compareToIgnoreCase(actionAComparer.getNom()) == 0);
    }

    @Override
    public int hashCode() {
        return this.getNom().toUpperCase().hashCode();
    }
    
    @Override
    public String toString() {
        return this.getNom();
    }
}
