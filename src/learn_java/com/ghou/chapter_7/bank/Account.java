package learn_java.com.ghou.chapter_7.bank;

public class Account {
	/*
	 * 域成员定义格式
	 * 权限修饰词 域成员类型 域成员名称;
	 */
	//类的成员 静态成员 静态数据成员 final常量谁也改变不了  static节省空间
	public static final String bank="中国人民银行";
	private static final String bank1="中国人民银行";
	public static double PI = 3.14159;
	// (域成员)账户余额 public(公共的) protected private(私有的) 没有权限修饰词
	private double balance;
	// (域成员)账号
	private String accountNumber;
	//是否被冻结
	private boolean flag;
	
	{
		System.out.println("非静态区块被执行了");
	}
	
	static{
		System.out.println("静态区块被执行了");
	}
	
	/*
	 * 参数列表：参数的个数 参数的类型 参数的顺序构成的
	 * 权限修饰词 方法名(必须与类的名字完全一致)(参数列表){
	 * 
	 * }
	 */
	
	// (方法成员) 无参数构造器 (特殊的方法)
	public Account(){
		this("0-0-0-0-0", 0);
	}
	
	// (方法成员) 两个参数构造器 (特殊的方法)
	public Account(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public Account(String accountNumber) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
	}
	
	public Account(int accountNumber) {
		// TODO Auto-generated constructor stub
		this.accountNumber = String.valueOf(accountNumber);
	}
	
	//设置accountNumber的方法
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	
	//获得accountNumber的方法
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	public boolean isFlag(){
		return flag;
	}
	
	/*
	 * 权限修饰词 返回值类型 方法名(参数列表){
	 * 
	 * }
	 */
	
	//方法 查询余额
	public double getBalance(){
		//写内容
		if (balance > 1000){
			System.out.println("大于1000");
			return balance;
		}
		System.out.println("=============");
		return balance;
	}
	
	//方法 存钱
	public void saveMoney(double money){
		//写内存
		balance+=(money-money*0.01);
	}
	
	//方法 取钱
	public void getMoney(double money){
		//写内容
		balance-=money;
	}
	
	//在静态的方法中，不能直接使用非静态的成员
	public static void getInfo(){
		Account a = new Account();
		System.out.println(a.balance);
//		System.out.println(balance);
		System.out.println("这是中国人民银行的信用卡");
	}
}
