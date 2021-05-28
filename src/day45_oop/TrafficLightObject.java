package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        TrafficLight trafficLightObject = new TrafficLight();
        trafficLightObject.changeColor("Red");
        trafficLightObject.showColor();

        trafficLightObject.changeColor("Green");
        trafficLightObject.showColor();
    }


}
