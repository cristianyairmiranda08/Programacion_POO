package tarea_2;
import java.util.Scanner;
public class Tarea_2 {
    public static void main(String[] args) {   
    Scanner teclado = new Scanner (System.in);
    int n,m;
    boolean numeroCorrecto = false;
    do {
            System.out.print("Ingrese cantidad de filas");
            n = teclado.nextInt();
            System.out.print("Ingrese cantidad de columnas");
            m = teclado.nextInt();
            if (n==4 && m==4){
                numeroCorrecto = true;
            }else {
                System.out.println("Error");
            }
            System.out.println("");
}while(!numeroCorrecto);
char matriz[][] = new char [n][m];
    
    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if ((i+j)==3){
                matriz[i][j] = ' ';
            }
                else{
                        matriz[i][j] = 'x';
                        }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
}
    }