/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author mendoza
 */
public class Nodo {
    
    private Persona persona;
    private Nodo sgt;
    
    public Nodo (Persona persona){
        this.persona = persona;
        this.sgt = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo getSgt() {
        return sgt;
    }

    public void setSgt(Nodo sgt) {
        this.sgt = sgt;
    }
    
    
}
