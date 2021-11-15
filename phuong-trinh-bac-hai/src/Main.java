import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a :");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b :");
        double b = scanner.nextDouble();
        System.out.println("Nhập số c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.getDiscriminant();
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm !");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Ngiệm của phương trình là : " + quadraticEquation.getRoot1());
        }else {
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        }
    }
}
