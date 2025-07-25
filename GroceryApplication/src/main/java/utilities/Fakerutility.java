package utilities;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import com.github.javafaker.PhoneNumber;

//fakerutility-generate fake data's using "fakerclass"

public class Fakerutility {
	Faker faker=new Faker();
	
	public String firstname() {
		return faker.name().firstName();
	}
	
	public String generatename() {
		return faker.name().fullName();
		}
	public String generateaddress() {
		return faker.address().fullAddress();
	}
	public PhoneNumber phonenumber() {
		return faker.phoneNumber();
		
	}
	public String emailid() {
		return faker.internet().emailAddress();
	
	}
	
	public String city() {
		return faker.address().city();
	}
	
	public String randomdigit() {
		return faker.number().digit();
	}
   public int randomnumber() {
	   return faker.number().numberBetween(5, 10);
	   
   }
}
