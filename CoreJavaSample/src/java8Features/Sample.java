package java8Features;

import java.io.File;
import java.io.FileFilter;

public class Sample {

	FileFilter fileFilter = new  FileFilter() {
		
		@Override
		public boolean accept(File arg0) {
			// TODO Auto-generated method stub
			return arg0.getAbsolutePath().endsWith(".java");
		}
	};
	
	File file = new File(x)
}
