package com.allison.api.forumhub.repository;

import com.allison.api.forumhub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
