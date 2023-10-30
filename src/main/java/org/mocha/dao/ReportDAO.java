package org.mocha.dao;


import jakarta.enterprise.context.ApplicationScoped;
import org.mocha.base.BaseDAO;
import org.mocha.entity.Report;

@ApplicationScoped
public class ReportDAO extends BaseDAO<Report> {
    public ReportDAO() {
        super(Report.class);
    }
}
