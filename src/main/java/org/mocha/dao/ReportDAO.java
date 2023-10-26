package org.mocha.dao;


import org.mocha.base.BaseDAO;
import org.mocha.entity.Report;

public class ReportDAO extends BaseDAO<Report> {

    public ReportDAO(Class<Report> entityClass) {
        super(entityClass);
    }
}
