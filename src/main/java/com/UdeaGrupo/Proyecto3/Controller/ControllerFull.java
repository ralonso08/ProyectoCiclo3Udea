package com.UdeaGrupo.Proyecto3.Controller;

import com.UdeaGrupo.Proyecto3.modelos.Empresa;
import com.UdeaGrupo.Proyecto3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.*;
import java.util.List;

@Controller
public class ControllerFull {
    @Autowired
    EmpresaService empresaService;

    @GetMapping ({"/Empresas", "/VerEmpresas"})
    public String viewEmpresas(Model model){
        List<Empresa> listaEmpresas= empresaService.getAllEmpresas();
        model.addAttribute("emplist", listaEmpresas);
        return "VerEmpresas";

    }

    @GetMapping("/AgregarEmpresa")
    public String NuevaEmpresa(Model model){
        Empresa emp = new Empresa();
        model.addAttribute("emp", emp);
        return "agregarEmpresa";
    }

}
