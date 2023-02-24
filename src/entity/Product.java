package entity;

import constant.ProductType;

import java.util.Scanner;

public class Product implements Inputable {
    private int productId;
    private String productName;
    private String productType;
    private int price;
    private int quantity;
    private static int AUTO_ID = 1000;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.println("Nhap ma san pham : ");
        this.productId= new Scanner(System.in).nextInt();
        System.out.println("Nhap ten mat hang : ");
        this.productName = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten nhom hang : ");
        this.productType = new Scanner(System.in).nextLine();
        System.out.println("Nhap gia mat hang : ");
        this.price = new Scanner(System.in).nextInt();
        System.out.println("Nhap so luong mat hang : ");
        this.quantity = new Scanner(System.in).nextInt();
        this.productId=AUTO_ID;
        AUTO_ID++;
        System.out.println("Chon nhom mat hang ban muon : ");
        System.out.println("1. Dien tu ");
        System.out.println("2. Dien lanh ");
        System.out.println("3. May  tinh ");
        System.out.println("4. Thiet bi van phong ");
        System.out.println("Xin moi chon");

        int temp=0;
        do {
            temp=new Scanner(System.in).nextInt();
            if (temp >= 1 && temp <4) {
                break;
            }
            System.out.println("Lua chon khong hop le, vui long chon lai");

        }while (true);

        switch (temp){
            case 1:
                this.productType= String.valueOf(ProductType.DIEN_TU);
                break;
            case 2:
                this.productType= String.valueOf(ProductType.DIEN_LANH);
                break;
            case 3:
                this.productType= String.valueOf(ProductType.MAY_TINH);
                break;
            case 4:
                this.productType= String.valueOf(ProductType.THIET_BI_VAN_PHONG);
                break;
        }




    }
}
