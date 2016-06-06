/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ws.jol181873.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 * REST Web Service
 *
 * @author usrcur200
 */
@Path("/ps")
@RequestScoped
public class PeluqueriasResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PelusResource
     */
    public PeluqueriasResource() {
    }

    /**
     * Retrieves representation of an instance of org.ws.jol181873.PeluqueriasResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {        
        JSONObject jSONObject = new JSONObject(this);
        return jSONObject.toString();
    }

    /**
     * POST method for creating an instance of PeluResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String postJson(String content) {
        try {
            JSONObject jSONObject = new JSONObject(content);
        } catch (JSONException ex) {
            Logger.getLogger(PeluqueriasResource.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "Your web service works so well !!!";
    }

    /**
     * Sub-resource locator method for {id}
     * @param id
     * @return 
     */
    @Path("{id}")
    public PeluResource getPeluResource(@PathParam("id") String id) {
        return PeluResource.getInstance(id);
    }
}
