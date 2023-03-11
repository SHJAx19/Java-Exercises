import java.util.Scanner;

class RoundStaff {
    public static final double PI = 3.14159;

    public static void roundStaff(double radius) {

        System.out.println(PI * radius * radius);
    }

    public static void volume(double radius) {
        System.out.println(((4.0 / 3.0) * PI * radius * radius * radius));
    }

    public static void getArea() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Area of circle : PI * radius * radius\n");
        System.out.println("Volume of the sphere: 4/3 *PI * radius * radius * radius");
        System.out.println("----------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = sc.nextDouble();
        if (radius == 0) {
            getArea();
        } else {
            System.out.println("Radius of the circle: " + radius);
            System.out.println("--------------------------------");
            System.out.println("Area of the circle: ");
            roundStaff(radius);
            System.out.println("--------------------------------");
            System.out.println("A sphere of radius " + radius + " inches");
            System.out.print("has Volume of ");
            volume(radius);
            System.out.println("--------------------------------");
        }
    }

}
