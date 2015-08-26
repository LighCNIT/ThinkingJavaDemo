package com.ligh.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * 格式化的内存输入
 * @author gh
 *
 */
public class FormattedMemoryInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read(
									"DirList.java").getBytes()));
			while(true)
				System.out.print((char)in.readByte());
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.err.println("End of Stream");
		}
	}

}
