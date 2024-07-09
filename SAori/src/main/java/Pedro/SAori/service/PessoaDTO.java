package Pedro.SAori.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private long id;
    private String nome;
    private String tipo;
    private String telefone;
    private String obs;
    private EnderecoDTO endereco;

    private PessoaDTO(String nome, String tipo, String telefone, String obs){
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.obs = obs;
        this.endereco = EnderecoDTO.builder().build();
    }
}
