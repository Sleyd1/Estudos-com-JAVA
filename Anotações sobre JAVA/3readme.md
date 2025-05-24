# Pacotes em Java
O que são Pacotes?
Pacotes são namespaces que organizam classes e interfaces em Java, evitando conflitos de nomes e facilitando a modularidade. Eles são como pastas que agrupam classes relacionadas, permitindo uma estrutura hierárquica.

Exemplo:
````java

package com.exemplo.backend.model; // Pacote
public class User {
    // Código da classe
}

````

* Estrutura: Pacotes usam notação de pontos (ex.: ``com.exemplo.backend``).

* Convenção: Nomes em minúsculas, baseados no domínio (ex.: ``com.empresa.projeto``).

 ## Por que Usar Pacotes?
* Organização: Agrupam classes por funcionalidade (ex.: model, service, controller).
   * Exemplo: Classes de entidades em com.exemplo.model, serviços em com.exemplo.service.

* Evitar Conflitos: Permitem classes com o mesmo nome em pacotes diferentes (ex.: com.exemplo.User vs. org.outra.User).

* Controle de Acesso: Modificadores como default limitam acesso ao mesmo pacote.

* Manutenibilidade: Facilitam a localização de classes em projetos grandes.

* Reutilização: Pacotes podem ser importados em outros projetos.

  No desenvolvimento backend, pacotes organizam o código em camadas:
* ``com.exemplo.model``: Entidades (ex.: ``User``, ``Order``).

* ``com.exemplo.service``: Lógica de negócios.

* ``com.exemplo.controller``: Endpoints REST.

* ``com.exemplo.repository``: Acesso a dados.

##  Como Utilizar Pacotes?
* Definir o Pacote:
  * Use a palavra-chave package no início do arquivo.

  * Exemplo: package com.exemplo.backend;.

* Importar Pacotes:
  * Use import para acessar classes de outros pacotes.

  * Exemplo: ``import java.util.List;``.

* Estrutura de Diretórios:
  * O pacote corresponde à estrutura de pastas (ex.: ``com/exemplo/backend/User.java``).

  * O compilador espera que a classe esteja na pasta correspondente ao pacote.

* Acesso com Modificadores:
  * Classes ou métodos default são acessíveis apenas no mesmo pacote.

  * Exemplo: Uma classe utilitária pode ser default para uso interno.
 
    Ex:
````java
    package com.exemplo.backend.service;

import com.exemplo.backend.model.User; // Importa classe de outro pacote

@Service
public class UserService {
    public User criarUsuario(String nome) {
        return new User(1L, nome);
    }
}

````

## Quando Usar Pacotes?
* Organizar Projetos: Sempre use pacotes em projetos backend para separar camadas.

* Evitar Conflitos: Quando nomes de classes podem colidir (ex.: múltiplas classes User).

* Escalabilidade: Em projetos grandes, pacotes mantêm o código gerenciável.

* Segurança: Use default para limitar acesso dentro do pacote.









