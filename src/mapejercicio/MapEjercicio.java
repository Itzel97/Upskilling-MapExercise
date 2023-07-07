
package mapejercicio;

import java.util.HashMap;
import java.util.Map;


public class MapEjercicio {

    public static void main(String[] args) {
        // TODO code application logic here
        
        contadorSegundo("success");
    }
    
    
    public static void  contadorSegundo (String cadena){
        
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while(i < cadena.length()){
        
            if(map.get(cadena.charAt(i)) == null)
                map.put(cadena.charAt(i),1);
            else
                map.put(cadena.charAt(i),map.get(cadena.charAt(i))+ 1);
            
            
            i++;
        }
        
        int indice = 0;
        int Mayor = 0;
        int segundoMayor = 0;
        char segundoMayorChar = ' ';
        
       while(indice < map.size()){
       
           if(map.get(cadena.charAt(indice)) >= Mayor)
               Mayor = map.get(cadena.charAt(indice));
           
           else if (map.get(cadena.charAt(indice)) >= segundoMayor)
               segundoMayor = map.get(cadena.charAt(indice));
                segundoMayorChar = cadena.charAt(indice);
           
           indice++;
       }
        
        
        

      System.out.println("El segundo caracter en repetirse mas es: " + segundoMayorChar);
    }
    
}
