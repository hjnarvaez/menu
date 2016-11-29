package menu.vector;

import java.util.Scanner;

public class MenuVector {

    public static void main(String[] args) {
        int[] A ;
        int[] B ;
        int[] C ;
        int limiteA,limiteB;
        Scanner sc=new Scanner(System.in);
        limiteA = sc.nextInt();
        limiteB=sc.nextInt();
              for (int x=0;x<numeros.length;x++)
  numeros[x] = (int) (Math.random()*9)+1;
    }
     public void MostrarVector(int Vector[]) {
        System.out.print("Vector = [ ");
        for (int i = 0; i < Vector.length; i++) {
            System.out.print(" " + Vector[i] + " ");
        }
        System.out.print(" ]\n");
    }

    public int TamañoVector() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del su vector:");
        int tam = teclado.nextInt();
        return tam;
    }

    public int[] IngresarVector(int Vector[]) {
        for (int i = 0; i < Vector.length; i++) {
            System.out.print("Ingrese valor en V[" + i + "]:");
        }
        return Vector;
    }

    public int MaxVector(int[] Vector) {

        int Max = 1;

        for (int i = 0; i < Vector.length; i++) {
            if (Vector[i] > Max) {
                Max = Vector[i];
            }
        }

        return Max;
    }

    public int MimVector(int[] Vector) {

        int Min;
        Min = Vector[0];

        for (int i = 0; i < Vector.length; i++) {
            if (Vector[i] < Min) {
                Min = Vector[i];
            }
        }
        return Min;
    }
}
