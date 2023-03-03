import java.util.Scanner;
public class ejercicio1
{
    public static void main(String args[])
    {
        int num;
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num=sc.nextInt();
        while (num <= 0)
        {
            System.out.println("error, debe ser un número mayor que cero");
            num=sc.nextInt();
        }
        x = 0;
        while (num != 1)
        {
            if (num % 2 == 0)
                num = num / 2;
            else
                num = 3 * num + 1;
            System.out.print(num + "\t");
            x = x+1;
        }
    }
}