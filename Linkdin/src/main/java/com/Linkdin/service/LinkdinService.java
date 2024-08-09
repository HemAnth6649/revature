package com.Linkdin.service;

import com.Linkdin.dao.LinkdinDAO;
import com.Linkdin.dao.LinkdinDAOInterface;
import com.Linkdin.entity.LinkdinUser;

public class LinkdinService implements LinkdinServiceInterface {

	@Override
	public int createprofileservice(LinkdinUser lu) {
		LinkdinDAOInterface ldi=new LinkdinDAO();
		int i=ldi.createprofiledao(lu);
		return i;
	}

}
