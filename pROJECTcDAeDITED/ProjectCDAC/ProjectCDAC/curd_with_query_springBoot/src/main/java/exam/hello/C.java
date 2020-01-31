package exam.hello;

import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface C extends JpaRepository<Guide, Integer> {
	
	//Mobile is entity class, Integer is primary key
	// hibernate will never work until you use concept called Primary key.
	
	
	/*@Query("FROM Customer WHERE custid = :x")
	Customer findSingleAccount(@Param("x") int balance);
	
	
	
	@Query("FROM Customer WHERE custid = :x")
	Collection<Customer> findAllAccount(@Param("x") int balance);
	*/
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Customer u SET u.custid = :y WHERE u.password = :x")
	void updateAccount(@Param("y") int custid,@Param("x")String password);
	
	/*
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("DELETE from Customer u where u.custid = :y")
	void deleteAccount(@Param("y") int balance);
	*/
}
