package org.test.namal.messenger.service;

import java.util.ArrayList;
import java.util.List;
import org.test.namal.messenger.model.Messege;;

public class MessegeService {
	
	public List<Messege> getAllMesseges() {
		Messege m1 = new Messege(1, "hello", "namal");
		Messege m2 = new Messege(2, "hello from other world", "lakna");
		List<Messege> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
