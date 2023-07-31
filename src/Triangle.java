import java.util.Scanner;
import java.lang.Math;
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, s;
        double area;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a + b > c && a + c > b && b + c > a)
        {
            s = (a + b + c) / 2;

            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.printf("Triangle  area is :%f", area);
        }else{
            System.out.println("Area is not possible.");
        }
    }
}
