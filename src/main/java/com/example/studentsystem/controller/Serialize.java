package com.example.studentsystem.controller;

import com.example.studentsystem.dto.StudentDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialize {
    public static void main(String[] args) {
        try {
            // Create a contact object
            StudentDTO studentDTO = new StudentDTO("Alice Smith", "123-456-7890", "alice@example.com");

            // Create ObjectMapper instance
            ObjectMapper mapper = new ObjectMapper();

            // Serialize the contact object to JSON
            String jsonString = mapper.writeValueAsString(studentDTO);
            System.out.println("Serialized JSON: " + jsonString);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
