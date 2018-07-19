package ch10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Q10_03 {

	public static void main(String[] args) {
		File f1 = new File("C:\\data", "DataQ10_03.txt");
		if(!f1.getParentFile().exists()) {
			f1.getParentFile().mkdirs() ; 
			try {
				f1.createNewFile() ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}else {
			try {
				f1.createNewFile() ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

		try (FileOutputStream fo = new FileOutputStream(f1);
		ObjectOutputStream ob = new ObjectOutputStream(fo);) {
			ob.writeDouble(17.625);

		} catch (IOException e) {

			e.printStackTrace();
		}

		try (FileInputStream fi = new FileInputStream(f1); 
			ObjectInputStream oi = new ObjectInputStream(fi);) {
			System.out.println(oi.readDouble());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
