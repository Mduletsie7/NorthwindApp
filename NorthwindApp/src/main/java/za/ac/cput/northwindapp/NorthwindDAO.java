/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.northwindapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mdumisi Letsie
 */
public class NorthwindDAO {

    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/Northwind";
    private static final String username = "administrator";
    private static final String password = "password";

    public static boolean loadData(Northwind northwind) {
        boolean valid = true;

        Connection connection = null; // manage connection
        PreparedStatement statement = null; // query statement
        ResultSet rs = null;
        String sql = "SELECT * FROM Employees WHERE employeeid = ?";

        try {
            connection = DriverManager.getConnection(DATABASE_URL, username, password);

            statement = connection.prepareStatement(sql);
            statement.setInt(1, northwind.getID());

            rs = statement.executeQuery();
            if (rs.next()) {
                northwind.setLastName(rs.getString(2));
                northwind.setFirstName(rs.getString(3));
                northwind.setTitle(rs.getString(4));
                northwind.setTOC(rs.getString(5));
                northwind.setBirthDate(rs.getString(6));
                northwind.setHireDate(rs.getString(7));
                northwind.setAddress(rs.getString(8));
                northwind.setCity(rs.getString(9));
                northwind.setHomePhone(rs.getString(10));
                northwind.setNotes(rs.getString(11));
                northwind.setReportsTo(rs.getInt(12));
                northwind.setPhotoPath(rs.getString(13));
                //user.set(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));

            } else {
                valid = false;
            }
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "Error: " + sqlException.getMessage());
            valid = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            valid = false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Error: " + exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Error: " + exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
        }
        return valid;
    }

    public static void updateData(Northwind northwind) {

        Connection connection = null; // manage connection
        Statement statement = null; // query statement
        int ok;
        String sql = "UPDATE employees SET lastname = '" + northwind.getLastName()+"', firstname = '" + northwind.getFirstName()+"', title = '" + northwind.getTitle()+"', titleofcourtesy = '" + northwind.getTOC()+"', birthdate = '" + northwind.getBirthDate()+"', hiredate = '" + northwind.getHireDate()+"', address = '" + northwind.getAddress()+"', city = '" + northwind.getCity()+"', homephone = '" + northwind.getHomePhone()+"', notes = '" + northwind.getNotes()+"', reportsto = " + northwind.getReportsTo()+", photopath = '" + northwind.getPhotoPath()+"' WHERE employeeid = " + northwind.getID()+"";

        try {
            connection = DriverManager.getConnection(DATABASE_URL, username, password);
            statement = connection.createStatement();
            ok = statement.executeUpdate(sql);

            if (ok > 0) {
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            } else {
            JOptionPane.showMessageDialog(null, "Error: Could not update!");
            }

        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "Error: " + sqlException.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public static void deleteData(Northwind northwind) {
        boolean valid = true;

        Connection connection = null; // manage connection
        PreparedStatement statement = null; // query statement
        ResultSet rs = null;
        String sql = "SELECT * FROM Employees WHERE employeeid = ?";

      /*try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "DELETE FROM Registration " +
            "WHERE id = 101";
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }*/
    }
}
