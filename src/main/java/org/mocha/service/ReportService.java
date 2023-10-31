package org.mocha.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.mocha.dao.ReportDAO;
import org.mocha.dao.UserDAO;
import org.mocha.entity.Report;
import org.mocha.entity.Status;

import java.time.LocalDateTime;

@ApplicationScoped
public class ReportService {
    @Inject
    ReportDAO reportDAO;

    @Inject
    UserDAO userDAO;

    public Report createBlankReport(int userId) {
        Report report = Report.builder()
                .user(userDAO.findById(userId).get())
                .userName(userDAO.findById(1).get().getName())
                .status(Status.DRAFT)
                .startPeriod(LocalDateTime.now())
                .endPeriod(LocalDateTime.now())
                .build();
        return reportDAO.create(report);
    }

    public Report updateReport(int id, Report reportDTO) {
        Report report = reportDAO.findById(id).get();

        Report updateReport = Report.builder()
                .id(id)
                .userName(reportDTO.getUserName())
                .build();
        return reportDAO.udpate(updateReport);
    }

    public Report getReportById(int id){
        return reportDAO.findById(id).get();
    }
}
