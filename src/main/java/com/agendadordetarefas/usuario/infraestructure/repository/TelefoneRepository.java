package com.agendadordetarefas.usuario.infraestructure.repository;

import com.lucovosky2.aprendendo_spring_2.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
