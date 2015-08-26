package com.ligh.io;

import java.io.IOException;
import java.io.StringReader;

/**
 * ¥”ƒ⁄¥Ê ‰»Î
 * @author gh
 *
 */
public class MemoryInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringReader in = new StringReader(
				BufferedInputFile.read("GetMethod.java"));
		int c;
		while((c = in.read()) != -1)
			System.out.print((char)c);
	}

}
