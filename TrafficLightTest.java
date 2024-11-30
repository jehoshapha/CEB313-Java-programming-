// Class to test the TrafficLight enum
public class TrafficLightTest {
    // Main method to run the test
    public static void main(String[] args) {
        // Loop through each constant of the TrafficLight enum
        for (TrafficLight light : TrafficLight.values()) {
            // Print the name of the light and its duration
            System.out.println(light + " light duration: " + light.getDuration() + " seconds");
        }
    }
}