package com.example.usuarioapi.Controller;

import com.example.usuarioapi.model.UsuarioInfo;
import com.example.usuarioapi.service.UsuarioInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/usuario/info")
public class UsuarioInfoController {
    @Autowired
    private UsuarioInfoService usuarioInfoService;

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioInfo> findById(@PathVariable int id){
        return ResponseEntity.ok(usuarioInfoService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioInfo>> findAll(){
        return ResponseEntity.ok(usuarioInfoService.findAll());
    }

    @PostMapping
    public ResponseEntity<UsuarioInfo> save(@RequestBody UsuarioInfo usuarioInfo){
        return ResponseEntity.ok(usuarioInfoService.save(usuarioInfo));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        usuarioInfoService.delete(id);
    }
}
