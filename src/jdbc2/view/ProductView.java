package jdbc2.view;

import jdbc2.entity.Product;

import java.util.ArrayList;

public class ProductView {
    public static void printHeader(){
        System.out.println("****************************");
        System.out.println("*******Product List*********");
        System.out.println("****************************");
    }

    public void printFooter(){
        System.out.println("*************************/.***");
        System.out.println("*******  End List  *********");
        System.out.println("****************************");
    }

    public void printProduct(ArrayList<Product> proList){
        for(Product p : proList){
            System.out.println("* 제품번호 :" +Product.getProNum());
            System.out.println("* 제품명 :" +Product.getProName());
            System.out.println("* 재고량 :" +Product.getProStock());
            System.out.println("* 단가 :" +Product.getPrice());
            System.out.println("* 제조업체 :" +Product.getProduceName());
            System.out.println();
        }
    }

}
