/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLCB {

    public static void main(String[] args) {
        List<CanBo> list = new ArrayList<>();
        int luaChon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------------------");
            System.out.println("MENU");
            System.out.println("1.Them moi can bo");
            System.out.println("2.Tim kiem theo ho va ten");
            System.out.println("3.Danh sach cac can bo");
            System.out.println("0.Thoat khoi chuong trinh");
            System.out.println("Chon: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    CanBo cb = new CanBo();
                    System.out.println("1.Cong Nhan");
                    System.out.println("2.Ky Su");
                    System.out.println("3.Nhan Vien");
                    System.out.println("Chon");
                    int luaChon1 = sc.nextInt();
                    switch (luaChon1) {
                        case 1:
                            cb = new CongNhan();
                            break;
                        case 2:
                            cb = new KySu();
                            break;
                        case 3:
                            cb = new NhanVien();
                    }
                    cb.nhapThongTin();
                    list.add(cb);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("nhap ho va ten can tim kiem: ");
                    String hoTen = sc.nextLine();
                    for (CanBo canBo : list) {
                        if (canBo.getHoVaTen().equals(hoTen)) {
                            System.out.println("thong tin nguoi can tim kiem: " + canBo.inThongTin());
                        } else {
                            System.out.println("khong tim thay ten hop le");
                        }
                    }
                    break;
                case 3:
                    for (CanBo canBo : list) {
                        System.out.println(canBo.inThongTin());
                    }
                    break;
                default:
                    break;
            }

        } while (luaChon!= 0);
    }
}
