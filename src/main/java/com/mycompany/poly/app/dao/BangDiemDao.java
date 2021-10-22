package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helper.Dattabasehelper;
import com.mycompany.poly.app.model.BangDiem;
import com.mycompany.poly.app.model.SinhVien;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Admin
 */
public class BangDiemDao {
    public boolean insert(BangDiem bd) throws Exception{
        String sql = "INSERT INTO [dbo].[BangDiem]([MaSinhVIen], [TiengAnh],[C],[Java],[GiaiTich]) values(?,?,?,?,?)";
  
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           
           pstmt.setString(1, bd.getMaSinhVIen());
           pstmt.setFloat(2, bd.getTiengAnh());
           pstmt.setFloat(3, bd.getC());
           pstmt.setFloat(4, bd.getJava());
           pstmt.setFloat(5, bd.getGiaiTich());
           return pstmt.executeUpdate()>0;
       }
       
    }
    public boolean update(BangDiem bd) throws Exception{
        String sql = "UPDATE [dbo].[BangDiem] "+
                " SET [TiengAnh] = ?,[C] = ?,[Java] = ?,[GiaiTich] = ? "+
                " WHERE [MaSinhVien] = ?";
        

        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           
           pstmt.setString(5, bd.getMaSinhVIen());
           pstmt.setFloat(1, bd.getTiengAnh());
           pstmt.setFloat(2, bd.getC());
           pstmt.setFloat(3, bd.getJava());
           pstmt.setFloat(4, bd.getGiaiTich());
           return pstmt.executeUpdate()>0;
       }  
    }
    public boolean deleteByMaSinhVien(String MaSinhVien) throws Exception{
        String sql = "delete from BangDiem "+
                "WHERE [MaSinhVien] = ?";
        

        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           
           pstmt.setString(1, MaSinhVien);
           return pstmt.executeUpdate()>0;
       }  
    }
    public BangDiem findByMaSinhVien(String MaSinhVien) throws Exception{
        String sql = "select * from BangDiem WHERE [MaSinhVien] = ?";
        

        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           
           pstmt.setString(1, MaSinhVien);
           try(ResultSet rs = pstmt.executeQuery();){
               if(rs.next()){
                   BangDiem bd = createBangDiem(rs);
                   
                   return bd;
               }
           }
           return null;
       }  
    }
    public List<BangDiem> findAll(String MaSinhVien) throws Exception{
        String sql = "select * from BangDiem ";
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           
           
           try(ResultSet rs = pstmt.executeQuery();){
               List<BangDiem> list = new ArrayList<>();
               while(rs.next()){
                   BangDiem bd = createBangDiem(rs);
                   list.add(bd);
               }
               return list;
           }
       }  
    }

    private BangDiem createBangDiem(final ResultSet rs) throws SQLException {
        BangDiem bd = new BangDiem();
        bd.setMa(rs.getInt("Ma"));
        bd.setMaSinhVIen(rs.getString("MaSinhVien"));
        bd.setTiengAnh(rs.getFloat("TiengAnh"));
        bd.setC(rs.getFloat("C"));
        bd.setJava(rs.getFloat("Java"));
        bd.setGiaiTich(rs.getFloat("GiaiTich"));
        return bd;
    }
    public List<BangDiem> findTop(int Top) throws Exception{
        String sql = "select Top "+ Top +" *, (TiengAnh + C + Java + GiaiTich)/4 as DTB "+
                " from BangDiem order by dtb desc";
        try(
               Connection con = Dattabasehelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
           ){
           
           
           try(ResultSet rs = pstmt.executeQuery();){
               List<BangDiem> list = new ArrayList<>();
               while(rs.next()){
                   BangDiem bd = createBangDiem(rs);
                   list.add(bd);
               }
               return list;
           }
       }  
    }
}
