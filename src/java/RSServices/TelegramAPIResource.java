/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSServices;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author zkmatu
 */
@Path("TelegramAPI")
public class TelegramAPIResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TelegramAPIResource
     */
    public TelegramAPIResource() {
    }

    /**
     * Retrieves representation of an instance of RSServices.TelegramAPIResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/registernewguest")
    public String addGuestToWeddingBook() {
        String response="";
        
        
        return response;
    }

   
}
