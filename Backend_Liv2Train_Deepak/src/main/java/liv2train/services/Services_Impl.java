package liv2train.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import liv2train.dao.Center_Repo;
import liv2train.model.Center;

@Service
public class Services_Impl {
	
	@Autowired
	private Center_Repo center_repo;
	
	// Service layer processing of adding new Center into Database.
	public Center add_center(Center center) {
		center.setDate(new Date());
		return center_repo.save(center);
		
	}
	
	// Service layer processing of getting list of all saved Center from Databse.
	public List<Center> getCenterList() {
		 List<Center> centerlist = center_repo.findAll();
		 if(centerlist.isEmpty()) {
			 centerlist.add(new Center());
		 }
		 return centerlist;
	}
}
