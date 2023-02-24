package logic;

import entity.Product;
import entity.Seller;

import java.util.Scanner;

public class SellerLogic {
    private Seller[] sellers;
    private int totalSeller;

    public SellerLogic(Seller[] sellers) {
    }

    public Seller[] getSellers() {
        return sellers;
    }

    public void setSellers(Seller[] sellers) {
        this.sellers = sellers;
    }

    public int getTotalSeller() {
        return totalSeller;
    }

    public void setTotalSeller(int totalSeller) {
        this.totalSeller = totalSeller;
    }

    public void addNewProduct() {
        System.out.println("Nhap so luong nhan vien muon them");
        int sellerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < sellerNum; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu " + (i + 1));
            Seller seller = new Seller();
            seller.inputInfor();
            saveSeller(seller);
            System.out.println("-------------------");
        }
    }

    private void saveSeller(Seller t) {
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] == null) {
                sellers[i] = t;
                break;
            }

        }
    }

    public void showSeller() {
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] != null) {
                System.out.println(sellers[i]);
            }
        }
    }
}