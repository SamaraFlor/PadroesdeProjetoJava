# PadroesdeProjetoJava
Padrões de projetos em java Puro 

Padrão Singleton
Um Singleton é um padrão de projeto bastante conhecido pela maioria dos programadores, trata-se de uma classe que é instanciada 
apenas uma vez. Os Singletons normalmente são componentes únicos do sistema, como por exemplo, um gerenciador de janela num sistema operacional 
ou o sistema de arquivos. Em ambos os exemplos, tanto o gerenciador de janelas quanto o gerenciador de arquivos
são um componente único que gerencia tudo em volta do sistema que se refere tanto às janelas quanto ao sistema de arquivos.

O padrão Singleton é muito utilizado em diversos frameworks e aplicações que necessitem de componentes únicos. 
Existem algumas abordagens para criar um Singleton, entre elas, uma através de Enumerações que facilita bastante a sua criação e a clareza do código. 
Além disso, a criação de Singletons através de enumerações acaba facilitando bastante a programação, pois várias situações são desnecessárias, 
como a preocupação com a serialização.



Padrão Strategy

Criar uma Strategy para cada variante e fazer com que o método delegue o algoritmo para uma instância de Strategy.

Um dos pré-requisitos para o Strategy é uma estrutura de herança onde cada subclasse específica contém uma variação do algoritmo. 
Assim, o padrão Strategy possui diversos benefícios como clarificar algoritmos ao diminuir ou remover lógica condicional, 
simplificar uma classe ao mover variações de um algoritmo para uma hierarquia, e habilitar um algoritmo para ser substituído por outro em tempo de execução.

Aplicabilidade
Em resumo o padrão Strategy pode ser utilizado quando se tem as seguintes situações:
Quando muitas classes relacionadas diferem apenas no seu comportamento;
Quando necessita-se de variantes de um algoritmo;
Quando se precisa ocultar do usuário a exposição das estruturas de dados complexas, específicas do algoritmo;
Quando uma classe define muitos comportamentos e por sua vez eles aparecem como diversos “IFs”. 
Com isso esses comandos condicionais são movidos para sua própria classe Strategy.


Facade
O Facade é um padrão de projeto estrutural que fornece uma interface simplificada (mas limitada) para um sistema complexo de classes, 
biblioteca, ou framework. Embora o Facade diminua a complexidade geral do aplicativo, também ajuda a mover dependências indesejadas para um só local.


GoF, sigla de Gang of Four, é o nome dado ao conjunto de padrões especificados por um grupo de quatro engenheiros de software e 
publicados no livro Padrões de Projeto: Soluções Reutilizáveis de Software Orientado a Objetos
![image](https://user-images.githubusercontent.com/65172085/181360007-15d7a85a-a472-453c-bef7-93cd9c946234.png)



