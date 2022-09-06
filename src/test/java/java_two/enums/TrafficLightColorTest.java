package java_two.enums;

public class TrafficLightColorTest {
    public static void makeDrivingDecision(TraficLightColor color){
        switch (color){
            case RED -> System.out.println("STOP");
            case YELLOW -> System.out.println("SPEED UP");
            case GREEN -> System.out.println("GO");
        }
    }
    public static void main(String[] args) {
     TraficLightColor current = TraficLightColor.GREEN;
     makeDrivingDecision(current);
    }
}
