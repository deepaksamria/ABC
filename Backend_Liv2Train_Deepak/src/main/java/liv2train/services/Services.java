package liv2train.services;

import java.util.List;

import org.springframework.stereotype.Service;

import liv2train.model.Center;

@Service
public interface Services {
	
	public Center add_center(Center center);
	public List<Center> getCenterList();

}
