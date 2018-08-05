package com.springboot.dao;

import com.springboot.entity.Essay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EssayDao extends JpaRepository<Essay, Integer> {
}
