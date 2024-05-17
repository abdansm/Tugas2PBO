package mvcMysql;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ABDAN SM
 */
public class ModelMovie {
    private String judul;
    protected double alur;
    protected double penokohan;
    protected double akting;
    protected double nilai;
    
   static final String DB_URL = "jdbc:mysql://localhost:3306/movie_db";
   static final String USER = "root";
   static final String PASS = "";
   
   public Statement st;
   public ResultSet rs;
   Connection cn = mvcMysql.Koneksi.Koneksi();
   String QUERY;
  
    
   public void updateData(){
   try {
    st = cn.createStatement();
    st.executeUpdate("UPDATE movie set " 
        + "judul='"       + judul + "', "
        + "alur='"      + alur + "', "
        + "penokohan='"   + penokohan + "', "
        + "akting='"        + akting + "', "
        + "nilai='"    + nilai + "' where judul='"+judul +"'");
    
    
  } catch (Exception e) {
    e.printStackTrace();
  }
   
   }
   
   
    public void simpanData(){
    try{
    st = cn.createStatement();
    
    st.executeUpdate("INSERT INTO movie VALUES('" + judul + "','"
        + alur + "','"
        + penokohan + "','"
        + akting + "','"
        + nilai + "')");
    JOptionPane.showMessageDialog(null,"Simpan Berhasil");
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    }
    
   
    
    
    public void setJudul(String judulBaru){
        this.judul = judulBaru;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public void setAlur(double alurBaru){
        this.alur = alurBaru;
    }
    
    public double getAlur(){
        return alur;
    }

    public void setPenokohan(double penokohanBaru){
        this.penokohan = penokohanBaru;
    }
    
    public double getPenokohan(){
        return penokohan;
    }

    public void setAkting(double aktingBaru){
        this.akting = aktingBaru;
    }
    
    public double getAkting(){
        return akting;
    }
    
    public void setNilai(double nilaiBaru){
        this.nilai = nilaiBaru;
    }
    
    public double getNilai(){
        return nilai;
    }
    
}
