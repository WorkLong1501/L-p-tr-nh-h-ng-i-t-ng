/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith;

import java.util.Scanner;

/**
 *
 * @author HUTECH
 */
public class BaiTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    DanhSach ds = new DanhSach();
    NhanVien nv;
    byte chon;
    Scanner doc=new Scanner(System.in);
    do{
    System.out.println("1: Them mot nhan vien");
    System.out.println("2: Xuat mot nhan vien");
    System.out.println("0: Thoat");
    System.out.println("Chon chuc nang:"); chon=doc.nextByte();
    switch(chon){
        case 1:
            System.out.println("1:bien che, 2: hop dong");
            byte loai=doc.nextByte();
            if (loai==1) nv=new NVBC();
            else nv=new NVHD();
            nv.input();
            ds.them(nv);
            break;
        case 2:
            System.out.println("Xuat danh sach 1:bien che, 2: hop dong");
            byte loaimh=doc.nextByte();
            ds.xuat(loaimh);
            break;
        default: chon=0; break;
        }
    }while (chon!=0);
    

    }
    
}