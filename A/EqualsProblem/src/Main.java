public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5,3);
        Point p2 = new Point(5,3);
        Point p3 = p2;

        System.out.println("p1 == p2 " + (p1 == p2));
        System.out.println("p1 == p3 " + (p1 == p3));
        System.out.println("p3 == p2 " + (p3 == p2));



        Point3D p4 = new Point3D(4, 5, 0);
        Point3D p5 = new Point3D(4, 5, 6);
        Point   p6 = new Point  (4, 5);

        System.out.println("p4 equals p5 " + (p4.equals(p5)));
        System.out.println("p5 equals p4 " + (p5.equals(p4)));
        System.out.println("p4 equals p6 " + (p4.equals(p6)));
        System.out.println("p6 equals p4 " + (p6.equals(p4)));
        System.out.println("p5 equals p6 " + (p5.equals(p6)));
        System.out.println("p6 equals p5 " + (p6.equals(p5)));

//        System.out.println("p1.equals(p2) " + (p1.equals(p2)));
//        System.out.println("p1.equals(p3) " + (p1.equals(p3)));
//        System.out.println("p3.equals(p2) " + (p3.equals(p2)));

        System.out.println("Other: " + p1.equals("Hello World!"));
    }
}