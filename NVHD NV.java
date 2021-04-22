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
public class NVHD extends NhanVien{
    long tiencong1ngay;
	//static long luongcanban;

    public long getTiencong1ngay() {
        return tiencong1ngay;
    }

    public void setTiencong1ngay(long tiencong1ngay) {
        this.tiencong1ngay = tiencong1ngay;
    }
    
	
	NVHD()
	{
            tiencong1ngay = 0;
	}
	
	NVHD(String m, String ht, int ns, long tiencong)
	{
            hoten = ht;
		ma = m;
		namsinh = ns;
            tiencong1ngay = tiencong;
	}	
        
	
	// tu viet cac phuong thuc can thiet
        public double tinhLuong(){
            luong = ngaylamviec * tiencong1ngay;
            double thuong = 0;
            if(duocKhenThuong()== true) thuong = luong*15/100;
            luong += thuong;
            return luong;
        }
	public void input(){
        super.inputData();
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Nhap tien cong 1 ngay: ");
			tiencong1ngay = Integer.parseInt(input.readLine());	
		}
		catch(IOException e)
		{
		}    
        }
        
	public void output(){
            super.outData();
            System.out.println("tien cong 1 ngay la: " + tiencong1ngay );
        }
	public boolean duocKhenThuong(){
            if(ngaylamviec > 26)
                return true;
            else return false;
        }
}