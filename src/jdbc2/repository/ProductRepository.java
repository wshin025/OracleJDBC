package jdbc2.repository;

import jdbc.JDBCConnecter;
import jdbc2.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository {
    public static ArrayList<Product> getList() {
        ArrayList<Product> arrlist = new ArrayList<Product>();
        Connection conn = JDBCConnecter.getConnection();
        String sql = "select * from 제품";
        //문장객체 생성
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProNum(rs.getString("제품번호"));
                product.setProName(rs.getString("제품명"));
                product.setProStock(rs.getInt("재고량"));
                product.setPrice(rs.getInt("단가"));
                product.setProduceName(rs.getString("제조업체"));
                arrlist.add(product);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrlist;
    }
}