import java.sql.*;
public class SQLExceptionDemo {
    public static void main(String[] args) throws SQLException {
        throw new SQLException("Database error");
    }
}