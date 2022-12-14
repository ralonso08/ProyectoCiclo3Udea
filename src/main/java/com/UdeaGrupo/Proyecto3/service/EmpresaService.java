package com.UdeaGrupo.Proyecto3.service;

import com.UdeaGrupo.Proyecto3.modelos.Empresa;
import com.UdeaGrupo.Proyecto3.repo.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(Empresa -> empresaList.add(Empresa));
        return empresaList;


    }

    public Empresa getEmpresabyId(Integer id){
        return  empresaRepository.findById(id).get();

    }

    public boolean saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp =  empresaRepository.save(empresa);
        if(empresaRepository.findById(emp.getId())!=null){
            return  true;
        }
        return false;

        }


}
