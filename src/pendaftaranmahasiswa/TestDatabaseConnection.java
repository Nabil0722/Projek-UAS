/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendaftaranmahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * 
 */
public class TestDatabaseConnection {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Koneksi berhasil!");
            } else {
                System.out.println("Koneksi gagal!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
