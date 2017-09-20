      /*
       * 取款超过余额的异常
       */
	package com.cn.zj.util;
	public class AwountOverDrawnException extends Exception {

		public AwountOverDrawnException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public AwountOverDrawnException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "你的余额太少了，不够您取钱";
		}
		
		
	
	}
