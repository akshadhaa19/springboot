package com.in28minutes.springboot.myfirstwebapp.login;

	import org.springframework.stereotype.Service;

	@Service
	public class AuthenticationService {
		public boolean authenticate(String username,String password) {
			boolean isValidUserName= username.equalsIgnoreCase("haritha");
			boolean isValidPassword=password.equalsIgnoreCase("123");

			return isValidUserName && isValidPassword;
		}

		public boolean authenticate(String name, String password) {
			// TODO Auto-generated method stub
			return false;
		}

	}

}
