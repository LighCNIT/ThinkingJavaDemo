package com.ligh.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读取二进制文件
 * @author gh
 *
 */
public class BinaryFile {
	public static byte[] read(File file)throws IOException{
		BufferedInputStream bf = new BufferedInputStream(
				new FileInputStream(file));
		try{
			byte[] data = new byte[bf.available()];
			bf.read();
			return data;
		}finally{
			bf.close();
		}
	}
	public static byte[] read(String bFile)throws IOException{
		return read(new File(bFile).getAbsoluteFile());
	}
}
