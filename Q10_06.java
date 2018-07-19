package ch10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q10_06 {

	public static void main(String[] args)  {
		
		File f1 = new File("C:\\data" , "ObjectQ10_05.dat") ;
		
		try (FileInputStream fi = new FileInputStream(f1);
				ObjectInputStream op = new ObjectInputStream(fi) ; 
				) {
			
			int x  ;		
	    	while ((x = op.available()) != -1 ) {
			Mammal A = (Mammal) op.readObject() ; 
			A.smile();
			}
		
			Mammal A = (Mammal) op.readObject() ; 
			A.smile();
			Mammal B = (Mammal) op.readObject() ; 
			B.smile();
			Mammal C = (Mammal) op.readObject() ; 
			C.smile();
			Mammal D = (Mammal) op.readObject() ; 
			D.smile();
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
			System.out.println("µ{¦¡µ²§ô");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
