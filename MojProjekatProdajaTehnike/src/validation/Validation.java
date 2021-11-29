package validation;

public class Validation {

	


	public void writeParameters(String username, String password, String repeatedPassword, String userType) {
		
		
		System.out.println("Our parameters are: ");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Repeated Password: " + repeatedPassword);
		System.out.println("User Type: " + userType);
		
		
	
		
		
	}

	public boolean checkPassword(String password, String repeatedPassword) {
		
	int passwordLength = password.length();
	
	
	if(passwordLength < 8) {
		
			System.out.println("Password isn't long enough!");
		return false;
		
	}
		
	int digitCounter = 0;
	int upperCaseCounter = 0;
	
	for(int i = 0; i < passwordLength; i++) {
		
		char character = password.charAt(i);
			
			if(Character.isDigit(character)) {
				
				digitCounter++;
			}
			
			if(Character.isUpperCase(character)) {
				
				upperCaseCounter++;
			}
		
		
	}
	
	if(digitCounter >= 1 && upperCaseCounter >= 1) {
		
		System.out.println("Password OK!");
		
		return true;
	} else {
		
		System.out.println("Password FAILED!");
		
		return false;
	}
	
	
}


	public boolean validateUserAndPassword(String userName, String password) {
		
		if((userName == null || userName.isEmpty()) || (password == null || password.isEmpty())) {
			
			System.out.println("Username or password are empty or null!");
				return false;
			
		} else {
			
			System.out.println("Username and password are not empty or null!");
				return true;
		}
	
		
	}

	public boolean isBalanceADigit(String balance) {
		
		
		int balanceLength = balance.length();
		int digitCounter = 0;
		int letterCounter = 0;
		
		for(int i = 0; i < balanceLength; i++) {
			
			char character = balance.charAt(i);
			
			if(Character.isDigit(character)) {
				
				digitCounter++;
			}
			
			if(Character.isLetter(character)) {
				
				letterCounter++;
			}
		}
		
		if(digitCounter >= 0 && letterCounter == 0) {
			
			return true;
			
		} else {
			
			return false;
		}
		
	}

	

	
	
	
	
	
	
}
