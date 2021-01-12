package Guitar.demo.Guitar.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Guitar {

    @Id
    private String idGuitar;

    private String typeGuitar;

    private String brandGuitar;

    private int priceGuitar;

}
