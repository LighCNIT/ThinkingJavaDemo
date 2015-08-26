package com.ligh.io;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * 文件加锁
 * @author gh
 *
 */
public class FileLocking {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("file.txt");
		FileLock fl = fos.getChannel().tryLock();
		if(fl != null){
			System.out.println("Locked File");
			TimeUnit.MILLISECONDS.sleep(100);
			fl.release();  //释放锁
			System.out.println("Released Lock");
		}
		fos.close();
	}

}
