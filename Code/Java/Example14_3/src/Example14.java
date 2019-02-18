import java.sql.*;
import java.util.*;
public class Example14 {
    public static void main(String args[]){
        RandomQuery query = new RandomQuery();
        String datasource = "StringOD";
        String tableName = "employee";
        int number = 5;
        query.setDatasourceName(datasource);
        query.setTableName(tableName);
        query.setRandomNumber(number);
        ArrayList<StringBuffer> result = query.getQueryResult();
        for(StringBuffer str:result){
            System.out.println(str);
        }
    }
}
