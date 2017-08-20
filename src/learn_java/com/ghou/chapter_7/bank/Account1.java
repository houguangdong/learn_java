package learn_java.com.ghou.chapter_7.bank;

class ABC {
	// (域成员) 账户余额 public protected private 没有权限修饰词
	private double balance;
	// (域成员)账号
	private String accountNumber;
	// 无参数构造器
	public ABC(){
		this("0-0-0-0-0", 0);
	}
	//两个参数构造器
	public ABC(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//方法 查询余额
	public double getBalance(){
		//写内容
		int a;
		double b = balance + 5;
		return 0;
	}
	//方法 存钱
	public void saveMoney(double money){
		//写内存
		return;
	}
	//方法 取钱
	public double getMoney(double money){
		//写内容
		return 0;
	}
		
}

class A{

}

class B{
	
}

class C{
	
}
