import java.util.*;
public class NumeroPerfecto
{
    public static void main(String[] args)
    {
        int counter=0, suma = 0, numero=0;
        Scanner kb= new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = kb.nextInt();


        for (counter= 1; counter< numero; counter++) {
            if (numero%counter == 0) {
                suma = suma + counter;
            }
        }
        if (suma == numero) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }
}
