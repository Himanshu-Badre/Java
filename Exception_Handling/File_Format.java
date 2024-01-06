package Exception_Handling;

public class File_Format {
	static void ValidateFormat(String filename) {
		if(filename.contains(".txt")) {
			System.out.println("File Reading Started....");
		}else {
			throw new InvalidFormatException("invalid file Extension");
		}
	}
	public static void main(String[] args) {
		ValidateFormat("Myfile.doc");
	}
}
