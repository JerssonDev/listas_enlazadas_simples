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
public class Controller {
    
    private Lista lista;
    
    public Controller () {
        lista = new Lista();
    }
    
    public void ShowMenu (){
    
        int opt;
        View.showHeader();
        View.showSize(lista.getSize());
        View.showMenu();
        
        do {   
            
            opt = View.showOption();
            actionMenu(opt);
            
        } while (opt < 1 || opt > 7);
                
        
        
    }
    
    private void actionMenu(int opt){
        
        switch(opt){
            case 1:
                
                lista.add(obtenerDatosPersona());
                ShowMenu();   
                break;
            case 2:
                
                lista.addInit(obtenerDatosPersona());
                ShowMenu();
                break;
            case 3:
                
                lista.show();
                View.showContinue();
                ShowMenu();
                break;
            case 4:
                
                int code = View.showCodigo();
                lista.search(code);
                View.showContinue();
                ShowMenu();
                break;
            case 5:
                
                int pos = View.showPosicion();
                lista.remove(pos);
                View.showContinue();
                ShowMenu();
                break;
            case 6:
                
                lista.remove();
                View.showContinue();
                ShowMenu();
                break;
            case 7:
                
                View.showThanks();
                System.exit(0);
                break;    
        }
     
    }
    
    private Persona obtenerDatosPersona () {
    
        int codigo = View.showPersonaCodigo();
        String nombre = View.showPersonaNombre();
        int edad = View.showPersonaEdad();
        
        return new Persona(codigo, nombre, edad);
      
    }
    
}
