package ch10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Q10_05 {

 	
	
	public static void main(String[] args) {
				  
		
File f1 = new File("C:\\data" , "ObjectQ10_05.dat") ; 
		
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
		
		try(FileOutputStream fi = new FileOutputStream(f1);
			ObjectOutputStream op = new ObjectOutputStream(fi) ; 
				){			
			Cat cat1 = new Cat("CC") ; 
			Cat cat2 = new Cat("BB") ; 
			Dog dog1 = new Dog("GG") ; 
			Dog dog2 = new Dog("TT") ; 
			
			op.writeObject(cat1);
			op.writeObject(cat2);
			op.writeObject(dog1);
			op.writeObject(dog2);
	
		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

	
		
	 class Mammal implements Serializable{
		public void smile() {} ; 
	}
	
	
}
