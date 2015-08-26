package com.ligh.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 新IO 从缓冲器 ByteBuffer中获取数据
 * 先产生FileChannel（通道）然后通过缓冲器与通道进行交互（获取数据或发送数据）
 * FileInputStream，FileOutputStream,RandomAccessFile 这三个类
 * 可以用与产生通道，Reader与Writer则不能产生通道
 * 不过java.nio.channels.Channels类中提供了使用方法，用以在通道中产生
 * Reader与Writer
 * @author gh
 *
 */
public class GetChannel {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text ".getBytes()));
		fc.close();
		fc = new RandomAccessFile("data.txt","rw").getChannel();
		fc.position(fc.size());//Move to end
		fc.write(ByteBuffer.wrap("Some more ".getBytes()));
		fc.close();
		fc = new FileInputStream("data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
	    buff.flip();
	    
	    while(buff.hasRemaining())
	    	System.out.print((char)buff.get());
	}

}
