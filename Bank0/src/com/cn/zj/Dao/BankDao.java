  /*
   * 业务层接口，用来实现方法的规范
   */
	package com.cn.zj.Dao;

    import com.cn.zj.model.MoneyBean;
    import com.cn.zj.util.AwountOverDrawnException;
    import com.cn.zj.util.InvalidDeposilException;

	public interface BankDao {
		public boolean deposit(double money,MoneyBean m) throws InvalidDeposilException;   //用户存款
		public boolean withdrawals(double money,MoneyBean m) throws  InvalidDeposilException, AwountOverDrawnException; //用户取款
	}
