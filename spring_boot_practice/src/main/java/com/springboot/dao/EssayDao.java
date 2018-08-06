package com.springboot.dao;

import com.springboot.entity.Essay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EssayDao extends JpaRepository<Essay, Integer>, JpaSpecificationExecutor {

    @Query("SELECT e FROM Essay e where e.essayTitle like %?1%")
    public List<Essay> findByName(String name);

    @Query(value = "select * from essay order by RAND() limit ?1", nativeQuery = true)
    public List<Essay> randomList(Integer n);

}
