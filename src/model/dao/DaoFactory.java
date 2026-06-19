package model.dao;

//Classe auxiliar responsavel por instanciar os DAOS, tera operações estaticas para instanciar os DAOS

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
