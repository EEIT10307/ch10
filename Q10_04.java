package ch10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale.FilteringMode;

public class Q10_04 {
	public static void main(String[] args) {
		
		File f1 = new File("C:\\data" , "DataQ10_04.txt") ; 
		
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
		 
	try (FileOutputStream fo = new FileOutputStream(f1 , true) ; 
	     DataOutputStream d = new DataOutputStream(fo)  ; 
			) {
		
		for (int x = 0 ; x <10;  x++   ) {
			
			
			int math = (int) (Math.random()*1000 +1 ); 
			
			d.writeInt(math);
			}
				
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	try(FileInputStream fi = new FileInputStream(f1) ; 
		DataInputStream di = new DataInputStream(fi);){
		
		
		
		System.out.println(di.readInt());
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
		
	}
	

}
