package com.example.demo.controller;


import com.example.demo.dao.ContainerLinkDao;
import com.example.demo.model.ContainerLink;
import com.example.demo.service.ContainerLinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContainerLink")
public class ContainerLinkController {

    private ContainerLinkService service;

    public ContainerLinkController(ContainerLinkService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ContainerLink> cadastrar(ContainerLink containerLink){
        return ResponseEntity.ok(service.cadastrarContainer(containerLink));
    }

    @GetMapping
    public ResponseEntity<List<ContainerLink>> listar(){
        return ResponseEntity.ok(service.listarContainer());
    }

    @GetMapping("/{ip}")
    public ResponseEntity<ContainerLink> buscar(Integer ip){
        return ResponseEntity.ok(service.buscarContainer(ip));
    }

    @PutMapping("/{ip}")
    public ResponseEntity<ContainerLink> atualizar(Integer ip, ContainerLink container){
        return ResponseEntity.ok(service.atualizarContainer(ip, container));
    }

    @DeleteMapping("/{ip}")
    public void deletar(Integer ip){
        service.deletar(ip);
    }
}
