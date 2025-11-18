package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar Ninja (Create)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){ return ninjaService.criarNinja(ninja); }

    // Mostrar ninja por ID (Read)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
            return ninjaService.listarNinjas(); 
    }

    //localhost8080/ninjas/listar/ID
    // Mostrar todos os ninjas (Read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
            return ninjaService.listarNinjaPorId(id);
    }

    // Alterar dados do ninja (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){ return "Alterar Ninja por ID"; }

    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarPorId(){ return "Deleta Ninja por ID"; }

}
