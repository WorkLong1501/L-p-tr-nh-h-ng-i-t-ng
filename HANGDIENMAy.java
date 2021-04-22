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
public class HANGDIENMAy  extends HANGHOA{
    
    private String TGBH;
    private String DA;
    private Long CS;

    /**
     * @return the TGBH
     */
    public String getTGBH() {
        return TGBH;
    }

    /**
     * @param TGBH the TGBH to set
     */
    public void setTGBH(String TGBH) {
        this.TGBH = TGBH;
    }

    /**
     * @return the DA
     */
    public String getDA() {
        return DA;
    }

    /**
     * @param DA the DA to set
     */
    public void setDA(String DA) {
        this.DA = DA;
    }

    /**
     * @return the CS
     */
    public Long getCS() {
        return CS;
    }

    /**
     * @param CS the CS to set
     */
    public void setCS(Long CS) {
        this.CS = CS;   
    }

    public HANGDIENMAy(){}
    
    public HANGDIENMAy(String TGBH, String DA, Long CS) {
        this.TGBH = TGBH;
        this.DA = DA;
        this.CS = CS;
    }

    public HANGDIENMAy(String TGBH, String DA, Long CS, String MaHang, String Tenhang, long DonGia) {
        super(MaHang, Tenhang, DonGia);
        this.TGBH = TGBH;
        this.DA = DA;
        this.CS = CS;
    }
    
    @Override
    public void Nhap ()
    {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap TG BH");
        TGBH = sc.nextLine();
        System.out.println("Nhap Dien Ap");
        DA = sc.nextLine();
        System.out.println("Nhap cong suat");
        CS = sc.nextLong();        
    }
    
    @Override
    public void Xuat()
    {
        super.Xuat();
        System.out.println(TGBH +"\t" + DA + "\t" + CS);
    }
    
}