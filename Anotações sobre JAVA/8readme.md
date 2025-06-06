# ORDEM DE EXECUÇÃO EM JAVA

Existem basicamente dois níveis de execução:
🔸 1. Estático (``static``)
→ Executado apenas uma vez, quando a classe é carregada na memória.

🔸 2. De instância
→ Executado toda vez que um objeto é criado com ``new``.

## ORDEM DE EXECUÇÃO

🔹 Quando a classe é carregada (nível static):
1. Atributos estáticos (static) são declarados e inicializados (na ordem que aparecem).

2. Blocos static {} são executados, na ordem que aparecem no código.

3. Método main() é chamado (caso esteja presente).

🔸 Quando uma instância(Objeto) é criada:
1. ! Atributos de instância → inicializados na ordem em que aparecem.

2. Blocos de inicialização não estáticos ({}) → executados na ordem.

3. Construtor → executado por último.

RESUMO DA ORDEM
🔷 Quando a classe é carregada:
| Ordem | O que?               |
| ----- | -------------------- |
| 1     | Atributos `static`   |
| 2     | Blocos `static {}`   |
| 3     | `main()` (se houver) |

🔷 Quando um objeto é criado:
| Ordem | O que?                     |
| ----- | -------------------------- |
| 1     | Atributos de instância     |
| 2     | Blocos `{}` (de instância) |
| 3     | Construtor                 |
