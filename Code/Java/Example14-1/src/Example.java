import java.sql.*;
public class Example {
    public static void main(String args[]){
        Connection con;
        Statement sql;
        ResultSet rs;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch (ClassNotFoundException v1){
            v1.printStackTrace();
            System.out.println(v1.toString());
        }
        try{
            con = DriverManager.getConnection("jdbc:odbc:StringOD","","");
            sql = con.createStatement();
            rs = sql.executeQuery("SELECT * FROM employee WHERE salary > 1900");        //小于1900的查不到

            while(rs.next()){
                String ID = rs.getString(1);            //获取数据库第一列
                String number = rs.getString(2);
                String name = rs.getString(3);
                Date date = rs.getDate("birthday");
                double salary = rs.getDouble("salary");
//                System.out.printf("% - 4s",number);
//                System.out.printf("% - 6s",name);
//                System.out.printf("% - 15s",date.toString());
//                System.out.printf("% 6s\n",salary);
                System.out.println(ID+"\t"+number+"\t"+name+"\t"+date.toString()+"\t"+salary);
            }
            con.close();
        }
        catch(SQLException v2){
            v2.getErrorCode();
            System.out.println(v2.toString());
        }
    }
}
