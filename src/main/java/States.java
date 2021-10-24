import java.sql.*;
import java.util.*;

public class States {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String pass = "eauxmar";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement statement = con.createStatement();

        Scanner sc = new Scanner(System.in);
        int n;
        String stateName, stateCapital;

        String createDB = "CREATE TABLE STATEDATA(stateName varchar(20), stateCapital varchar(20));";
        String insertDB = "INSERT INTO STATEDATA VALUES(";
        String updateDB = "UPDATE STATEDATA SET stateCapital=";
        String deleteDB = "DELETE FROM STATEDATA WHERE stateName=";

        //creating the table
        System.out.println("Creating table");
        statement.executeUpdate(createDB);

        //inserting into table
        System.out.println("Inserting into table");
        System.out.println("Enter the number of values to be inserted: ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            System.out.println("Enter statename: ");
            stateName = sc.nextLine();
            System.out.println("Enter statecapital: ");
            stateCapital = sc.nextLine();
            String finalQuery = insertDB + "'" + stateName + "','" + stateCapital + "');";
            statement.executeUpdate(finalQuery);
        }
        displayCurrTable(statement);

        //updating table values
        System.out.println("Updating values");
        System.out.println("Enter statename: ");
        stateName = sc.nextLine();
        System.out.println("Enter statecapital: ");
        stateCapital = sc.nextLine();
        String finalQuery = updateDB + "'" + stateCapital + "' WHERE stateName='" + stateName + "';";
        statement.executeUpdate(finalQuery);
        displayCurrTable(statement);

        //deleting from table
        System.out.println("Deleting from table");
        System.out.println("Enter stateName to be deleted: ");
        stateName = sc.nextLine();
        finalQuery = deleteDB + "'" + stateName + "';";
        statement.executeUpdate(finalQuery);
        displayCurrTable(statement);

        con.close();
    }

    public static void displayCurrTable(Statement statement) throws SQLException {

        ResultSet resultSet = statement.executeQuery("SELECT * FROM STATEDATA;");
        System.out.println("StateName\tStateCapital");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));
        }

    }

}


