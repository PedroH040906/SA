package Pedro.SAori.service;

import Pedro.SAori.entity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CpfDTO {

    private PessoaDTO pessoa;
    private String cpf;
    private Date dataNascimento;
    private Character genero;

    private CpfDTO(String cpf, Date dataNascimento, Character genero) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
}
