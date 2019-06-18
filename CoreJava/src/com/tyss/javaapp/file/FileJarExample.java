package com.tyss.javaapp.file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileJarExample {

	public static void main(String[] args) {

		try {
			FileUtils.writeStringToFile(new File("filejar.txt"), "hi Rohith welcome", Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			List<String> list = FileUtils.readLines(new File("file.txt"), Charset.defaultCharset());

			System.out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			String fileinfo = FileUtils.readFileToString(new File("filejar.txt"), Charset.defaultCharset());
			System.out.println(fileinfo);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
