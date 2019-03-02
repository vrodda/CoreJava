package java8Features;

import java.io.File;
import java.io.FileFilter;

public class LambdaFileFilter2 {

	public static void main(String[] args) {

		/*
		 * FileFilter fileFilter = new FileFilter() {
		 * 
		 * @Override public boolean accept(File pathname) {
		 * 
		 * return pathname.getName().endsWith(".java"); } };
		 */
		
		FileFilter fileFilterLamda =	(File pathname)-> pathname.getName().endsWith(".java");

		File dir = new File("C:\\workspace\\CoreJava\\src\\java8Features");
		File[] files = dir.listFiles(fileFilterLamda);

		for (File file : files) {

			System.out.println(file);
		}
	}
}
