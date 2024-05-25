package pl.edu.agh.mwo;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class JSONParser {

    void parseJSON() {
        try {
            // create object mapper instance
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            List<RaceData> raceData = objectMapper.readValue(new File("pitstops-data.json"), new TypeReference<List<RaceData>>() {});

            for (RaceData data : raceData) {
                data.printParameters();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
