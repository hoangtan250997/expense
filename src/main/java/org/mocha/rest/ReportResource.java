package org.mocha.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.mocha.dao.ReportDAO;
import org.mocha.dao.UserDAO;
import org.mocha.entity.Report;
import org.mocha.entity.Status;
import org.mocha.service.ReportService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Path("reports")
@ApplicationScoped
public class ReportResource {
    @Inject
    ReportService reportService;


    @POST
    @Transactional
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response createBlankReport(@HeaderParam("userId") int userId) {
        return Response.ok(reportService.createBlankReport(userId)).build();
    }

    @PUT
    @Transactional
    @Path("/{reportId}")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updatedBlankReport(@PathParam("reportId") int id, Report report) {
        return Response.ok(reportService.updateReport(id, report)).build();
    }
}
