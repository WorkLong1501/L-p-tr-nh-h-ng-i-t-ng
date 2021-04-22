/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith;

/**
 *
 * @author HUTECH
 */
public class DanhSach {
    private int SL;
    private NhanVien ds[];

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public NhanVien[] getDs() {
        return ds;
    }

    public void setDs(NhanVien[] ds) {
        this.ds = ds;
    }

    public DanhSach() {
        ds = new NhanVien[30];
    }

    public DanhSach(int SL, NhanVien[] ds) {
        this.SL = SL;
        this.ds = ds;
    }
    
    public void them(NhanVien nv){

        //DSHANGHOA = new HANGHOA[SL];
        //DSHANGHOA[SL].Nhap();
        ds[SL] = nv;
        SL ++;
    }
    public void xuat(byte loai){
        for (int i= 0 ; i<SL; i++)
        {
            if(loai == 1 && ds[i] instanceof NVBC)
                ds[i].output();
            if(loai != 1 && ds[i] instanceof NVHD)
                ds[i].output();
        }
    }
}