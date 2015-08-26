package com.ligh.io;

import java.nio.ByteBuffer;
import static net.mindview.util.Print.*;

/**
 * 获取基本类型
 * @author gh
 *
 */
public class GetData {
	private static final int BSIZE= 1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		int i = 0; 
		while(i++ < bb.limit())
			if(bb.get() != 0)
				print("nonzero");
		print("i = "+ i);
		bb.rewind();
		bb.asCharBuffer().put("Howdy!");
		char c;
		while((c = bb.getChar()) != 0)
			printnb(c+" ");
		print();
		bb.rewind();
		bb.asShortBuffer().put((short)44124324);
		print(bb.getShort());
	}

}
