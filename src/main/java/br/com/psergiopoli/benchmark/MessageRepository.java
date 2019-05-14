package br.com.psergiopoli.benchmark;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface MessageRepository extends CrudRepository<Message, Long>{}