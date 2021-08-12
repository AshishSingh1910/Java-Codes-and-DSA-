import java.util.Scanner;
public class AreaofCircle{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter radius ");
        int r = in.nextInt();

        int area = 3.14 * r * r;
        System.out.println(area);

    }
}