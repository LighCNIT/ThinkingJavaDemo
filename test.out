package com.ligh.reflect;

import java.lang.reflect.Method;

public class GetMethod{
	private int f1(Object p,int x)throws NullPointerException{
		if(p == null)
			throw new NullPointerException();
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class cls = Class.forName("com.ligh.reflect.GetMethod");
			Method mlist[] = cls.getDeclaredMethods();
			for(int i=0;i< mlist.length;i++){
				Method m = mlist[i];
				System.out.println("name:"+m.getName());
				System.out.println("class="+m.getDeclaringClass());
				
				Class pvec[] = m.getParameterTypes();
				for(int j=0;j<pvec.length;j++){
					System.out.println("param#"+j+" "+pvec[j]);
				}
				
				Class evec[] = m.getExceptionTypes();
				for(int j=0;j<evec.length;j++)
					System.out.println("Exception*"+j+""+evec[j]);
				System.out.println("Return Type:"+m.getReturnType());
				
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}

}
