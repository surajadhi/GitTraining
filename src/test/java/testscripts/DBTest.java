package testscripts;

import java.sql.*;

public class DBTest{

    private static String url = "jdbc:sqlserver://10.213.0.155;"+
    					"databaseName=AdventureWorks2016;integratedSecurity=true;"
    					 
    					  + "loginTimeout=30;";
    
    
    //private static String userName = "sa";
    //private static String password = "myPassword";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RunDemo();
    }

    public static void RunDemo() {
        try {
        	System.setProperty("java.net.preferIPv6Addresses", "true");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT Name,TerritoryID FROM NewStateProvince");

            while(results.next()) {
                System.out.println("Name: " + results.getNString("Name") + " TerritoryID:" + results.getInt("TerritoryID"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}