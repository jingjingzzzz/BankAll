   /*
    * 控制层：具体的接口规范
    */
	package com.cn.zj.DaoImpl;
	
	import com.cn.zj.Dao.BankDao;
	import com.cn.zj.model.MoneyBean;
	import com.cn.zj.model.User;
	import com.cn.zj.util.AwountOverDrawnException;
	import com.cn.zj.util.InvalidDeposilException;


	public class BankDaoImpl implements BankDao {

	@Override
		public boolean deposit(double money,MoneyBean m) throws InvalidDeposilException {   //这个是传入用户自己的钱
			// TODO Auto-generated method stub
		   boolean flag=false;   //判断是否传入
		   if(money>=0){
			   double initMoney=m.getMoney();
			   double nowMoney=initMoney+money;
			   m.setMoney(nowMoney);
			   flag=true;
		   }else{
			    
					 throw new InvalidDeposilException("你输入的金额有误");
		   }
		   return flag;
		}

	@Override
	public boolean withdrawals(double money, MoneyBean m) throws InvalidDeposilException, AwountOverDrawnException   {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(money>=0){              //说明您的余额大于0
			double initMoney=m.getMoney();
			double nowMoney=initMoney-money;
			             //对当前用户的账号进行操作    
			if(nowMoney<0){
//					throw new AwountOverDrawnException("您的余额不足");
				System.out.println("");
				return false;
			}
			m.setMoney(nowMoney); 
			}else{
				throw new InvalidDeposilException("你输入的金额有误");
				}
		return flag;
	}
}
