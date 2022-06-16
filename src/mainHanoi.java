
import java.util.Scanner;


public class mainHanoi {

    public static void main(String[] args) {
        int n;
        Scanner guarda = new Scanner (System.in);        
        mainHanoi objHanoi = new mainHanoi();
        System.out.println("Ingrese la cantidad de discos: ");
        n=guarda.nextInt();
        objHanoi.torresHanoi(n,1,2,3);
        System.out.println("+++++Juego Completado+++++");
    }
    
    //Metodo recursivo para Hanoi
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        //caso base
        if (discos==1) {
            System.out.println("Mover Disco de Torre " +torre1 + " a Torre " +torre3);
        }else{
            //dominio
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover Disco de Torre " +torre1 + " a Torre " +torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }

}
//Elfego Adair Juarez Arias UAEMEX
