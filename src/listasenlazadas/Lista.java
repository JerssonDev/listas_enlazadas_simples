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
public class Lista {
    
    private Nodo head;
    private Nodo foot;
    private int size;
    
    public Lista () {
        this.head =  null;
        this.foot = null;
    }
    
    public void add (Persona persona) {
        
        if(head == null) {
            
            head = new Nodo(persona);
            foot = head;
            
        } else {
            
            Nodo nodo = new Nodo(persona);
            foot.setSgt(nodo);
            foot = nodo;
            
        }
        this.size++;
    }
    
    public void addInit (Persona persona) {
        
        if(head == null) {
            
            head = new Nodo(persona);
            foot = head;
            
        } else {
            
            Nodo nodo = new Nodo(persona);
            nodo.setSgt(head);
            head = nodo; 
        }
        this.size++;
    }
    
    
    
    public void show () {
    
        if (size <=0) {
            System.out.println("\t\t"+" La lista se encuentra vacia!");
            return;
        }
        
        Nodo tmp  = head;
        System.out.println("\t\t"+tmp.getPersona().toString());
        while (tmp.getSgt() != null){
            
            tmp = tmp.getSgt();
            System.out.println("\t\t"+tmp.getPersona().toString());
            
        }
    }
    
    public void remove() {
    
        this.head = null;
        this.foot = null;
        this.size =0;
        
    }
    
    public void remove(int pos) {
        
        if (pos == 0) {
            
            Nodo tempHead = head;
            head = tempHead.getSgt();
            tempHead.setSgt(null);
            
            this.size--;
            
        } else if(pos>0 && pos < size) {
            
            Nodo tmpHead = head;
            Nodo tmpActual = null;
            
            for (int i = 0; i < pos - 1; i++) {
                tmpHead = tmpHead.getSgt();
            }
            
            tmpActual = tmpHead.getSgt();
            
            tmpHead.setSgt(tmpActual.getSgt());
            
            tmpActual.setSgt(null);
        
            this.size--;
            
        }
        
    }
    
    public void search(int code){
        
        boolean flag = false;
        
        for(Nodo tmp = head; tmp != null; tmp = tmp.getSgt()){
        
            if (tmp.getPersona().getCodigo() == code) {
                System.out.println("\t\t"+tmp.getPersona().toString());
                flag = true;
                break;
            }
            
        }
        
        if (!flag) {
            System.out.println("\t\t"+" No se encontro nada!");
        }
        
    }
    
    public int getSize() {
        return this.size;
    }
    
    
}
