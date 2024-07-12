package Pedro.SAori.service;

import Pedro.SAori.entity.Cpf;
import Pedro.SAori.entity.Endereco;
import Pedro.SAori.repository.CpfRepository;

public class CpfService {

    private CpfRepository repository;

    public void inserir(CpfDTO cpfDTO) {
        Cpf cpf = new Cpf();
        cpf.setCpf(cpfDTO.getCpf());
        cpf.setDataNascimento(cpfDTO.getDataNascimento());
        cpf.setGenero(cpfDTO.getGenero());
//        cpf.setNome(cpfDTO.getNome());
//        cpf.setTipo(cpfDTO.getTipo());
//        cpf.setTelefone(cpfDTO.getTelefone());
//        cpf.setObs(cpfDTO.getObs());

        Endereco endereco = new Endereco();
        endereco.setLogradouro(cpfDTO.getEndereco().getLogradouro());
        endereco.setBairro(cpfDTO.getEndereco().getBairro());
        endereco.setNumero(cpfDTO.getEndereco().getNumero());
        endereco.setCep(cpfDTO.getEndereco().getCep());
        endereco.setCidade(cpfDTO.getEndereco().getCidade());
        endereco.setComplemento(cpfDTO.getEndereco().getComplemento());
        endereco.setEstado(cpfDTO.getEndereco().getEstado());

//        cpf.setEndereco(endereco);
        repository.save(cpf);
    }
}
