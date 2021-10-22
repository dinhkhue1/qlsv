package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helper.Dattabasehelper;
import com.mycompany.poly.app.model.NguoiDung;
import com.mycompany.poly.app.model.SinhVien;
import java.util.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Admin
 */
public class SinhVienDao {
    public boolean insert(SinhVien sv) throws Exception{
        String sql = "INSERT INTO [dbo].[SinhVien]([MaSinhVIen],[HoTen],[Email],[SoDT],[DiaChi],[GioiTinh],[Hinh])"+
                " values(?,?,?,?,?,?,?)";
        
           
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           pstmt.setString(1, sv.getMaSinhVIen());
           pstmt.setString(2, sv.getHoTen());
           pstmt.setString(3, sv.getEmail());
           pstmt.setString(4, sv.getSoDT());
           pstmt.setString(5, sv.getDiaChi());
           pstmt.setInt(6,sv.getGioiTinh());
           if(sv.getHinh()!= null){
               Blob hinh = new SerialBlob(sv.getHinh());
               pstmt.setBlob(7, hinh);
           }
           else{
              Blob hinh =null;
              pstmt.setBlob(7, hinh);
           }
           return pstmt.executeUpdate()>0;
       }
       
    }
    public boolean update(SinhVien sv) throws Exception{
        String sql = "UPDATE dbo.SinhVien" +
            " SET HoTen = ?, Email = ?, SoDT = ?, GioiTinh = ?, DiaChi = ?, Hinh = ? "+
                " where MaSinhVien = ?";
        
           
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           pstmt.setString(7, sv.getMaSinhVIen());
           pstmt.setString(1, sv.getHoTen());
           pstmt.setString(2, sv.getEmail());
           pstmt.setString(3, sv.getSoDT());
           pstmt.setString(5, sv.getDiaChi());
           pstmt.setInt(4,sv.getGioiTinh());
           if(sv.getHinh()!= null){
               Blob hinh = new SerialBlob(sv.getHinh());
               pstmt.setBlob(6, hinh);
           }
           else{
              Blob hinh =null;
              pstmt.setBlob(6, hinh);
           }
           return pstmt.executeUpdate()>0;
       }
       
    }
    public boolean delete(String MaSinhVIen) throws Exception{
        String sql = "delete from SinhVien" +
            " where MaSinhVIen = ?";
        
           
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           pstmt.setString(1, MaSinhVIen);
           return pstmt.executeUpdate()>0;
       }
       
    }
    public SinhVien findById(String MaSinhVIen) throws Exception{
        String sql = "select * from SinhVien where MaSinhVien = ?";
        
           
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           pstmt.setString(1, MaSinhVIen);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    return sv;

                }
            } 
           return null;
       }     
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVIen(rs.getString("MaSinhVien"));
        sv.setHoTen(rs.getString("HoTen"));
        sv.setEmail(rs.getString("Email"));
        sv.setSoDT(rs.getString("SoDT"));
        sv.setDiaChi(rs.getString("DiaChi"));
        sv.setGioiTinh(rs.getInt("GioiTinh"));
        Blob blob = rs.getBlob("Hinh");
        if(blob != null){
            sv.setHinh(blob.getBytes(1, (int) blob.length()));
        }
        return sv;
    }
    public List< SinhVien> findAll() throws Exception{
       
        String sql = "select * from SinhVien";
        
           
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            try(ResultSet rs = pstmt.executeQuery();){
                List< SinhVien> list = new ArrayList<>();
                while(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    list.add(sv);

                }
                return list;
            } 
       }     
    }
}
