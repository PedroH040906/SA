package Pedro.SAori.service;

import Pedro.SAori.entity.Cpf;
import Pedro.SAori.entity.Endereco;
import Pedro.SAori.entity.Pessoa;
import Pedro.SAori.repository.CpfRepository;
import Pedro.SAori.repository.EnderecoRepository;
import Pedro.SAori.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CpfService {

    private CpfRepository cpfRepository;
    private EnderecoRepository enderecoRepository;
    private PessoaRepository pessoaRepository;

    public void inserir(CpfDTO cpfDTO) {
        Endereco endereco = Endereco.builder()
                .cep(cpfDTO.getEndereco().getCep())
                .logradouro(cpfDTO.getEndereco().getLogradouro())
                .numero(cpfDTO.getEndereco().getNumero())
                .complemento(cpfDTO.getEndereco().getComplemento())
                .bairro(cpfDTO.getEndereco().getBairro())
                .cidade(cpfDTO.getEndereco().getCidade())
                .estado(cpfDTO.getEndereco().getEstado())
                .build();
        enderecoRepository.save(endereco);

        Pessoa pessoa = Pessoa.builder()
                .nome(cpfDTO.getNome())
                .telefone(cpfDTO.getTelefone())
                .endereco(endereco)
                .tipo(cpfDTO.getTipo())
                .obs(cpfDTO.getObs())
                .build();
        pessoaRepository.save(pessoa);

        Cpf cpf = Cpf.builder()
                .cpf(cpfDTO.getCpf())
                .dataNascimento(cpfDTO.getDataNascimento())
                .pessoa(pessoa)
                .build();
        cpfRepository.save(cpf);
    }
}
