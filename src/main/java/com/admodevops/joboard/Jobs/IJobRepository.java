package com.admodevops.joboard.Jobs;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job, Long>, JpaSpecificationExecutor<Job> {
    List<Job> findAll();
    Job findByJobId(int jobId);
    Job save(Job job);
    void updateById(int jobID);
    void deleteById(Long id);
}
