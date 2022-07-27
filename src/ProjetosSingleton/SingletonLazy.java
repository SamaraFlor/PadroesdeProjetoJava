package ProjetosSingleton;



// padrao de implementação do Singleton
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	// privado para ninguem chamar
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null ) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}
