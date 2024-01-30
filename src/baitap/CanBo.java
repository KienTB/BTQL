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
public class CanBo {

    private String hoVaTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoVaTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        if (equals("nam".equals(gioiTinh) || "nu".equals(gioiTinh))) {
            this.gioiTinh = gioiTinh;
        }
        this.diaChi = diaChi;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CanBo() {
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho va ten: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("nhap vao tuoi: ");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        // Nhập giới tính và kiểm tra hợp lệ
        System.out.println("nhap vao gioi tinh: ");
        String gioitinh = sc.nextLine();
        if ("nam".equals(gioitinh) || "nu".equals(gioitinh)) {
            this.gioiTinh = gioitinh;
        }
        System.out.println("nhap vao dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public String inThongTin() {
        return this.hoVaTen + " - " + this.tuoi + " - " + this.gioiTinh + " - " + this.diaChi + "\n";
    }
}
