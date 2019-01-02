package com.str;
//自定义年龄异常类
public class IntegerException extends Exception{
	String Message;
	public IntegerException(int m) {
		Message = "年龄"+m+"不合理";
	}
	public String toString() {
		return Message;
	}
}
