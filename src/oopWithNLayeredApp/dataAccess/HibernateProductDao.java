package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

    public class HibernateProductDao implements ProductDao {//dao data access object
        public void add(Product product) {
            //sadece database erişim kodları buraya yazılır...SQL
            System.out.println("Hibernate ile veri tabanına eklendi...");
        }


    }



