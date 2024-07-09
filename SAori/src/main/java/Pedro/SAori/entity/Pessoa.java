package Pedro.SAori.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "obs")
    private String obs;
    @Column(name = "endereco")
    private Endereco endereco;
}
