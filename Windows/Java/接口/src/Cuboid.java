//??????????????
public class Cuboid{
	float height,width,length;
	public Cuboid(float height,float width,float length){
		this.height = height;
		this.width = width;
		this.length = length;
	}
	//???
	float volumn(){
		System.out.println("???????:"+(this.height*this.length*this.width));
		return (this.height*this.length*this.width);
	}
}
