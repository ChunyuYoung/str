import java.sql.*;
import java.util.*;
public class RandomQuery {
    String datasourceName = "";     //数据源名
    String tableName="";            //表名
    int randomNumber;               //随机输出的记录
    ArrayList<StringBuffer> queryResult;    //查询结果
    public RandomQuery(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch (ClassNotFoundException v1){
            v1.printStackTrace();
        }
    }
    public void setDatasourceName(String name) {
        datasourceName = name.trim();
    }
    public void setTableName(String tableName){
        this.tableName = tableName.trim();
    }
    public void setRandomNumber(int n){
        randomNumber = n;
    }
    public ArrayList<StringBuffer> getQueryResult(){
        queryResult = new ArrayList<StringBuffer>();
        Connection connection;
        Statement sql;
        ResultSet rs;
        try{
            String uri = "jdbc:odbc:"+datasourceName;
            String id = "";
            String password = "";
            connection = DriverManager.getConnection(uri,id,password);
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getColumns(null,null,tableName,null);
            int 字段个数 = 0;
            while (resultSet.next()){
                字段个数++;
            }
            sql = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = sql.executeQuery("SELECT * FROM "+tableName);
            rs.last();
            int count = rs.getRow();
            Vector<Integer> vector = new Vector<Integer>();
            for (int i=1;i<=count;i++){
                vector.add(new Integer(i));
            }
            int 抽取数目 = Math.min(randomNumber,count);
            while(抽取数目 > 0){
                StringBuffer record = new StringBuffer();
                int i = (int)(Math.random()*vector.size());
                int index=(vector.elementAt(i).intValue());     //在vector中随机抽取一个元素
                rs.absolute(index);
                for(int k=1;k<=字段个数;k++){
                    record.append(" "+rs.getString(k)+" ");
                }
                queryResult.add(record);
                抽取数目--;
                vector.removeElementAt(i);  //将抽取过的元素从vector中删除
            }
            connection.close();
        }
        catch (SQLException v2){
            v2.printStackTrace();
        }
        return queryResult;
    }
}
