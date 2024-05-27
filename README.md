# Sistema de Gerenciamento de Doações

## Descrição
Este projeto é um sistema simples de gerenciamento de doações desenvolvido em Java inspirado na situação que está ocorrendo no Rio Grande do Sul desenvolvido em Java. Ele permite o cadastro de doadores, voluntários e instituições de caridade, bem como o registro e visualização de doações.

## Funcionalidades
1. **Cadastro de Usuários:**
   - Doadores
   - Voluntários
   - Instituições de Caridade

2. **Registro de Doações:**
   - Doações em dinheiro
   - Doações de materiais

3. **Visualização de Dados:**
   - Lista de doadores
   - Lista de voluntários
   - Lista de instituições de caridade


### Classes e Métodos

#### Main.java
Classe principal que contém o método `main` para interagir com o usuário através do console.

#### Doador.java
Classe que representa um doador. Contém métodos para cadastrar doadores, listar doadores e encontrar doadores por nome.
- `public static void cadastrarDoador(String nome, String cpf, String endereco, String contato)`
- `public static void listarDoadores()`
- `public static Doador encontrarDoadorPorNome(String nome)`

#### Voluntario.java
Classe que representa um voluntário. Contém métodos para cadastrar voluntários e listar voluntários.
- `public static void cadastrarVoluntario(String nome, String cpf, String endereco, String contato)`
- `public static void listarVoluntarios()`

#### InstituicaoCaridade.java
Classe que representa uma instituição de caridade. Contém métodos para cadastrar instituições, listar instituições e encontrar instituições por nome.
- `public static void cadastrarInstituicao(String nome, String cnpj, String endereco, String contato, String areaAtuacao)`
- `public static void listarInstituicoes()`
- `public static InstituicaoCaridade encontrarInstituicaoPorNome(String nome)`

#### Doacao.java
Classe que representa uma doação. Contém métodos para cadastrar doações.
- `public static void cadastrarDoacao(Doador doador, InstituicaoCaridade instituicao, String tipo, double valor, String data)`
  
## Colaboradores:
- Anna rm550360
- Breno rm99275
- Danilo rm99465
- Pedro rm550689
