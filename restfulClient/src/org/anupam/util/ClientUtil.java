package org.anupam.util;

import org.anupam.pojo.UserInfoClient;

public class ClientUtil {

	public static int calculateAge(UserInfoClient userInfoClient){
		return Integer.valueOf(userInfoClient.getAge());
	}
}
