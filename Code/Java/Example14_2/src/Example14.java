import java.sql.*;
import java.util.*;

public class Example14 {
    public static void main(String args[]){
        SequenceQuery query = new SequenceQuery();
        String datasorce = "StringOD";
        String tableName = "employee";
        query.setDatasourceName(datasorce);
        query.setTableName(tableName);
        ArrayList<StringBuffer> result = query.getQueryResult();
        for (StringBuffer str:result){
            System.out.println(str);
        }
    }
}
