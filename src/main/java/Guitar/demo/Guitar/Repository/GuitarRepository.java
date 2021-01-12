package Guitar.demo.Guitar.Repository;

import Guitar.demo.Guitar.Model.Guitar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarRepository extends MongoRepository<Guitar, String > {


}
