package dao;

import Util.DataBaseUtil;

import java.sql.*;

/**
 * Created by fake2edison on 2018/11/1.
 */
public class UserDao {

    public String regiestUser(String username, String phoneNum, String password) {
        String tmp = "false";
        Connection conn = DataBaseUtil.getConnection();
        String sql = "insert into User(NAME,PHONE,PASSWORD) VALUES (?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,phoneNum);
            ps.setString(3,password);
            ps.executeUpdate();
            ps.close();
            tmp = "success";
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DataBaseUtil.closeConnection(conn);
        }
        return tmp;

    }

    public String loginUser(String phoneNum, String password){
        String tmp = "false";
        Connection conn = DataBaseUtil.getConnection();
        String sql = "select * from User where PHONE = ? and PASSWORD = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phoneNum);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                tmp = "success";
            }
            rs.close();
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DataBaseUtil.closeConnection(conn);
        }
        return tmp;
    }

}
