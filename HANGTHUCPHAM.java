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
public class HANGTHUCPHAM extends HANGHOA{
    
    private int NSX;
    private int HSD;

    /**
     * @return the NSX
     */
    public int getNSX() {
        return NSX;
    }

    /**
     * @param NSX the NSX to set
     */
    public void setNSX(int NSX) {
        this.NSX = NSX;
    }

    /**
     * @return the HSD
     */
    public int getHSD() {
        return HSD;
    }

    /**
     * @param HSD the HSD to set
     */
    public void setHSD(int HSD) {
        this.HSD = HSD;
    }

    public HANGTHUCPHAM(){}
    
    public HANGTHUCPHAM(int NSX, int HSD) {
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public HANGTHUCPHAM(int NSX, int HSD, String MaHang, String Tenhang, long DonGia) {
        super(MaHang, Tenhang, DonGia);
        this.NSX = NSX;
        this.HSD = HSD;
    }
    
    @Override
    public void Nhap()
    {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap TG BH");
        NSX = sc.nextInt();
        System.out.println("Nhap Dien Ap");
        HSD = sc.nextInt();
              
    }
    
    @Override
    public void Xuat()
    {
        super.Xuat();
        System.out.println(NSX +"\t" + HSD);
    }
    
}