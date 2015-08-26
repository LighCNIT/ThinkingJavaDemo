package com.ligh.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;
/**
 * ƥ����չ��
 * BY Ligh 2015-08-15
 * @author gh
 *
 */
public class DirList {
	public static void main(String [] args){
		File path = new File("D:\\workspace\\IO");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else 
			list = path.list(new DirFilter(args[0]));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
			System.out.println(dirItem);
	}
}

class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex) {
		// TODO Auto-generated constructor stub
		pattern = Pattern.compile(regex);
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(name).matches();
	}
}
