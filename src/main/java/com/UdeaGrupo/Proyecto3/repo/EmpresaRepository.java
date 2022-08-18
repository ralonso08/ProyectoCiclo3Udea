package com.UdeaGrupo.Proyecto3.repo;

import com.UdeaGrupo.Proyecto3.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {



}
