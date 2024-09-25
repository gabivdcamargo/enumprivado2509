package EnumPrivado;

public class EnumCidade {
	private String nome;
	private String estado;

	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
