/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp1.Racas;

import projetolp1.Principal.Personagem;

/**
 *
 * @author felip
 */
public class Tiefling extends RacaBase {
    public Tiefling(Personagem p){
        modAtributo(1); // Mana
        modAtributo(3); // Dano
    }

    public boolean HabUtility(Personagem p){
           p.setshield((int) ((p.getshield() + p.getDanoRecebido())/2));
        return true;
    }
    
}
