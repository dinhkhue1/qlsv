package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helper.Dattabasehelper;
import com.mycompany.poly.app.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String TenDangNhap, String MatKhau) throws Exception{
       String sql = "select TenDangNhap, MatKhau, VaiTro from NguoiDung" 
               + " where TenDangNhap = ? and MatKhau = ?";
       try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           pstmt.setString(1, TenDangNhap);
           pstmt.setString(2, MatKhau);
           
           try(ResultSet rs = pstmt.executeQuery();){
               if(rs.next()){
                   NguoiDung nd = new NguoiDung();
                   nd.setTenDangNhap(TenDangNhap);
                   nd.setVaiTro(rs.getString("VaiTro"));
                   return nd;
               }
           }
                   
        
       }
       return null;
    }

    /*public NguoiDung checkLogin(String text, String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }*/
}
