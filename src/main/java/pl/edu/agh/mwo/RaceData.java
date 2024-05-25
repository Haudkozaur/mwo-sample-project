package pl.edu.agh.mwo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RaceData {

    @JsonProperty("lap_number")
    int lap_Number;

    @JsonProperty("driver_number")
    int driver_number;
    @JsonProperty("pit_duration")
    double pit_duration;

    void printParameters() {
        System.out.println("lap number: " + lap_Number + "\n");
        System.out.println("driver number: " + driver_number + "\n");
        System.out.println("pit duration: " + pit_duration + "\n");
        System.out.println("________________________________________________________________"+"\n");

    }


}
