/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10.metier;

import java.util.HashMap;

/**
 *
 * les actions simples sont des actions !
 *   heritage --> donc (i) concretiser la methode abstraire 'valeur'
 *                  et (ii) def d'un constructeur cohérent avec le constructeur 
 *                                   parent
 */
public class ActionSimple extends Action {
    
    // Table de hachage contenant les cours indexés par des jours
    private HashMap<Jour, Cours> tblCours;
    
    // Constructeur cohérent avec le constructeur parent
    public ActionSimple(String nom) {
        super(nom); // c'est d'abord 1 action !
        this.tblCours = new HashMap<Jour, Cours>();
    }
    
    public void enrgCours(Jour j, float px) {
        /* création d'un objet Cours associé au prix
         *    puis ajout dans la table en indexant par le jour
         */        
        if(this.tblCours.containsKey(j) == true)
            this.tblCours.remove(j);
        
        this.tblCours.put(j, new Cours(px));
            
        
    }
    
    @Override
    public float valeur(Jour j) {
        // A FAIRE !
        if(this.tblCours.get(j) != null)
            return this.tblCours.get(j).getValeur();
        else
            return 0; // cours nul si pas de pas de cours
    }
   /* classee privée !! 
    *   la classe n'est accessible que depuis la classe englobante
    */
    
    private class Cours {

        private float valeur;

        /**
         * Get the value of valeur
         *
         * @return the value of valeur
         */
        public float getValeur() {
            return valeur;
        }

        public Cours(float valeur) {
            this.valeur = valeur;
        }        
    }
    
    
}
