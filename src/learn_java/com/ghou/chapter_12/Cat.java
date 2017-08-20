package learn_java.com.ghou.chapter_12;

public class Cat implements Comparable<Cat>{
	private String name;
	private int age;
	public Cat(){
		this("Tom", 5);
	}
	public Cat(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String toString(){
		return "猫的名字是："+name;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Cat)){
			return false;
		}
		Cat that = (Cat)obj;
		if(this.getName().equals(that.getName()) && this.getAge()==that.getAge()){
			return true;
		}
		return false;
	}
	
	public int hashCode(){
		return getName().hashCode() + getAge();
	}

	public int compareTo(Cat that) {
		return this.getAge() - that.getAge(); 
	}

}
