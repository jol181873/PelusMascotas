/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ws.jol181873.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author usrcur200
 */
@RequestScoped
public class PeluResource {

    private String id;

    /**
     * Creates a new instance of PeluResource
     */
    private PeluResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the PeluResource
     * @param id
     * @return 
     */
    public static PeluResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of PeluResource class.
        return new PeluResource(id);
    }

    /**
     * Retrieves representation of an instance of org.ws.jol181873.PeluResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
       
        
        return "sdfgsdf";
    }

    /**
     * PUT method for updating or creating an instance of PeluResource
     * @param content representation for the resource
     * @return 
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String putJson(String content) {        
        return "Example PUT";
    }

    /**
     * DELETE method for resource PeluResource
     */
    @DELETE
    public void delete() {
    }
}
