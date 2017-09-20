
	package com.cn.zj.util;
	/**
	 * 对密码进行加密
	 * @author zengj
	 *
	 */
	public class PassMD5 {
		  public static String SetMD5(byte[] source) 
		   {  
			        String s = null;  
			        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };  
			        try {  
			            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");  //生成一个MD5加密摘要
			            md.update(source);        //计算MD5的值
			            byte tmp[] = md.digest();  // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位
			            char str[] = new char[16 * 2];   
			            int k = 0;   
			            for (int i = 0; i < 16; i++) {   
			                byte byte0 = tmp[i];   
			                str[k++] = hexDigits[byte0 >>> 4 & 0xf];   
			                str[k++] = hexDigits[byte0 & 0xf];           //转化为16进制 
			            }  
			            s = new String(str);   
			        } catch (Exception e) {  
			            e.printStackTrace();  
			        }  
			        return s;  
			 }  
			/**
			 * 得到加密的数字      
			 * @param source
			 * @return
			 */
	  	public static String getMD5(String source)
	  	{  
		        return (source == null || "".equals(source)) ? "" : SetMD5(source.getBytes());  
		    }  
		}
	
	
	
