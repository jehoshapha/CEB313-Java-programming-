import java.time.LocalDateTime;
import java.util.Objects;

public class Emergency {
    private final String callerName;
    private final String callerPhone;
    private final String emergencyLocation;
    private final String natureOfEmergency;
    private final LocalDateTime timeOfReport;
    private String responseType;
    private String responseStatus;

    // Constructor to initialize the instance variables
    public Emergency(String callerName, String callerPhone, String emergencyLocation, String natureOfEmergency) {
        this.callerName = Objects.requireNonNull(callerName, "Caller name cannot be null");
        this.callerPhone = Objects.requireNonNull(callerPhone, "Caller phone cannot be null");
        this.emergencyLocation = Objects.requireNonNull(emergencyLocation, "Emergency location cannot be null");
        this.natureOfEmergency = Objects.requireNonNull(natureOfEmergency, "Nature of emergency cannot be null");
        this.timeOfReport = LocalDateTime.now();
        this.responseType = "Unassigned";
        this.responseStatus = "Pending";
    }

    // Getters for the instance variables
    public String getCallerName() {
        return callerName;
    }

    public String getCallerPhone() {
        return callerPhone;
    }

    public String getEmergencyLocation() {
        return emergencyLocation;
    }

    public String getNatureOfEmergency() {
        return natureOfEmergency;
    }

    public LocalDateTime getTimeOfReport() {
        return timeOfReport;
    }

    public String getResponseType() {
        return responseType;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    // Method to update the response type
    public void setResponseType(String responseType) {
        this.responseType = Objects.requireNonNull(responseType, "Response type cannot be null");
    }

    // Method to update the response status
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = Objects.requireNonNull(responseStatus, "Response status cannot be null");
    }

    // Method to provide a detailed description of the emergency
    public String getEmergencyDetails() {
        return String.format(
            "Emergency Report\n" +
            "----------------\n" +
            "Caller Name: %s\n" +
            "Caller Phone: %s\n" +
            "Location: %s\n" +
            "Nature of Emergency: %s\n" +
            "Time of Report: %s\n" +
            "Response Type: %s\n" +
            "Response Status: %s\n",
            callerName, callerPhone, emergencyLocation, natureOfEmergency, timeOfReport, responseType, responseStatus
        );
    }

    // Main method to test the Emergency class
    public static void main(String[] args) {
        // Creating Emergency objects
        Emergency emergency1 = new Emergency("John Doe", "555-1234", "123 Main St", "Fire");
        Emergency emergency2 = new Emergency("Jane Smith", "555-5678", "456 Elm St", "Medical");

        // Displaying Emergency details
        System.out.println(emergency1.getEmergencyDetails());
        System.out.println(emergency2.getEmergencyDetails());

        // Updating response type and status
        emergency1.setResponseType("Fire Truck");
        emergency1.setResponseStatus("Dispatched");
        emergency2.setResponseType("Ambulance");
        emergency2.setResponseStatus("On Route");

        // Displaying updated Emergency details
        System.out.println(emergency1.getEmergencyDetails());
        System.out.println(emergency2.getEmergencyDetails());
    }
}
