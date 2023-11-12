package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

import java.sql.Connection;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        //isso é uma forma de não precisar expor a implementação
        //é uma forma de fazer uma injeção de dependência sem explicitar a implementação
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao creeateDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
