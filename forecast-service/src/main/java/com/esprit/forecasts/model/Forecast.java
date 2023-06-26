package com.esprit.forecasts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Forecast {
        @Id
        private String id;
        private String city;
        private double temperature;
        private int humidity;
        private String description;
}
