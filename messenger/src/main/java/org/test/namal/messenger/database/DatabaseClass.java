package org.test.namal.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.test.namal.messenger.model.Messege;
import org.test.namal.messenger.model.Profile;
public class DatabaseClass {

	private static Map<Long, Messege> messeges = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Messege> getMesseges() {
		return messeges;
	}
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
	
	
	public static void setMesseges(Map<Long, Messege> messeges) {
		DatabaseClass.messeges = messeges;
	}
	public static void setProfiles(Map<Long, Profile> profiles) {
		DatabaseClass.profiles = profiles;
	} 
	
	
	
	
}
