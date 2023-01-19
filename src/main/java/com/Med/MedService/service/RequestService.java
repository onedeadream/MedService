package com.Med.MedService.service;

import com.Med.MedService.models.Operation;
import com.Med.MedService.models.Requests;
import com.Med.MedService.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestService {
    @Autowired
    RequestRepository requestRepository;

    public List<Requests> findAllRequest() {
        return requestRepository.findAll();
    }

    public boolean deleteReq(Long requestId) {
        if (requestRepository.findById(requestId).isPresent()) {
            requestRepository.deleteById(requestId);
            return true;
        }
        return false;
    }
}
