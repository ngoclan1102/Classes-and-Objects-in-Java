
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng :");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài :");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        rectangle.display();
        System.out.println(rectangle.display());
        rectangle.getArea();
        System.out.println("Diện tích HCN = " + rectangle.getArea());
        rectangle.getPerimeter();
        System.out.println("Chu vi HCN = " + rectangle.getPerimeter());
    }

}
