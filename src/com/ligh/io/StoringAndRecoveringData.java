package com.ligh.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据的读写（从缓冲区）
 * @author gh
 *
 */
public class StoringAndRecoveringData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//DataOutputStream  是面向字节的，所以要使用OutputStream
		DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("Data.txt")));
		out.writeDouble(3.1415926);
		out.writeUTF("That was PI");
		out.writeDouble(1.71413);
		out.writeUTF("Square root of 2");
		out.close();
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("Data.txt")));
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		in.close();
		
	}

}
