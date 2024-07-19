package com.example.studentsystem.controller;

import com.example.studentsystem.dto.StudentDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialize {
    public static void main(String[] args) {
        try {
            // JSON string to be deserialized
            String jsonString = "{\"name\":\"Alice Smith\",\"phone\":\"123-456-7890\",\"email\":\"alice@example.com\"}";

            // Create ObjectMapper instance
            ObjectMapper mapper = new ObjectMapper();

            // Deserialize the JSON string to a Contact object
            StudentDTO studentDTO = mapper.readValue(jsonString, StudentDTO.class);
            System.out.println("Deserialized Contact: " + studentDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
