package com.wysokinski.GitApiFeign.repository;


import com.wysokinski.GitApiFeign.DAO.Counter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends CrudRepository<Counter, String> {

    Counter findByLogin(String login);
}
