package com.admodevops.joboard.Jobs;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
@Transactional
public class JobRepository implements IJobRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private IJobRepository jobRepository;

    @Override
    public <S extends Job> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Job> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List findAll() {
        return jobRepository.findAll();
    }

    @Override
    public Iterable<Job> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Job findByJobId(int jobId) {
        return null;
    }

    @Override
    public Job save(Job job) {
        return null;
    }

    @Override
    public void updateById(int jobId) {
    }

    @Override
    public void deleteById(Long id) {
    }

    @Override
    public void delete(Job entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Job> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional<Job> findOne(Specification<Job> spec) {
        return Optional.empty();
    }

    @Override
    public List<Job> findAll(Specification<Job> spec) {
        return null;
    }

    @Override
    public Page<Job> findAll(Specification<Job> spec, Pageable pageable) {
        return null;
    }

    @Override
    public List<Job> findAll(Specification<Job> spec, Sort sort) {
        return null;
    }

    @Override
    public long count(Specification<Job> spec) {
        return 0;
    }

    @Override
    public boolean exists(Specification<Job> spec) {
        return false;
    }

    @Override
    public long delete(Specification<Job> spec) {
        return 0;
    }

    @Override
    public <S extends Job, R> R findBy(Specification<Job> spec, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}