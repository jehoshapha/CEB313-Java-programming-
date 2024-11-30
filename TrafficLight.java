// Define the TrafficLight enum with three constants: RED, GREEN, and YELLOW
public enum TrafficLight {
    // Constants with their respective durations
    RED(30), // 30 seconds for the red light
    GREEN(45), // 45 seconds for the green light
    YELLOW(5); // 5 seconds for the yellow light

    // Private field to store the duration of each light
    private final int duration;

    // Constructor to initialize the duration for each light
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Public method to get the duration of the light
    public int getDuration() {
        return duration;
    }
}


