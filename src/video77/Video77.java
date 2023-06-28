
package video77;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a[],b[],c[];
        int i,j;
        
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        System.out.println("Digite el primer arreglo");
        for (i=0;i<12;i++){
            System.out.print((i+1)+". Digite un numero ");
            a[i] = teclado.nextInt();
        }
        System.out.println("Digite el segundo arreglo");
        for ( i=0;i<12;i++){
            System.out.print((i+1)+". Digite un numero ");
            b[i] = teclado.nextInt();
        }
        
        i=0;
        j=0;
        
        while(i<12){
            for (int k=0;k<3;k++){
                c[j] = a[i+k];
                j++;
            }
            for (int k=0;k<3;k++){
                c[j] = b[i+k];
                j++;
            }
            i+=3;
        }
        System.out.print("El arreglo resultante es:");
        for(i=0;i<24;i++){
            System.out.print(c[i]+" - ");
        }
        System.out.println();
    }
    
}
