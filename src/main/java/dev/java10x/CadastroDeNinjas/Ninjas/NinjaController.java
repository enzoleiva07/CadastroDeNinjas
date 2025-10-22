package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/BOAS_VINDAS")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota!!";
    }

    // Adicionar Ninja (Create)
    @PostMapping("/criar")
    public String criarNinja(){ return "Ninja criado."; }

    // Mostrar ninja por ID (Read)
    @GetMapping("/todos")
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
