package org.cts;

import org.cts.model.Canditate;
import org.cts.services.CanditateService;

public class Test {
	public static void main(String[] args) {
		CanditateService service=new CanditateService();
		Canditate st1=new Canditate("Gowthaman", "M", "gowthaman", "13/03/2000", "address", "coimbatore", "tamil nadu", "641016", "9566615244","B.E","2021","90","gowthaman@iamneo.ai","1","iamneo");
		boolean b=service.registerCanditate(st1);
		if(b)
			System.out.println("registered successfully");
		else
			System.out.println("not registered");
	}
}
