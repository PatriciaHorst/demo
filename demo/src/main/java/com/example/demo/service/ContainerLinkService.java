package com.example.demo.service;

import com.example.demo.dao.ContainerLinkDao;
import com.example.demo.model.ContainerLink;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerLinkService {

    private final ContainerLinkDao containerLinkDAO;

    public ContainerLinkService(ContainerLinkDao containerLinkDAO) {
        this.containerLinkDAO = containerLinkDAO;
    }


    public ContainerLink cadastrarContainer(ContainerLink container){
        return containerLinkDAO.save(container);
    }

    public ContainerLink buscarContainer(Integer ip){

        return containerLinkDAO.findById(ip).orElseThrow(() -> new RuntimeException("Container não encontrado"));
    }

    public ContainerLink atualizarContainer(Integer ip, ContainerLink container){

        ContainerLink containerExistente = buscarContainer(ip);

        containerExistente.setNome(container.getNome());

        return containerLinkDAO.save(containerExistente);
    }

    public List<ContainerLink> listarContainer(){
        return containerLinkDAO.findAll();
    }

    public void deletar(Integer ip){
        containerLinkDAO.deleteById(ip);
    }


}
