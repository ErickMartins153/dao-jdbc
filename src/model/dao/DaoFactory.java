package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        //isso é uma forma de não precisar expor a implementação
        //é uma forma de fazer uma injeção de dependência sem explicitar a implementação
        return new SellerDaoJDBC();
    }
}
