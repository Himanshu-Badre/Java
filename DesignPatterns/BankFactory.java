package DesignPatterns;

public class BankFactory {
	public RBIBank getObject(String bankName) {
		
		if(bankName.equals("SBI")) {
			return new SBI();

		}else if(bankName.equals("Axis")) {
			return new Axis();
			
		}else if(bankName.equals("HDFC")) {
			return new HDFC();
		}else if(bankName.equals("Kotak")) {
			return new Kotak();
		}else {
			return null;
		}

	}
}
