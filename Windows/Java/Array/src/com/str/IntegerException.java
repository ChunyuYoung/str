package com.str;
//�Զ��������쳣��
public class IntegerException extends Exception{
	String Message;
	public IntegerException(int m) {
		Message = "����"+m+"������";
	}
	public String toString() {
		return Message;
	}
}
