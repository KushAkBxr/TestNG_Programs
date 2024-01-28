package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider = "dataSet")
	public void test(String Username, String Password) {
		System.out.println(Username + "<=======>" + Password);
	}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataset = new Object[4][2];

		// First Row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";

		// Second Row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";

		// third Row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";

		// fourth Row
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";

		return dataset;

		// 2nd method to perform data provider testing.

		// @Dataprovider
		// public Object[][] dataSet()
		// {
		// return new object[][]
		// {
		// {"username","password","test"},{"username1","password1","test1"},
		// {"username2","password2","test2"};
		// }
		// }

	}

}
