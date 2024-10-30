package jdbc2.controller;

import jdbc.JDBCConnecter;
import jdbc2.entity.Product;
import jdbc2.repository.ProductRepository;
import jdbc2.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainConroller {
    public static void main(String[] args) {
    ArrayList<Product> arrList=ProductRepository.getList();
        printView(arrList);

    }



    public static void printView(ArrayList<Product> arrList) {
        ProductView view=new ProductView();
        ProductView.printHeader();
        view.printProduct(arrList);
        view.printFooter();

    }
}

