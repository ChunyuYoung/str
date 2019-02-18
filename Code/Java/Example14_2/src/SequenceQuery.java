import java.sql.*;
import java.util.*;
public class SequenceQuery extends Query{
    public ArrayList<StringBuffer> getQueryResult(){
        setSQL("SELECT * FROM "+tableName);     //FROM后面必须有空格
        return super.getQueryResult();
    }
}
