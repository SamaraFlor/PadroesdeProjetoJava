package ProjetosSingleton;



// varia��o do Singleton
public class SingletonEager {
	
	
	// instancia ja atribuida 
	private static SingletonEager instancia = new SingletonEager();
	
	
	private SingletonEager () {
		super();
	}
	
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
