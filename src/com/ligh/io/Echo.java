package com.ligh.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ӱ�׼�����ж�ȡ
 * @author gh
 *
 */
public class Echo {
	public static void main(String [] args)throws IOException{
		BufferedReader std = new BufferedReader(
				new InputStreamReader(System.in));
		String s;
		while((s = std.readLine()) != null && s.length()!=0)
			System.out.println(s);
	}
}
