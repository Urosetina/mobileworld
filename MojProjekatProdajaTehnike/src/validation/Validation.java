package validation;

public class Validation {

	public void writeParameters(String realName, String lastName, String country,
								String city, String street, String phoneNumber, String username,
								String password, String repeatedPassword, String userType) {
		
		
		System.out.println("Our parameters are: ");
		System.out.println("Real name: " + realName);
		System.out.println("Last name: " + lastName);
		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		System.out.println("Street:" + street);
		System.out.println("Phone number: " + phoneNumber);
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
	
	
	
	
	
	
	
	
}
