package restfulClient;

import mockit.Mocked;
import mockit.StrictExpectations;
import mockit.Tested;

import org.anupam.pojo.UserInfoClient;
import org.anupam.util.ClientUtil;
import org.junit.Test;


public class RandomTest {
	@Tested
	UserInfoClient client;
	
	@Mocked
	ClientUtil clientUtil;

	@Test
	public void seniorCitizenTest(){
		client.setAge("60");
		
		new StrictExpectations() {
			{
				ClientUtil.calculateAge(client);
				result=60;
				ClientUtil.calculateAge(client);
				result=50;
			}
		};


		for(int i=0; i<2; i++)
			client.isSeniorCitizen();
	}

}
