package CoreJava.Typecasting;

public class Main {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        JetPlane jp = new JetPlane();
        Plane p = new Plane();

        AirPort ap = new AirPort();
        System.out.println("================================");
        System.out.println("Cargo plane");
        ap.allowPlane(cp);
        System.out.println("================================");
        System.out.println("Jet Plane");
        ap.allowPlane(jp);
        System.out.println("================================");
        System.out.println("Generic plane");
        ap.allowPlane(p);
    }
}
