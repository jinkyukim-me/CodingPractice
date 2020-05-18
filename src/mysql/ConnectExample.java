package mysql;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectExample {
    public static void main(String[] args) {

        Connection con = null;

        String server = "localhost";
        String database = "ksoccer";
        String user_name = "root";
        String password = "l2k3j4h5";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }


        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
            System.out.println("정상적으로 연결되었습니다.");
        }
        catch (SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }

        try {
            if (con != null)
                con.close();
        }
        catch (SQLException e) {

        }
    }
}
