package logic;

import entity.Product;

import java.util.Scanner;

public class ProductLogic {
    private Product[] products;
    private int totalProduct;

    public ProductLogic(Product[] products) {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }
    public void addNewProduct(){
        System.out.println("Nhap so luong san pham muon them");
        int num= new Scanner(System.in).nextInt();
        for (int i = 0; i < num ; i++) {
            System.out.println("Nhap thong tin cho san pham thu " + (i+1));
            Product product= new Product();
            product.inputInfor();
            saveProduct(product);
            System.out.println("-------------------");


        }
        totalProduct+=num;


    }
    private void saveProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i]== null){
                products[i]= product;
                break;
            }

        }
    }
    public void showProduct(){
        for (int i = 0; i < products.length; i++) {
            if (products[i]!=null){
                System.out.println(products[i]);
            }
        }
    }


}
