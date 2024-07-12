package Pedro.SAori.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "CPF")
@PrimaryKeyJoinColumn(name="cpf")
public class Cpf extends Pessoa {

    @Column(name = "cpf")
    private String cpf;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Column(name = "genero")
    private Character genero;
}
