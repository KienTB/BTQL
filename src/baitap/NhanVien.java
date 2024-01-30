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
public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String congViec, String hoVaTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NhanVien( ) {
       
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao cong viec: ");
        this.congViec = sc.nextLine();
    }
     public String inThongTin(){
         return "Nhan Vien: " + super.inThongTin() + "cong viec: " + this.congViec;
     }
}
