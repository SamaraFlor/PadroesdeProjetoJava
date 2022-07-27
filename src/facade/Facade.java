package facade;

import subSistema1.crm.CRMService;
import subsistma2.cep.ApiCep;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = ApiCep.getInstancia().recuperarCidade(cep);
		String uf = ApiCep.getInstancia().recuperarUF(cep);

	  CRMService.gravarCliente(nome, cep, cidade, uf);
	}
}
