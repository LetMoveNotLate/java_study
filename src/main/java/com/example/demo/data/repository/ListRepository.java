package com.example.demo.data.repository;
import com.example.demo.data.entity.ListEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface ListRepository extends JpaRepository<ListEntitiy, Long>{
    @Transactional
    void deleteByContentKey(int key);
}
