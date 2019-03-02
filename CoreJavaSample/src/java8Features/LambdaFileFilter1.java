package java8Features;

import java.io.File;
import java.io.FileFilter;

public class LambdaFileFilter1 {

	public static void main(String[] args) {

		FileFilter fileFilter = new FileFilter() {

			@Override
			public boolean accept(File pathname) {

				return pathname.getName().endsWith(".java");
			}
		};

		File dir = new File("C:\\workspace\\CoreJava\\src\\java8Features");
		File[] files = dir.listFiles(fileFilter);

		for (File file : files) {

			System.out.println(file);
		}
	}
}
