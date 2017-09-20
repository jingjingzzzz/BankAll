	
	package com.cn.zj.model;
	
	public class User {
		  private String name;
		  private  int count ;   //表示银行里面的钱
		  private static User user =new User(20,"zj");
		  
		  private User(int count,String name) {
						this.count = count;
						this.name=name;
						System.out.println(""+count);
					}   //这个类的构造方法
		  
		  private  int getCount() {   //这个类的普通方法
						return count;
					}
		  
		  private String getNanme(){
			  return name;
		  }

		  public static  User getUser(){   //通过一个静态对象返回
					   return user;
				   }
	}
				   
	           
			