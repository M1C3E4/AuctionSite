package com.example.auctionsite.repository;

import com.example.auctionsite.persistence.Horse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorseRepository extends JpaRepository<Long, Horse> {
}
