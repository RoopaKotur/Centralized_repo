package Test_scripts;

import org.testng.annotations.Test;

import POM_Scipts.Customize_dataprovider;

public class Data_Runner {
@Test(dataProvider="loginCredentials",dataProviderClass=Customize_dataprovider.class)
public void test1(String email,String pwd)
{
	System.out.println(email+"    "+pwd);

}
		

}
