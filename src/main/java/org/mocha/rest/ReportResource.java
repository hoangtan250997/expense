package org.mocha.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.mocha.dao.ReportDAO;
import org.mocha.entity.Report;

@Path("check")
@ApplicationScoped
public class ReportResource {
    @Inject
    ReportDAO reportDAO;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response getAll(){
        Report report = Report.builder()
                .name("1")
                .build();

        return Response.ok(reportDAO.findAll()).build();
    }
}
