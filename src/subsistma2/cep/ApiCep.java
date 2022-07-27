package subsistma2.cep;

public class ApiCep {
	
	private static ApiCep instancia = new ApiCep();
	
	private ApiCep () {
		super();
	}
	
	
	public static ApiCep getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return  "Salvador";
	}
	
	public String recuperarUF(String uf) {
		return  "BA";
	}
	

}
