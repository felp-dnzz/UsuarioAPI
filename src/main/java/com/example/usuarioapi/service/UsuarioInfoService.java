package com.example.usuarioapi.service;

import com.example.usuarioapi.model.UsuarioInfo;
import com.example.usuarioapi.repository.UsuarioInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioInfoService {
    @Autowired

    private UsuarioInfoRepository usuarioInfoRepository;

    public UsuarioInfo findById(int id){
        Optional<UsuarioInfo> usuarioInfo = usuarioInfoRepository.findById(id);
        return usuarioInfo.orElse(null);
    }

    public List<UsuarioInfo> findAll(){
        return usuarioInfoRepository.findAll();
    }

    public UsuarioInfo save(UsuarioInfo usuarioInfo) {
        return usuarioInfoRepository.save(usuarioInfo);
    }

    public void delete(int id){
        usuarioInfoRepository.deleteById(id);
    }
}
