package br.com.psergiopoli.benchmark.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.psergiopoli.benchmark.models.Message;

@Repository
@Transactional
public interface MessageRepository extends CrudRepository<Message, Long>{}