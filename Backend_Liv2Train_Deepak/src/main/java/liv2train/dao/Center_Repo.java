package liv2train.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import liv2train.model.Center;

// Connecting with Database using JPA.
@Repository
public interface Center_Repo extends JpaRepository<Center, Long>{

}
