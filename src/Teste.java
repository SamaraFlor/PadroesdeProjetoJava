import ProjetoStrategy.Comportamento;
import ProjetoStrategy.ComportamentoAgressivo;
import ProjetoStrategy.ComportamentoDefensivo;
import ProjetoStrategy.ComportamentoNormal;
import ProjetoStrategy.Robo;
import ProjetosSingleton.SingletonEager;
import ProjetosSingleton.SingletonLazy;
import ProjetosSingleton.SingletonLazyHolder;
import facade.Facade;

public class Teste {

	public static void main(String[] args) {
		
		// não conseguimos instancia somente acessar pela classe
		// testes realizados design patterns Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println("--------------------------------------------------------");
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		
		System.out.println("-----------------------------------------------------------");
		
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		
		// testes realizados design patterns Strategy
		//ultiliza muito polimorfismo
		System.out.println("------------------------Strategy----------------------");
		
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		System.out.println("------------------------Facade----------------------");
		
		Facade facade = new Facade();
		facade.migrarCliente("Samara", "07687998");
	}


}

