package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //listar todos
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    //listar todos por ID
    public NinjaModel listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById((long) id);
        return ninjaById.orElse(null);
    }

    //Cadastrar Ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
}
