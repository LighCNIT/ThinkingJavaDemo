package com.ligh.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从标准输入中读取
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
