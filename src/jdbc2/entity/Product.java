package jdbc2.entity;

public class Product {

    private static String proNum; // 제품번호
    private static String proName; //제품명
    private static int proStock; //재고량
    private static int price; // 단가
    private static String produceName; //제조업체


    public static String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    public static String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public static int getProStock() {
        return proStock;
    }

    public void setProStock(int proStock) {
        this.proStock = proStock;
    }

    public static int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }
}

