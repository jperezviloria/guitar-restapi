package Guitar.demo.Guitar.Service;

import Guitar.demo.Guitar.Model.Guitar;

import java.util.List;
import java.util.Optional;

public interface GuitarService {

    List<Guitar> getAllGuitar();

    Optional<Guitar> getAllGuitarById(String idGuitar);

    String saveGuitar (Guitar guitar);


}
