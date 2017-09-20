	/*
	 * 测试层，对用户行为的测试
	 */
	package com.cn.zj.test;
	
	import java.util.Scanner;
	import com.cn.zj.Dao.BankDao;
	import com.cn.zj.DaoImpl.BankDaoImpl;
	import com.cn.zj.model.MoneyBean;
	import com.cn.zj.model.User;
	import com.cn.zj.util.AwountOverDrawnException;
	import com.cn.zj.util.InvalidDeposilException;
	
	public class BankTest {
	public static void main(String[] args)throws AwountOverDrawnException, InvalidDeposilException{
			System.out.println("-------银行存取款系统(1.0)-----------");
			System.out.println("         1-存款                                                         ");
			System.out.println("         2-取款                                                         ");
			System.out.println("         3-退出系统                                                  ");
			System.out.println("---------------------------------");
			
			System.out.println("请输入您要执行的功能："+"\n");
			Scanner in = new Scanner(System.in);
			int i=in.nextInt();          //这是用户功能的选择输入
			
			MoneyBean m=MoneyBean.getInstance();
			BankDaoImpl bdl=new BankDaoImpl();

			boolean flag=false;
			
			while(true){
			    switch (i) {
					case 1:
					System.out.println("请输入您的存款金额");
					   Scanner s1 = new Scanner(System.in);
					   double j1=s1.nextDouble();
					   //对输入的金额进行处理
					   flag=bdl.deposit(j1, m);
					   System.out.println("是否存入成功:"+flag);
					   System.out.println("账户余额:"+m.getMoney());
					   System.out.println("请输入您要执行的功能："+"\n");
					   i=in.nextInt();          //这是用户功能的选择输入					   
					  break;
				     case 2:
	 					System.out.println("请输入您的取款金额");
					    Scanner s2 = new Scanner(System.in);
					    double j2=s2.nextDouble();
					    flag=bdl.withdrawals(j2, m);        //传入你的卡号和你要输入的金额，然后调用方法，返回你的判断
					    System.out.println("是否取款成功:"+flag);
					    System.out.println("账户余额:"+m.getMoney());
					    System.out.println("请输入您要执行的功能："+"\n");
						i=in.nextInt();          //这是用户功能的选择输入
					    break;
			    
				     case 3:
					   System.out.println("用户您已经退出系统");
					   System.exit(-1);
					   break;
			    
			    }				
			}

		}
}
