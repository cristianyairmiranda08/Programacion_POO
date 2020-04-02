package matrizx;
import java.lang.*;
import java.io.*;
import java.util.*;


public class MatrizX {

  
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    System.out.println("DE QUE TAMAÑO QUIERE LA MATRIZ");
    int cantidad=leer.nextInt();
    int matriz [][]= new int[cantidad][cantidad];
    for(int i=0; i<matriz.length; i++){
        for(int j=0; j<matriz.length; j++){
            
            if((i==j)||(i+j == matriz.length-1)){
                
                matriz[i][j]=1;    
            }
            else {
                matriz[i][j]=0;
        }
            System.out.print( matriz[i][j]+" ");
        }
    System.out.println("");
    }
    }
}
