package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//jpaRepository<user, Long> tham số đầu là model mà repo quản lý, tham số sau là kiểu dữ liệu của id
	
	
}
