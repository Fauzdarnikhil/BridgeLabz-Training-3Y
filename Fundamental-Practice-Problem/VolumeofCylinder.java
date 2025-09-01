import java.util.*;

public class VolumeofCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();

        int area = (int) (Math.PI * r * r * h);

        System.out.println(area);
    }
}
