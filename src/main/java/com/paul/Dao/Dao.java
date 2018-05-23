package com.paul.Dao;

import com.paul.User;
import org.springframework.beans.factory.annotation.Value;

import java.sql.*;

public class Dao {

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://192.168.32.130:5432/killme", "tist", "tist24231451");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
// public String create(String sql){
//        Connection con=null;
//        try {
//            con=getConnection();
//            PreparedStatement preparedStatement =con.prepareStatement(sql);
//            preparedStatement.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            if(con!=null){
//                try {
//                    con.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return "";
//    }
//
//    public String insert(User user){
//        Connection con=null;
//        try {
//            String sql="insert into test_(?,?,?)";
//            con=getConnection();
//            PreparedStatement preparedStatement =con.prepareStatement(sql);
//            preparedStatement.setString(1,user.getUserId());
//            preparedStatement.setInt(2,user.getUserNo());
//            preparedStatement.setBoolean(3,user.isDisabled());
//            preparedStatement.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            if(con!=null){
//                try {
//                    con.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return "";
//    }
//    public String update(String sql){
//        Connection con=null;
//        try {
//            con=getConnection();
//            PreparedStatement preparedStatement =con.prepareStatement(sql);
//            preparedStatement.executeUpdate();
//        } catch (Exception e) {
//        e.printStackTrace();
//        }finally {
//            if(con!=null){
//                try {
//                con.close();
//                } catch (Exception e) {
//                e.printStackTrace();
//                }
//            }
//        }
//    return "";
//    }
//
//    public String delete(String sql){
//    Connection con=null;
//    try {
//        con=getConnection();
//        PreparedStatement preparedStatement =con.prepareStatement(sql);
//        preparedStatement.executeUpdate();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }finally {
//        if(con!=null){
//            try {
//                con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    return "";
//}
}
