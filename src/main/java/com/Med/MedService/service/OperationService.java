package com.Med.MedService.service;

import com.Med.MedService.models.Operation;
import com.Med.MedService.models.Role;
import com.Med.MedService.models.User;
import com.Med.MedService.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class OperationService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    OperationRepository operationRepository;
    public List<Operation> findAllOperation() {
        return operationRepository.findAll();
    }
    public Operation getOperation(Long id) {
        return operationRepository.findById(id).get();
    }

    public boolean deleteOperation(Long requestId) {
        if (operationRepository.findById(requestId).isPresent()) {
            operationRepository.deleteById(requestId);
            return true;
        }
        return false;
    }

    public Operation findOperationById(Long operId) {
        Optional<Operation> operation = operationRepository.findById(operId);
        return operation.orElse(new Operation());
    }

    public boolean saveOperation(Operation operation) {
        operationRepository.save(operation);
        return true;
    }

    public List<Operation> dataGetList(String data) {
        return em.createQuery("SELECT u FROM Operation u WHERE u.data=:dataId", Operation.class)
                .setParameter("dataId", data).getResultList();
    }
}
