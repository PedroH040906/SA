package Pedro.SAori.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    //PROBLEMA DE RELACIONAMENTO
//    @Column(name = "pessoa")
//    private Pessoa pessoa;
    @Column(name = "data_cadastro")
    private Date dataCadastro;
    @Column(name = "papel")
    private int papel;
    @Column(name = "senha")
    private String senha;
    @Column(name = "email")
    private String email;
}
