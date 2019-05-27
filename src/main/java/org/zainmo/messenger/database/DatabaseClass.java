package org.zainmo.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.zainmo.messenger.model.Message;
import org.zainmo.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessage(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
}
