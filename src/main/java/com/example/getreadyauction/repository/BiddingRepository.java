package com.example.getreadyauction.repository;

import com.example.getreadyauction.entity.Bidding;
import com.example.getreadyauction.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BiddingRepository extends JpaRepository<Bidding, Long> {

    Optional<Bidding> findByIdAndUser(Long id, Users users);
}
