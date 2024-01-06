package Exception_Handling;

import java.io.FileInputStream;
//file Path: "D:\FIles\MyFile.xlsx"
public class Excel_Read {
	
	public String ReadExcl(String SheetName) {
		String Data="";
		try {
			FileInputStream fis =new FileInputStream("\"D:\\FIles\\MyFile.xlsx\"");
//			WorkbookFactory.create(fis);
		} catch (Exception e) {
			System.out.println("Read Excel Catch Block");
			e.fillInStackTrace();
		}
		
		return Data;
	}
	
	public static void main(String[] args) {
		
	}
}
