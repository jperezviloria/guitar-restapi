package Guitar.demo.Guitar.Service.Implementation;

import Guitar.demo.Guitar.Model.Guitar;
import Guitar.demo.Guitar.Repository.GuitarRepository;
import Guitar.demo.Guitar.Service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuitarServiceImplementation implements GuitarService {

    @Autowired
    GuitarRepository guitarRepository;


    @Override
    public List<Guitar> getAllGuitar() {
        return guitarRepository.findAll();
    }

    @Override
    public Optional<Guitar> getAllGuitarById(String idGuitar) {
        return guitarRepository.findById(idGuitar);

    }

    @Override
    public String saveGuitar(Guitar guitar) {

         guitarRepository.save(guitar);

    return "Guitar was added";

    }
}
