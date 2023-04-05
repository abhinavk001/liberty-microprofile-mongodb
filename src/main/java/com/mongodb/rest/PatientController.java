package com.mongodb.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("getpatient")
public class PatientController {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPatient(){
        return "HelloWorld";
    }
}
