import java.io.Serializable;

public class DemoFileObjectSercializeStudent implements Serializable {
    String name;
    float height;
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(float height){
        this.height = height;
    }
}
