import java.sql.*;

/**
 * Created by ruslangramatic on 4/18/18.
 */
public class TestDb {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }

        Connection connection = null;
        try {
            //step 1
            connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root");
            //step 2
            Statement statement = connection.createStatement();
            //step 3
            statement.executeUpdate("DROP DATABASE IF EXISTS java_elementary_hillel");
            //step 4
            statement.executeUpdate("CREATE DATABASE java_elementary_hillel");
            //step 5
            statement.executeUpdate("use java_elementary_hillel");
            //step 6
            statement.executeUpdate("CREATE TABLE `Room` (\n" +
                    "\t`id` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` VARCHAR(64) NOT NULL,\n" +
                    "\t`description` VARCHAR(128) NOT NULL,\n" +
                    "\t`account_1_id` INT DEFAULT NULL,\n" +
                    "\t`account_2_id` INT DEFAULT NULL,\n" +
                    "\tPRIMARY KEY (`id`)\n" +
                    ");");
            //step 7
            statement.executeUpdate("INSERT INTO `Room`\n" +
                    "    (`name`,`description`)\n" +
                    "VALUES\n" +
                    "    ('Kiev','Kiev Room'),\n" +
                    "    ('Chisinau','Chisinau Room'),\n" +
                    "    ('Islamabad','Islamabad Room'),\n" +
                    "    ('London','London Room'),\n" +
                    "    ('Paris','Paris Room'),\n" +
                    "    ('Tokyo','Tokyo Room'),\n" +
                    "    ('Berlin','Berlin Room'),\n" +
                    "    ('Ottawa','Ottawa Room'),\n" +
                    "    ('Washington','Washington Room'),\n" +
                    "    ('Athens','Athens Room'),\n" +
                    "    ('Rome','Rome Room'),\n" +
                    "    ('Copenhagen','Copenhagen Room'),\n" +
                    "    ('Beijing','Beijing Room'),\n" +
                    "    ('New Delhi','New Delhi Room'),\n" +
                    "    ('Madrid','Madrid Room'),\n" +
                    "    ('Moscow','Moscow Room'),\n" +
                    "    ('New York','New York Room');");

            //step 8
            ResultSet rs = statement.executeQuery("select * from Room");
            while(rs.next()) {
                System.out.println(" id=" + rs.getInt("id") +
                        " name=" + rs.getString("name") +
                        " description=" + rs.getString("description") +
                        " account_1_id=" + rs.getInt("account_1_id") +
                        " account_2_id=" + rs.getInt("account_2_id"));
            }

        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if(connection != null)
                    connection.close();
            } catch(SQLException e) {
                System.err.println(e);
            }
        }
    }
}