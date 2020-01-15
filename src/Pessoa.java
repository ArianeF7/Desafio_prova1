import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private List<Pessoa> pessoa;
	
	public Pessoa(String _nome, int _idade) {
		this.nome = _nome;
		this.idade = _idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

}
