package logic;

import constant.ProductType;
import entity.Seller;
import entity.SellerManagement;
import entity.SellerManagementDetail;

import java.util.Scanner;

public class SellerManagementLogic {
    private final SellerLogic sellerLogic;
    private SellerManagementDetail[] sellerManagementDetails;
    private SellerManagement[] sellerManagement;
    private ProductLogic productLogic;

    public SellerManagementLogic(SellerManagement[] sellerManagements, SellerLogic sellerLogic, ProductLogic productLogic) {
        this.sellerManagement = sellerManagements;
        this.productLogic = productLogic;
        this.sellerLogic = sellerLogic;

    }

    public void danhSachBanHang() {
        System.out.println("Ban muon nhap danh sach ban hang cho bao nhieu nguoi : ");
        int soLuongNhanVien;
        do {
            soLuongNhanVien = new Scanner(System.in).nextInt();
            if (soLuongNhanVien > 0 && soLuongNhanVien <= sellerLogic.getTotalSeller()) {

                break;
            }
            System.out.println("vui long nhap lai ");

        } while (true);
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhan vien thu" + (i + 1) + "ma ban muon lap danh sach ban hang, nhap ma nhan vien");
            Seller nhanVien = nhapNhanVien();
            System.out.println("Nha vien do ban may loai mat hang ");
            int soLoaiMatHang;
            do {
                soLoaiMatHang = new Scanner(System.in).nextInt();
                if (soLoaiMatHang >= 1 && soLoaiMatHang <= 4 && soLoaiMatHang <= productLogic.getTotalProduct()) {
                    break;
                }
            } while (true);
            SellerManagement danhSach = new SellerManagement(nhanVien, soLoaiMatHang);


        }


    }

    public void showSellerManagement() {
        for (int i = 0; i < sellerManagement.length; i++) {
            if (sellerManagement[i] != null) {
                System.out.println(sellerManagement[i]);
            }

        }
    }

    private Seller nhapNhanVien() {
        int idNhanVien;
        Seller nhanVien = null;
        return nhanVien;
    }

    public void sortBySellerName() {
        for (int i = 0; i < sellerManagement.length - 1; i++) {
            if (sellerManagement[i] == null) {
                continue;
            }

            for (int j = i + 1; j < sellerManagement.length; j++) {
                if (sellerManagement[j] == null) {
                    continue;
                }
                if (sellerManagement[i].getSeller().getName().trim().compareToIgnoreCase(sellerManagement[j].getSeller().getName().trim()) > 0) {
                    SellerManagement temp = sellerManagement[i];
                    sellerManagement[i] = sellerManagement[j];
                    sellerManagement[j] = temp;
                }
            }
        }
    }
    public void tinhDoanhThu(){
        for (int i = 0; i < sellerLogic.getSellers().length; i++) {
            double doanhThu = 0;
            SellerManagement motnhanvien = sellerManagement[i];
            SellerManagement soluong = motnhanvien.getSellerManagementDetails();
            for (int j = 0; j < soluong.length, j++) {

            }

            }

        }
    }
    }



