package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddressObj() {
		Address addr = new Address();
		addr.setHouseno(107);
		addr.setCity("Kishangarh");
		addr.setPincode(201301);
		
		return addr;
	}
	
	@Bean
	public Student createStudentObj() {
		Student std = new Student();
		std.setName("Vinayak Vyas");
		std.setRollNo(177);
	//	std.setAddress(createAddressObj());	    		//manual DI
		
		return std;
	}
}
