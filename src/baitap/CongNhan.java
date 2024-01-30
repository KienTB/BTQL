/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CongNhan extends CanBo {

    private int bac;

    public CongNhan(int bac, String hoVaTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        if (bac >= 1 && bac <= 10) {
            this.bac = bac;
        } else {
            System.out.println("bac khong hop le");
        }
    }

    public CongNhan() {
        
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao thu bac tu 1 - 10: ");
        this.bac = sc.nextInt();
    }
    
    public String inThongTin(){
        return "Cong nhan: " + super.inThongTin() + "cap bac: " + this.bac;
    }
    
}
