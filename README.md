# Estudos-com-JAVA

* [Guia de estudos](https://techguide.sh/pt-BR/path/java/)
 ---
## Código de alto nível
Código de alto nível" (ou linguagem de alto nível) é um termo usado em programação para descrever linguagens que são mais próximas da linguagem humana e mais fáceis de entender e escrever do que linguagens de baixo nível (como Assembly ou código de máquina).

### Características de código de alto nível:
* Mais abstrato, esconde os detalhes do hardware.

* Mais fácil de ler, escrever e manter.

* Usa palavras-chave e estruturas que lembram a linguagem natural (como if, while, print, etc).

* Independente de plataforma (em geral), ou seja, o mesmo código pode funcionar em diferentes sistemas com pouca ou nenhuma modificação.

* Requer um compilador ou interpretador para ser transformado em código de máquina que o computador entende.

| Tipo de código         | Exemplo                   | Facilidade de entender |
| ---------------------- | ------------------------- | ---------------------- |
| Alto nível             | `print("Olá, mundo!")`    | Alta                   |
| Baixo nível (Assembly) | `MOV AH, 09h` / `INT 21h` | Baixa                  |
| Código de máquina      | `10110000 01100001`       | Muito baixa            |

---

## Compilação
Compilação é o processo de transformar o código-fonte ou codigo de alto nivel escrito em uma linguagem de alto nível (como C, Java, ou C++) em código de máquina que o computador consegue entender e executar diretamente.
#### Em outras palavras:
Você escreve um programa em uma linguagem que humanos entendem → o compilador traduza isso para uma linguagem que o processador entende (geralmente código binário).

### Compilador vs Interpretador:
* Compilador: traduz tudo de uma vez, antes da execução (ex: C, C++).

* Interpretador: lê e executa linha por linha em tempo real (ex: Python, JavaScript).

* Java é um caso misto: ele compila para bytecode, que é executado por uma máquina virtual (JVM).

  ### Processo de compilação do java

  Diferente de outras linguagem o processo de compilação do java e um pouco distinto porque envolve dois estágios principais:

  |Você escreve seu Código-fonte em Java |   
  |--------------------------------------|
          
                  ￬    ￬
                   
  | Você usa o compilador Java(JAVAC):  O javac compila o código e gera um arquivo Ola.class, que contém bytecode — uma linguagem intermediária que não é código de máquina ainda.|
  |-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

                  ￬    ￬



  |você roda o programa com JVM: A JVM (Java Virtual Machine) lê o Ola.class |
  |--------------------------------------------------------------------------|


                   ￬    ￬

 |Ela interpreta ou compila esse bytecode em tempo de execução (just-in-time) para código de máquina, compatível com o sistema operacional e processador da máquina onde está rodando|
 |-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

* O bytecode é portável → pode rodar em qualquer sistema que tenha a JVM

* Isso torna Java multiplataforma: você escreve o código uma vez e ele pode rodar em Windows, Linux, macOS, etc.

  ##### resumo simplificado

 | Seu código .java |
 |------------------|
        |
 | javac (compilador)|
 |-------------------|
    
        ↓
        
 |Bytecode .class|
 |---------------|
        |
        
  |JVM (interpreta e/ou compila JIT)|
  |---------------------------------|
     
        ↓
        
|Código de máquina → executado no seu PC|
|---------------------------------------|

 
## JVM (Java Virtual Machine)

* A JVM (Java Virtual Machine) é a máquina virtual responsável por executar programas Java.
  
* A JVM é como um "tradutor inteligente" que entende o bytecode Java (arquivos .class) e transforma isso em ações que o seu computador consegue executar.
  
* Ela não é o computador real, mas um programa especial que simula um computador próprio, feito especialmente para rodar Java.

 ### O que a JVM faz exatamente?
* Interpreta e/ou compila (JIT - Just In Time) o bytecode em código de máquina

* Gerencia memória automaticamente (com garbage collector)

* Protege contra erros graves (como acesso inválido à memória)

* Permite que o Java seja multiplataforma (escreve uma vez, roda em qualquer lugar com JVM)


## JRE – Java Runtime Environment
🚀 Ambiente de Execução Java

### 👉 O que é:
É o "motor" que roda programas Java. Ele não serve para programar, só para executar.

### 🎯 Serve para:
* Rodar programas Java já prontos, como jogos, sistemas ou aplicativos.

### 📦 Componentes principais:
|Componente |	Função|
|-----------|-------|
|JVM |	Executa o bytecode Java|
|Bibliotecas |	Classes Java padrão (ex: String, Math)|
|Arquivos de configuração|	Para rodar o ambiente corretamente|

### 👤 Público-alvo:
Usuários finais que só querem usar um programa feito em Java, sem programar.


## JDK

É um pacote completo que contém tudo o que você precisa para programar em Java.

### 🎯 Serve para:
* Criar programas em Java.

* Compilar seu código Java em bytecode (javac).

* Executar programas (pois inclui o JRE).

* Usar ferramentas como debugger, profilers, etc.

### 📦 Componentes principais:
|Componente	|Função|
|-----------|-------|
|javac |	Compilador Java (transforma .java em .class)|
|java	| Inicia a JVM e roda o bytecode|
|Bibliotecas padrão |	Códigos prontos para você usar (ex: Scanner, List)|
|JRE |	Já vem incluso para rodar os programas|

### 👤 Público-alvo:
Desenvolvedores Java (pessoas que escrevem código)


 ## IDE – Integrated Development Environment
🖥️ Ambiente de Desenvolvimento Integrado

### 👉 O que é:
* Um programa que facilita a vida do programador. É onde você escreve, edita, testa e depura seu código Java (ou outras linguagens).

### 🎯 Serve para:
* Escrever código com autocompletar, sugestões e organização.

* Rodar e testar programas com botões, sem precisar do terminal.

* Achar erros rapidamente com destaque de problemas.

* Facilitar o uso de bibliotecas, frameworks, etc.

### 🛠 Exemplos populares de IDEs para Java:
|IDE|	Destaques|
|---|----------|
|IntelliJ |IDEA	Muito poderosa, usada profissionalmente|
|Eclipse|	Muito usada em grandes projetos corporativos|
|NetBeans|	IDE oficial da Oracle|
|VS Code| (com plugin)	Leve e moderna|


## Sintaxe JAVA

### Variáveis
#### Tipos Primitivos:
* byte, short, int, long (inteiros).

* float, double (ponto flutuante).

* char (caractere).

* boolean (verdadeiro/falso).

#### Tipos de Referência:
* Classes, String, arrays, interfaces.

* Exemplo: String nome = "API";

* Métodos: Blocos de código reutilizáveis com tipoRetorno nome(params) {...}.

* Modificadores: Controlam acesso (public, private) e comportamento (static, final).




## Fluxo de Decisão

* Preciso expor a funcionalidade? → Use public.

* É uma lógica interna? → Use ``private``.

* É compartilhado entre instâncias? → Use ``static``.

* É uma constante ou não deve ser alterado? → Use ``final``.

* A lógica é reutilizável ou complexa? → Crie um ``método``.

* Preciso processar dados em sequência? → Combine com ``loops/arrays``







