public abstract class People {
    private String name = "猫";
    private String food = "狗";
    private String sound = "猪";

    public abstract String initName();
    public abstract String initFood();
    public abstract String initSound();

    public String getName(){
        return name;
    }
    public String getFood(){
        return food;
    }
    public String getSound(){
        return sound;
    }
    public People(){
        this.name = initName();
        this.food = initFood();
        this.sound = initSound();
    }
    public static void main(String args[]){
        //People value = new People();

    }
}
