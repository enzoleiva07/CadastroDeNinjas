package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    // Adicionar Ninja (Create)
    @PostMapping("/criar")
    public String criarNinja(){ return "Ninja criado."; }

    // Mostrar ninja por ID (Read)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas(){ return "Mostrando todos os ninjas"; }

    // Mostrar todos os ninjas (Read)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasId(){ return "Mostrando todos os ninjas por ID"; }

    // Alterar dados do ninja (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){ return "Alterar Ninja por ID"; }

    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarPorId(){ return "Deleta Ninja por ID"; }

}
