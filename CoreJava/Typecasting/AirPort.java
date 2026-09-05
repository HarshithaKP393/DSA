package CoreJava.Typecasting;

public class AirPort {
    void allowPlane (Plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}
