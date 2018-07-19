package ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q10_02 {

	public static void main(String[] args) {

		File f = new File("Sample.txt");

		try (FileInputStream fi = new FileInputStream(f);) {
			int count = 0;
			int y = 0;
			byte[] x = new byte[1024];
			while ((count = fi.read(x)) != -1) {

				y += count;

			}
			System.out.println(y);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		try (FileReader fr = new FileReader(f);) {
			int count = 0;
			int z = 0;
			char[] y = new char[256];
			while ((count = fr.read(y)) != -1) {
				z += count;

			}

			System.out.println(z);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {
			String s = null;
			int count = 0;
			while ((s = br.readLine()) != null) {
				count++;

			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
