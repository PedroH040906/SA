package Pedro.SAori.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CPF")
public class Cpf {
    //PROBLEMA FALTA DE ID TODA CLASSE DEVE TER ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Column(name = "genero")
    private Character genero;
}
