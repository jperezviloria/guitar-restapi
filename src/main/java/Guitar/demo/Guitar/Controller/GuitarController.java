package Guitar.demo.Guitar.Controller;


import Guitar.demo.Guitar.Model.Guitar;
import Guitar.demo.Guitar.Service.Implementation.GuitarServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("guitar")
public class GuitarController {

    @Autowired
    GuitarServiceImplementation guitarServiceImplementation;

    @GetMapping("/getall")
    public List<Guitar> getAllGuitar() {
        return guitarServiceImplementation.getAllGuitar();
    }
    @GetMapping ("/getbyid")
    public Optional<Guitar> getAllGuitarById(@RequestBody String idGuitar)

    { return guitarServiceImplementation.getAllGuitarById(idGuitar);


    }
        @PostMapping
    public String saveGuitar(@RequestBody Guitar guitar)
        { return guitarServiceImplementation.saveGuitar(guitar);
    }
}
