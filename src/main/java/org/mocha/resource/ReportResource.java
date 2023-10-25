package org.mocha.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.mocha.dao.ReportDAO;

@Path("/report")
public class ReportResource {
    @Inject
    private ReportDAO reportDAO;
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAll(){
        return Response.ok(reportDAO.findAll()).build();
    }
}
