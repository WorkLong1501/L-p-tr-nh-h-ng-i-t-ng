/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanghoabai2;

import java.util.Scanner;

/**
 *
 * @author HUTECH
 */
public class HANGHOA {
    private String MaHang;
    private String TenHang;
    private long DonGia;

    /**
     * @return the MaHang
     */
    public String getMaHang() {
        return MaHang;
    }

    /**
     * @param MaHang the MaHang to set
     */
    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    /**
     * @return the Tenhang
     */
    public String getTenHang() {
        return TenHang;
    }

    /**
     * @param Tenhang the Tenhang to set
     */
    public void setTenHang(String Tenhang) {
        this.TenHang = Tenhang;
    }

    /**
     * @return the DonGia
     */
    public long getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(long DonGia) {
        this.DonGia = DonGia;
    }

    public HANGHOA(){}
    
    public HANGHOA(String MaHang, String Tenhang, long DonGia) {
        this.MaHang = MaHang;
        this.TenHang = Tenhang;
        this.DonGia = DonGia;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma Hang");
        MaHang = sc.nextLine();
        System.out.println("Nhap Ten Hang");
        TenHang = sc.nextLine();
        System.out.println("Nhap don gia");
        DonGia = sc.nextLong();        
    }
    
    public void Xuat()
    {
        System.out.println(MaHang +"\t" + TenHang + "\t" + DonGia);
    }
            
}