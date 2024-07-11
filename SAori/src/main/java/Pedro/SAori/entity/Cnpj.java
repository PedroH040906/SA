package Pedro.SAori.entity;

import Pedro.SAori.service.PessoaDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CNPJ")
public class Cnpj extends Pessoa {

    @Id
    @Column(name = "id_pessoa")
    private Pessoa pessoa;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "I.M")
    private String iM;
    @Column(name = "i.E")
    private String iE;
    @Column(name = "ramo_atividade")
    private String ramoAtividade;

}