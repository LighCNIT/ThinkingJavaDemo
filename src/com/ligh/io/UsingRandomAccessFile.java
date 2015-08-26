package com.ligh.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写随机访问文件
 * @author gh
 *
 */
public class UsingRandomAccessFile {
	static String file = "rtest.bat";
	static void display() throws IOException{
		RandomAccessFile rf = new RandomAccessFile(file,"r");
		for(int i = 0;i < 7;i++)
			System.out.println(
					"Value "+ i +": " + rf.readDouble());
		System.out.println(rf.readUTF());
		rf.close();
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile(file,"rw");
		for(int i = 0;i < 7; i++)
			rf.writeDouble(i*1.414);
		rf.writeUTF("The end of file ");
		rf.close();
		display();
		rf = new RandomAccessFile(file,"rw");
		rf.seek(5*8);     //seek()查找第五个
		rf.writeDouble(47.001);
		rf.close();
		display();
	}

}
