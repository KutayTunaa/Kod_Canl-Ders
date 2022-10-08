package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {//dao data access object
    public void add(Product product) {
        //sadece database erişim kodları buraya yazılır...SQL
        System.out.println("JDBC ile veri tabanına eklendi...");
    }


}
//Hibernate geldi (yeni sistem ve buna aktarıyoruz)

