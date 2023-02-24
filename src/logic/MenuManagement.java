package logic;
import constant.ProductType;
import entity.Product;
import entity.Seller;
import entity.SellerManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuManagement {
    private SellerLogic sellerLogic;
    private ProductLogic productLogic;
    private SellerManagementLogic sellerManagementLogic;

    public MenuManagement() {

        Seller[] sellers = new Seller[1000];
        sellerLogic = new SellerLogic(sellers);
        Product[] products = new Product[1000];
        productLogic = new ProductLogic(products);
        SellerManagement[] sellerManagements = new SellerManagement[1000];
        sellerManagementLogic = new SellerManagementLogic(sellerManagements, sellerLogic, productLogic);

    }

    public void menu() {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    productLogic.addNewProduct();
                    break;
                case 2:
                    productLogic.showProduct();
                    break;
                case 3:
                    sellerLogic.addNewProduct();
                    break;
                case 4:
                    sellerLogic.showSeller();
                    break;
                case 5:
                    sellerManagementLogic.showSellerManagement();
                    break;
                case 6:
                    sellerManagementLogic.sortBySellerName();
                    break;
                case 7:
                    sellerManagementLogic.tinhDoanhThu();
                case 8:
                    return;

            }

        }
    }

    private void showMenu() {
        System.out.println("======QUAN LY NHAN VIEN BAN HANG");
        System.out.println("1.Nhap mat hang moi");
        System.out.println("2.In ra danh sach mat hang moi");
        System.out.println("3.Nhap nhan vien moi");
        System.out.println("4. In ra danh sach nhan vien moi");
        System.out.println("5. Bang danh sach ban hang cho tung nhan vien");
        System.out.println("6.Sap xep nhan vien");
        System.out.println("7.Doanh thu cua moi nhan vien");
        System.out.println("8.Thoat");
    }

    private int chooseFunction() {
        int choice = 0;
        System.out.print("Nhap lua chon: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 8) {
                break;
            }
            System.out.print("Vui long chon lai ");
        } while (true);
        return choice;
    }
}
