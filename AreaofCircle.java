import java.util.*;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int area = (int)(Math.PI * r * r);
        System.out.println(area);
    }
}
