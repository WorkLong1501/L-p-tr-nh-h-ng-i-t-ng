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
public class HangHoaBai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte chon;
        Scanner doc=new Scanner(System.in);
        DSHANGHOA dshh=new DSHANGHOA();
        HANGHOA h;
        do{
            System.out.println("1: Them mot mat hang vao dang sach");
            System.out.println("2: Xuat mat hang theo loai");
            System.out.println("0: Thoat");
            System.out.println("Chon chuc nang:"); chon=doc.nextByte();
            switch(chon){
            case 1:
                System.out.println("1: hang dien may, 2: hang thuc pham. Hay chon loai mat hang:");
                byte loai=doc.nextByte();
                if (loai==1) h=new HANGDIENMAy();
                else h=new HANGTHUCPHAM();
                h.Nhap();
                dshh.themMH(h);
                break;
            case 2:
                System.out.println("Xuat danh sach mat hang nao (DM/TP):");
                byte loaimh=doc.nextByte();
                dshh.xuatDSTheoLoai(loaimh);
                break;
            default: chon=0; break;
            }
        }while (chon!=0);
        
    }
    
}