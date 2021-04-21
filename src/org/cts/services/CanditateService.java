package org.cts.services;

import org.cts.model.Canditate;
import org.cts.dao.CanditateDao;

public class CanditateService {
	CanditateDao dao=new CanditateDao();
	public boolean registerCanditate(Canditate canditate) {
		boolean b=dao.register(canditate);
		System.out.println("service "+b);
		return b;
	}
}
