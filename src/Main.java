
import java.util.*;
public class Main {
public static int leer(){
int lec;    
Scanner i = new Scanner (System.in);
lec = i.nextInt(); 
return lec;
}
public String leerstring(){
String lec;    
Scanner i = new Scanner (System.in);
lec = i.nextLine(); 
return lec;
}

public static boolean consignar (int deposito, int cuenta, int clave  ){
    System.out.println("Inserte su numero de cuenta");
    cuenta = leer ();
    System.out.println("Inserte su clave");
   return true;
    } 

    public static void main(String[] args) {
        Banco A = new Banco(1012, 1234, "Magdalena sanchez ", 0);
        Banco B =  new Banco(1013, 9876, "Joselito Perez ", 500000);
        int deposito = leer();
        A.consignar(deposito);
    }
}

