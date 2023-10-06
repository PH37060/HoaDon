/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class HoaDon {
    private String maHoadon,ngayTao,tenNhanVien;
    private double tongTien,tienKhachtra,tienThua;

    public HoaDon() {
    }

    public HoaDon(String maHoadon, String ngayTao, String tenNhanVien, double tongTien, double tienKhachtra, double tienThua) {
        this.maHoadon = maHoadon;
        this.ngayTao = ngayTao;
        this.tenNhanVien = tenNhanVien;
        this.tongTien = tongTien;
        this.tienKhachtra = tienKhachtra;
        this.tienThua = tienThua;
    }

    public String getMaHoadon() {
        return maHoadon;
    }

    public void setMaHoadon(String maHoadon) {
        this.maHoadon = maHoadon;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getTienKhachtra() {
        return tienKhachtra;
    }

    public void setTienKhachtra(double tienKhachtra) {
        this.tienKhachtra = tienKhachtra;
    }

    public double getTienThua() {
        return tienThua;
    }

    public void setTienThua(double tienThua) {
        this.tienThua = tienThua;
    }
    
}
