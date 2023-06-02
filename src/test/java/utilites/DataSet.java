package utilites;

import org.testng.annotations.DataProvider;

public class DataSet {
	@DataProvider(name="invalid")
	public static Object dataset() {
		Object[][] objects= {
				{"0111111111","paswordddd","Please enter a valid password"},
				{"66666666aa","asasasas","Enter a valid eamil and password"}, 
				{"aaxakxoax","dsdsddsdsd","Incorrect email and password"},
				{"scscscsxcsxsnsk","46494scscs81","Wrong email and password"}};
		
		
		return objects;
			
	}

}
