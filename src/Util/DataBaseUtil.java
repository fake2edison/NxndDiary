package Util;

import java.sql.*;

/**
 * Created by fake2edison on 2018/11/1.
 */
public class DataBaseUtil {


    /*获取数据库连接*/
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //数据库信息
            String userName="root";
            //密码
            String userPasswd="15geDXD";
            //数据库名
            String dbName="NxndDiary";
            //表名--用户表
            String url="jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+userPasswd+"&characterEncoding=utf8&useSSL=false";
            conn = DriverManager.getConnection(url);
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    // 关闭数据库连接
    public static void closeConnection(Connection conn){
        if(conn!=null){
            try{
                conn.close();//关闭数据库连接
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

}
