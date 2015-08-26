package com.ligh.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ��IO �ӻ����� ByteBuffer�л�ȡ����
 * �Ȳ���FileChannel��ͨ����Ȼ��ͨ����������ͨ�����н�������ȡ���ݻ������ݣ�
 * FileInputStream��FileOutputStream,RandomAccessFile ��������
 * �����������ͨ����Reader��Writer���ܲ���ͨ��
 * ����java.nio.channels.Channels�����ṩ��ʹ�÷�����������ͨ���в���
 * Reader��Writer
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
