package matriz;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    System.out.println("DE QUE TAMAÑO QUIERE LA MATRIZ");
    int cantidad=leer.nextInt();
    int matriz [][]= new int[cantidad][cantidad];
    for(int i=0; i<cantidad; i++){
        for(int j=0; j<cantidad; j++){
            
            if((i==0)||(i==4)){
                
                matriz[i][j]=1;    
            }
            else if(j==0||j==4){
            
                matriz[i][j]=1;
        }
            System.out.print( matriz[i][j]+" ");
        }
    System.out.println("");
    }
    }
}

