package learn_java.com.ghou.chapter_7.bank;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("ddddd", 100);
		a1.getBalance();
		Account zhang3 = new Account("zhang3", 100000);
		zhang3.saveMoney(3000);
		System.out.println(zhang3.getBalance());
		
		Single single1 = Single.getSingle();
		Single single2 = Single.getSingle();
		System.out.println(single1 == single2);
	}

}
