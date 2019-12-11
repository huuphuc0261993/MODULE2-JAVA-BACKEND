package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sql {
    private String jdbcURL = "jdbc:mysql://localhost:3306/new_schema";
    private String jdbcUsername = "huuphuc0261993";
    private String jdbcPassword = "Cccv0103@";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }


    public void getColumn() {
        String ABC = "SELECT * FROM City";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ABC);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            System.out.println(numberOfColumns);
            for (int i = 1; i < numberOfColumns + 1; i++) {
                String columnName = rsMetaData.getColumnName(i);
                String tableName = rsMetaData.getTableName(i);
                String typeName = rsMetaData.getColumnTypeName(i);
                String c = rsMetaData.getColumnClassName(i);
                String catalogName = rsMetaData.getCatalogName(i);
                int columnDisplaySize = rsMetaData.getColumnDisplaySize(i);
                String schemaName = rsMetaData.getSchemaName(i);

                System.out.println("schemaName " + schemaName);
                System.out.println("catalogName " + catalogName);
                System.out.println("tableName " + tableName);
                System.out.println("columnName " + columnName);
                System.out.println("typeName " + typeName);
                System.out.println("columnDisplaySize " + columnDisplaySize);
                System.out.println("c " + c);
                System.out.println();

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void getTable() throws SQLException {
//        List<String> table = new ArrayList<>();
//        Connection conn = getConnection();
//        Statement st = conn.createStatement();
//        DatabaseMetaData meta = conn.getMetaData();
//        ResultSet rs = meta.getTables(conn.getCatalog(), null, "%", new String [] {"TABLE"});
//        while (rs.next()) {
//            String tableName = rs.getString("TABLE_NAME");
//            table.add(tableName);
//            System.out.println(tableName);
//        }
//        st.close();
//        conn.close();
//    }

    public List<String> getTable() throws SQLException {
        List<String> table = new ArrayList<>();
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        DatabaseMetaData meta = conn.getMetaData();
        ResultSet rs = meta.getTables(conn.getCatalog(), null, "%", new String[]{"TABLE"});
        while (rs.next()) {
            String tableName = rs.getString("TABLE_NAME");
            table.add(tableName);
//            System.out.println(tableName);
        }
        st.close();
        conn.close();
        return table;
    }

//    public void getData() throws SQLException {
//        List<String> tb = getTable();
//        Connection conn = getConnection();
//        Statement st = conn.createStatement();
//
//        for (int j = 0; j < tb.size(); j++) {
////            System.out.println(tb.get(j));
//
//            String ABC = "SELECT * FROM " + tb.get(j);
//            ResultSet rs = st.executeQuery(ABC);
//            ResultSetMetaData rsMetaData = rs.getMetaData();
//            int numberOfColumns = rsMetaData.getColumnCount();
//
//            if (tb.get(j).equals(rsMetaData.getTableName(j))) {
//
//                for (int i = 1; i < numberOfColumns + 1; i++) {
////                System.out.println(rsMetaData.getTableName(i));
//
//                    String columnName = rsMetaData.getColumnName(i);
//                    String tableName = rsMetaData.getTableName(i);
//                    String typeName = rsMetaData.getColumnTypeName(i);
//                    String c = rsMetaData.getColumnClassName(i);
//                    String catalogName = rsMetaData.getCatalogName(i);
//                    int columnDisplaySize = rsMetaData.getColumnDisplaySize(i);
//                    String schemaName = rsMetaData.getSchemaName(i);
//
//                    System.out.println("tb " + tb.get(j));
//                    System.out.println("schemaName " + schemaName);
//                    System.out.println("catalogName " + catalogName);
//                    System.out.println("tableName " + tableName);
//                    System.out.println("columnName " + columnName);
//                    System.out.println("typeName " + typeName);
//                    System.out.println("columnDisplaySize " + columnDisplaySize);
//                    System.out.println("c " + c);
//                    System.out.println();
//
//                }
//            }
//        }
//    }


//    public void getData() throws SQLException {
//        List<String> tbs = getTable();
//        Connection conn = getConnection();
//        Statement st = conn.createStatement();
//        for (String tb : tbs) {
//
//            String ABC = "SELECT * FROM " + tb;
//            ResultSet rs = st.executeQuery(ABC);
//            ResultSetMetaData rsMetaData = rs.getMetaData();
//            int numberOfColumns = rsMetaData.getColumnCount();
//            System.out.println(numberOfColumns);
//            System.out.println("table " + tb);
//
//            for (int i = 1; i < numberOfColumns + 1; i++) {
//                if (tb.equals(rsMetaData.getTableName(i))) {
//
//                    String columnName = rsMetaData.getColumnName(i);
//                    String typeName = rsMetaData.getColumnTypeName(i);
//                    String c = rsMetaData.getColumnClassName(i);
//                    int columnDisplaySize = rsMetaData.getColumnDisplaySize(i);
//
//                    System.out.println("columnName " + columnName);
//                    System.out.println("typeName " + typeName);
//                    System.out.println("columnDisplaySize " + columnDisplaySize);
//                    System.out.println(c);
//                    System.out.println();
//
//                }
//            }
//        }
//    }



}