package com.example.usuarioapi.repository;

import com.example.usuarioapi.model.UsuarioInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioInfoRepository extends JpaRepository<UsuarioInfo, Integer> {
}