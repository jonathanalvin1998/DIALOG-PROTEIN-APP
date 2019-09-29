package com.example.mahasiswa.Model;

public class MahasiswaSI {
    private String nama;
    private String nim;
    private int img;
    private String hobi;
    private String cita2;
    private String moto;

    public MahasiswaSI(String nama, String nim, String hobi, String cita2, String moto, int img) {
        this.nama = nama;
        this.nim = nim;
        this.hobi = hobi;
        this.img = img;
        this.cita2 = cita2;
        this.moto = moto;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getCita2() {
        return cita2;
    }

    public void setCita2(String cita2) {
        this.cita2 = cita2;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {this.img = img;
    }
}
