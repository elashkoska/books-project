package com.example.demo.objects;

import com.example.demo.dto.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMappingTest {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("BMW", "black");

        String carAsString = objectMapper.writeValueAsString(car);

        System.out.println(carAsString);

        ObjectMapper objectMapper1 = new ObjectMapper();
        String json = "{\"type\":\"BMW\",\"colour\":\"black\"}";

        Car car2 = objectMapper1.readValue(json, Car.class);
        System.out.println(car2);


    }
}
