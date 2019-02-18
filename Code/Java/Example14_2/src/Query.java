import sun.jdbc.odbc.JdbcOdbcDriver;

import java.sql.*;
import java.util.*;
public class Query {
    String datasourceName = "";             //数据源名
    String tableName = "";                  //表名
    String SQL;                             //SQL语句
    ArrayList<StringBuffer> queryResult;    //查询结果
    public Query(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //Sql驱动
        }
        catch (ClassNotFoundException v1){
            v1.printStackTrace();
        }
    }
    public void setDatasourceName(String s){
        datasourceName = s.trim();
    }
    public void setTableName(String s){
        tableName = s.trim();
    }
    public void setSQL(String SQL){
        this.SQL = SQL;
    }
    public ArrayList<StringBuffer> getQueryResult(){
        queryResult = new ArrayList<StringBuffer>();
        Connection con;
        Statement sql;
        ResultSet rs;
        try{
            String uri = "jdbc:odbc:"+datasourceName;
            String id = "";
            String password = "";
            con = DriverManager.getConnection(uri,id,password);
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet rs1 = metaData.getColumns(null,null,tableName,null);
            int x = 0;
            while(rs1.next()){
                x++;
            }
            sql = con.createStatement();
            rs = sql.executeQuery(SQL);
            while (rs.next()){
                StringBuffer record = new StringBuffer();
                for(int k = 1;k<=x;k++){
                    record.append(" "+rs.getString(k)+" ");
                }
                queryResult.add(record);
            }
            con.close();
        }
        catch(SQLException v2){
            v2.printStackTrace();
        }
        return queryResult;
    }
}
