package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {

    //added annotation for JPA
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    public boolean isNew() {
        return this.id == null;
    }

}
