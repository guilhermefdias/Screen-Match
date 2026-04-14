# Screen Match

Aplicação Java de console que representa um filme de um catálogo de streaming: guarda os dados do título, exibe a ficha técnica e calcula a média das avaliações recebidas.

Projeto de estudo para praticar os fundamentos de Java e orientação a objetos.

## Funcionalidades

- Cadastro de um filme com título, ano de lançamento, duração e se está incluído no plano
- Exibição da ficha técnica no console
- Registro de avaliações (notas) e cálculo da média

## Tecnologias

- Java (JDK 8 ou superior)
- Sem dependências externas

## Como executar

Pré-requisito: ter o JDK instalado (`java -version` e `javac -version` devem funcionar).

```bash
git clone https://github.com/guilhermefdias/Screen-Match.git
cd Screen-Match/src
javac Main.java Filme.java
java Main
```

Também é possível abrir a pasta no VS Code (com o Extension Pack for Java) e executar a classe `Main`.

## Estrutura do projeto

```
src/
├── Filme.java   # Classe que modela o filme: atributos e comportamentos
└── Main.java    # Ponto de entrada: cria um filme, exibe a ficha e registra avaliações
```

### Classe `Filme`

| Membro | Descrição |
| --- | --- |
| `titulo`, `anoLancamento`, `duracaoEmMinutos`, `incluidoNoPlano` | Dados do filme |
| `somaDasAvaliacoes`, `totalDeAvaliacoes` | Acumuladores usados no cálculo da média |
| `exibeFichaTecnica()` | Imprime os dados do filme no console |
| `avalia(double nota)` | Registra uma nova nota |
| `mediaDasAvaliacoes()` | Retorna a média das notas registradas |

## Exemplo de saída

O `Main` cadastra "O Poderoso Chefão" e o avalia com as notas 8, 7 e 9:

```
Titulo do filme: O Poderoso Chefão
Ano de lancamento: 1972
Duração em minutos: 175
Incluido no plano: true
Média das avaliações: 8.0
```

## Conceitos praticados

- Classes, objetos e atributos
- Métodos com e sem retorno
- Tipos primitivos (`int`, `double`, `boolean`) e `String`
- Operadores de atribuição e incremento
- Separação entre a classe de modelo (`Filme`) e a classe de execução (`Main`)

## Melhorias planejadas

- [ ] Encapsular os atributos (`private`) com getters e setters
- [ ] Criar construtores para inicializar o filme já com seus dados
- [ ] Tratar a média quando ainda não há avaliações (hoje a divisão por zero resulta em `NaN`)
- [ ] Adicionar a classe `Serie` e usar herança a partir de uma classe `Titulo`
- [ ] Guardar vários títulos em uma coleção (`ArrayList`)
- [ ] Adicionar testes unitários

## Autor

Guilherme Dias — [GitHub](https://github.com/guilhermefdias)
