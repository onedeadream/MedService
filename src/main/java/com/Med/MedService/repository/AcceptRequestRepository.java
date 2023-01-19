package com.Med.MedService.repository;

import com.Med.MedService.models.AcceptRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptRequestRepository extends JpaRepository<AcceptRequest, Long> {
}
