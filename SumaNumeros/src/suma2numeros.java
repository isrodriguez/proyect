import java.util.Arrays;
import java.util.Scanner;

public class suma2numeros {
    static int n1,n2;
    static cSuma obj= new cSuma();//static sirve para que una variable no pierda el valor, tenga un espacio en memoria. si  se puede cambiar el valor
    public static void main(String[] args) {
        pedirDatos();
        operacion();
        mostrar();
    }
    public static void pedirDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        n1= sc.nextInt();
        System.out.println("Ingrese otro numero ");
        n2= sc.nextInt();
    }
    public static void operacion(){
        obj.setDatos(n1,n2);
    }
    public static void mostrar(){
        System.out.println("El resultado de la suma es= "+obj.getSuma());
    }

}
