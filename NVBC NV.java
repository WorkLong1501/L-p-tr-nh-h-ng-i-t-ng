/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HUTECH
 */
public class NVBC extends NhanVien{
    double hesoluong, phucap;
	static long luongcanban;

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public double getPhucap() {
        return phucap;
    }

    public void setPhucap(double phucap) {
        this.phucap = phucap;
    }

    public static long getLuongcanban() {
        return luongcanban;
    }

    public static void setLuongcanban(long luongcanban) {
        NVBC.luongcanban = luongcanban;
    }
	
        
	NVBC()
	{
            hesoluong = phucap = luongcanban = 0;
	}
	
	NVBC(String m, String ht, int ns, double hs, double pc)
	{
                hoten = ht;
		ma = m;
		namsinh = ns;
                hesoluong = hs;
                phucap = pc;
                
	}	
        
	
	// tu viet cac phuong thuc can thiet
	public double tinhLuong(){
            luong = luongcanban * hesoluong + phucap;
            double thuong = 0;
            if(duocKhenThuong()== true) thuong = luong*20/100;
            luong += thuong;
            return luong;
        }
	public void input(){
            super.inputData();
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Nhap he so luong : ");
			hesoluong = Float.parseFloat(input.readLine());
			System.out.print("Nhap phu cap: ");
			phucap = Float.parseFloat(input.readLine());
			System.out.print("Nhap luong can ban: ");
			luongcanban = Integer.parseInt(input.readLine());	
		}
		catch(IOException e)
		{
		}
        }
	public void output(){
            super.outData();
            System.out.println("he so luong: " + hesoluong +
				    " phu cap: " + phucap + "Luong can ban: " + luongcanban);
        }
	public boolean duocKhenThuong(){
            if(ngaylamviec > 20 && hesoluong > 2.5)
                return true;
            else return false;
        }
}