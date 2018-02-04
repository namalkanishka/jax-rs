package org.test.namal.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.test.namal.messenger.database.DatabaseClass;
import org.test.namal.messenger.model.Messege;;

public class MessegeService {
	
	
	private Map<Long, Messege> messeges = DatabaseClass.getMesseges();
	
	public MessegeService() {
		messeges.put(1L, new Messege(1,"hellow world", "namal"));
		messeges.put(2L, new Messege(1,"hellow world2", "kanishka"));
		
	}
	
	public List<Messege> getAllMesseges() {
//		Messege m1 = new Messege(1, "hello", "namal");
//		Messege m2 = new Messege(2, "hello from other world", "lakna");
//		List<Messege> list = new ArrayList<>();
//		list.add(m1);
//		list.add(m2);
//		return list;
		return new ArrayList<Messege>(messeges.values());
	}
	public Messege getMessage(long id) {
		return messeges.get(id);
	}
	
	public Messege addMessage(Messege messege) {
		messege.setId(messeges.size() + 1);
		messeges.put(messege.getId(), messege);
		return messege;
	}
	
	public Messege updateMessage(Messege messege) {
		if (messege.getId() <= 0) {
			return null;
		}
		messeges.put(messege.getId(), messege);
		return messege;
	}
	
	public Messege removeMessege(long id) {
		return messeges.remove(id);
	}

}
