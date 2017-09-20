/*
 * 用户银行卡,用的是单例模式，你只有一个用户对象在访问，只能拿一个账户（代表的是用户）
 */
	package com.cn.zj.model;
	
	public class MoneyBean {
		private double money=0;
		
		private static MoneyBean m=new MoneyBean();
		public double getMoney() {
			return money;
		}

		public void setMoney(double money) {
			this.money = money;
		}
		
		public static MoneyBean getInstance(){
			return m;
			
		}
	}
