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
abstract  class NhanVien {
    
    String hoten,ma;
    int namsinh, ngaylamviec;
    double luong;
    static int count = 0;
	NhanVien()
	{
		hoten = ma =null;
		namsinh = 1980;
		ngaylamviec = 0;
		count++;
	}
	NhanVien(String t,String m,int n)
	{
		hoten = t;
		ma = m;
		namsinh = n;
		count++;
	}
	abstract double tinhLuong();
	abstract void input();
	abstract void output();
	abstract boolean duocKhenThuong();
	public void inputData()
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Nhap ma so: ");
			ma = input.readLine();
			System.out.print("Nhap ho ten: ");
			hoten = input.readLine();
			System.out.print("Nhap nam sinh: ");
			namsinh = Integer.parseInt(input.readLine());
			System.out.print("Nhap so ngay lam viec trong thang: ");
			ngaylamviec = Integer.parseInt(input.readLine());
		}
		catch(IOException e)
		{
		}
	}
	void outData()
	{
		System.out.println(ma+" Ho & Ten: " + hoten +
				    "  Nam sinh: " + namsinh + "Luong: " + tinhLuong());
	}
}