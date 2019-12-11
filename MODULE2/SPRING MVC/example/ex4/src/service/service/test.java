package service;
import java.sql.*;

//import java.sql.ResultSetMetaData;

public class test {

    public static void main(String[] args) {

        String JdbcURL="jdbc:mysql://localhost:3306/new_schema";
        String Username="huuphuc0261993";
        String password="Cccv0103@";
        Connection con=null;
        Statement stmt=null;
        ResultSet rs;
        try {
            con = DriverManager.getConnection(JdbcURL, Username, password);
            stmt=con.createStatement();
            rs = stmt.executeQuery("SELECT *FROM new_schema.Person");
            ResultSetMetaData md =  rs.getMetaData();
            int counter = md.getColumnCount();
            String colName[] = new String[counter];
            System.out.println("The column names are as follows:");
            for (int loop = 1; loop <= counter; loop++) {
                colName[loop-1] = md.getColumnLabel(loop);
                System.out.println(colName[loop-1]);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
//        System.out.println("sasd");
    }
}
