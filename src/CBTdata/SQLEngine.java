package CBTdata;

import java.sql.*;

public class SQLEngine
{
    private static final String URL = "jdbc:derby:database;create=true";
    private static Connection con = null;
    private static Statement stmt = null;

    public SQLEngine()
    {
        createConnection();
        setupDetailsTable();
    }
    public Connection createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            con = DriverManager.getConnection(URL);
            return  con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void setupDetailsTable()
    {
        String TABLE_NAME = "DETAIL";
        try
        {
            stmt = con.createStatement();
            DatabaseMetaData dbm = con.getMetaData();
            ResultSet tables = dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
            if(tables.next())
            {
                //System.out.println("Table" + TABLE_NAME + " already exists. Ready to go!");
            }
            else
            {
                stmt.execute("CREATE TABLE " + TABLE_NAME + "("
                        + "firstname varchar(100),\n"
                        + "lastname varchar(100),\n"
                        + "score varchar (100)"
                        + ")");
            }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage()+ " ...setupDatabase");
        }
        finally
        {


        }

    }
    public void insertIntoTable(String firstname, String lastname, String score) throws SQLException
    {
        con.createStatement().execute(String.format("insert into DETAIL(firstname,lastname,score)values('%s','%s','%s')", firstname, lastname, score));
    }
    public void printAll() throws SQLException
    {
        String query = "select * from DETAIL";
        ResultSet resultSet = stmt.executeQuery(query);
        while(resultSet.next())
        {
            System.out.println(resultSet.getString("firstname")+ " "+ resultSet.getString("lastname")+""+resultSet.getString("score"));
        }
    }

}
