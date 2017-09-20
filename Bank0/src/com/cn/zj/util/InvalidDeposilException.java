	/*
	 * 处理输入的负数为负数
	 */
	package com.cn.zj.util;
	import java.util.Arrays;
	public class InvalidDeposilException extends Throwable{
		public InvalidDeposilException(){
			
		}
        public InvalidDeposilException(String message){
        	super(message);
			
		}
        @Override
		public String toString() {
			return "大佬的钱不够了";
		}
		
		
	}