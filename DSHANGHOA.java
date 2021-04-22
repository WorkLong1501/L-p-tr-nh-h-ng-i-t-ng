/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanghoabai2;

/**
 *
 * @author HUTECH
 */
public class DSHANGHOA {
    private int SL;
    private HANGHOA []DSHANGHOA;

    /**
     * @return the SL
     */
    public int getSL() {
        return SL;
    }

    /**
     * @param SL the SL to set
     */
    public void setSL(int SL) {
        this.SL = SL;
    }

    /**
     * @return the DSHANGHOA
     */
    public HANGHOA[] getDSHANGHOA() {
        return DSHANGHOA;
    }

    /**
     * @param DSHANGHOA the DSHANGHOA to set
     */
    public void setDSHANGHOA(HANGHOA[] DSHANGHOA) {
        this.DSHANGHOA = DSHANGHOA;
    }

    public DSHANGHOA(){
        DSHANGHOA = new HANGHOA[30];
    }
    
    public DSHANGHOA(int SL, HANGHOA[] DSHANGHOA) {
        this.SL = SL;
        this.DSHANGHOA = DSHANGHOA;
    }
    
    public void themMH(HANGHOA h){
        
        //DSHANGHOA = new HANGHOA[SL];
        //DSHANGHOA[SL].Nhap();
        DSHANGHOA[SL] = h;
        SL ++;
    }
    public void xuatDSTheoLoai(byte loai){
        for (int i= 0 ; i<SL; i++)
        {
            if(loai == 1 && DSHANGHOA[i] instanceof HANGDIENMAy)
                DSHANGHOA[i].Xuat();
            if(loai != 1 && DSHANGHOA[i] instanceof HANGTHUCPHAM)
                DSHANGHOA[i].Xuat();
        }
        
    }
}