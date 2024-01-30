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
public class KySu extends CanBo {

    private String nganhDaoTao;

    public KySu(String nganhDaoTao, String hoVaTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu( ) {

    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("nhap nganh dao tao: ");
        this.nganhDaoTao = sc.nextLine();
    }
    
    public String inThongTin(){
        return "Ky Su: " + super.inThongTin() + "nganh dao tao: " + this.nganhDaoTao;
    }
}
