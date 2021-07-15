import java.util.Scanner;
public class EJERCICIO02
{
    public static void main(String[] ARGS)
    {
        Scanner LEER = new Scanner(System.in);
        int NUMERO;

        System.out.print("INGRESE EL NUMERO : ");
        NUMERO = LEER.nextInt();

        if(NUMERO % 2 == 0 )
        {
            System.out.println("EL NUMERO QUE USTED INGRESO ES PAR");
        }
        else
        {
            System.out.println("EL NUMERO QUE USTED INGRESO ES IMPAR");
        }
    }
}

