package com.ligh.io;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;


import com.ligh.io.ProcessFiles;

public class ProcessFiles01 {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		if (args.length != 2) {
			System.err.println("Usage: java E06_ProcessFiles3 path date");
			return;
		}
		long tmp = 0;
		try {
			df.setLenient(false);
			tmp = df.parse(args[1]).getTime();
		} catch (ParseException pe) {
			pe.printStackTrace();
			return;
		}
		final long modTime = tmp;
		new ProcessFiles(new ProcessFiles.Strategy() {
			public void process(File file) {
				if (modTime < file.lastModified())
					System.out.println(file);
			}
		}, "java").start(new String[] { args[0] });
	}
}