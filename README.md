# Projeto-pratico-Sistema-de-Folha-de-Pagamento-em-Java

💼 Sistema de Folha de Pagamento em Java

Sistema desenvolvido em Java com foco no aprendizado de Programação Orientada a Objetos (POO), estruturas condicionais, estruturas de repetição, listas dinâmicas (ArrayList) e organização de código em classes e métodos.

O projeto simula um sistema simples de folha de pagamento capaz de cadastrar diferentes tipos de funcionários e calcular seus salários finais de acordo com seu tipo de vínculo.

🎯 Objetivo do Projeto

O objetivo do sistema é permitir:

✅ Cadastro de funcionários
✅ Cálculo de salário final
✅ Geração da folha de pagamento
✅ Aplicação de comissão e bônus de produtividade
✅ Armazenamento de funcionários em lista dinâmica

Além disso, o projeto foi criado para praticar conceitos fundamentais da linguagem Java.

🧠 Conceitos Aplicados

Durante o desenvolvimento foram utilizados os seguintes conceitos:

📌 Programação Orientada a Objetos (POO)
📌 Herança
📌 Polimorfismo
📌 Encapsulamento
📌 Sobrescrita de métodos (@Override)
📌 Construtores
📌 Métodos
📌 ArrayList
📌 Scanner
📌 Estruturas condicionais (switch, if)
📌 Estruturas de repetição (do-while, for-each)
📌 Constantes (static final)
📌 Validação de dados

📂 Estrutura do Projeto
src/
│
├── app/
│   └── Main.java
│
├── model/
│   ├── Funcionario.java
│   ├── FuncionarioComissionado.java
│   └── FuncionarioProducao.java
│
└── service/
└── FolhaDePagamento.java
⚙️ Funcionamento do Sistema

Ao executar o programa, um menu é exibido no terminal:

===== MENU =====
1 - Cadastrar Funcionário Padrão
2 - Cadastrar Funcionário Comissionado
3 - Cadastrar Funcionário Produção
4 - Gerar Folha de Pagamento
0 - Sair

O usuário pode cadastrar quantos funcionários desejar.

Todos os funcionários são armazenados em um ArrayList.

👨‍💼 Tipos de Funcionários
🧍 Funcionário Padrão

Recebe apenas o salário base.

Salário Final = Salário Base
💰 Funcionário Comissionado

Recebe salário base + comissão sobre vendas.

📌 Fórmula
Comissão = (vendas * percentual) / 100
📊 Exemplo
Vendas = 8000
Percentual = 5%

Comissão = 400
🏭 Funcionário de Produção

Recebe salário base + bônus por produtividade.

📌 Fórmula
Bônus = quantidadeProduzida * valorPorPeca
📊 Exemplo
Quantidade = 150
Valor por peça = 0.20

Bônus = 30
🧩 Explicação das Classes
🚀 Main.java

Classe principal do sistema.

Responsável por:

📌 Exibir menu
📌 Ler dados do usuário
📌 Controlar o fluxo do programa
📌 Chamar métodos de cadastro
📌 Encerrar o sistema
👤 Funcionario.java

Classe base do sistema.

Representa um funcionário genérico.

📌 Atributos
private int matricula;
private String nome;
📌 Constante
protected static final double SALARIO_BASE = 2000;

Foi utilizada uma constante porque o salário base é fixo para todos os funcionários.

🔧 Métodos da Classe Funcionario
📌 calcularExtra()
public double calcularExtra() {
return 0;
}

O funcionário padrão não possui bônus ou comissão.

📌 calcularSalario()
public double calcularSalario() {
return SALARIO_BASE + calcularExtra();
}

Responsável pelo cálculo do salário final.

💵 FuncionarioComissionado.java

Classe que herda de Funcionario.

extends Funcionario

Possui:

private double vendas;
private double percentualComissao;

Sobrescreve o método:

@Override
public double calcularExtra()

para calcular a comissão.

🏭 FuncionarioProducao.java

Classe responsável pelos funcionários de produção.

Possui:

private int quantidadeProduzida;
private double valorPorPeca;

Sobrescreve o método:

@Override
public double calcularExtra()

para calcular o bônus de produtividade.

📑 FolhaDePagamento.java

Classe responsável pelo gerenciamento da folha.

📌 Uso do ArrayList
private ArrayList<Funcionario> funcionarios;

O ArrayList foi utilizado porque a quantidade de funcionários é dinâmica.

➕ Método adicionarFuncionario()

Adiciona funcionários na lista.

funcionarios.add(funcionario);
📋 Método gerarFolha()

Percorre todos os funcionários e exibe:

👤 Nome
🆔 Matrícula
💵 Salário base
📈 Extras
💰 Salário final
🧠 Conceitos de POO Aplicados
🔒 Encapsulamento

Os atributos foram definidos como private.

Exemplo:

private String nome;

Isso protege os dados da classe.

🧬 Herança

As classes:

FuncionarioComissionado
FuncionarioProducao

herdam da classe:

Funcionario
🔄 Polimorfismo

O sistema utiliza:

ArrayList<Funcionario>

permitindo armazenar diferentes tipos de funcionários na mesma lista.

Cada objeto executa seu próprio cálculo de salário através da sobrescrita do método calcularExtra().

🏗️ Estruturas Utilizadas
🔀 switch

Utilizado para controlar o menu.

switch(opcao)
🔁 do-while

Mantém o programa em execução até o usuário escolher sair.

do {

} while(opcao != 0);
🔄 for-each

Percorre a lista de funcionários.

for(Funcionario f : funcionarios)
✅ Validação de Dados

Foi criado o método:

lerValorPositivo()

para impedir valores negativos.

Exemplo:

if (valor < 0) {
System.out.println("Valor inválido.");
}
🔢 Tipos Primitivos Utilizados
Tipo	Utilização
int	Matrícula e quantidade produzida
double	Salários, bônus e comissão
📦 Tipos de Objetos Utilizados
Objeto	Função
Scanner	Entrada de dados
ArrayList	Armazenamento dinâmico
String	Manipulação de textos
🖥️ Exemplo de Execução
===== FOLHA DE PAGAMENTO =====

Nome: Maria
Matrícula: 234

Salário Base: R$ 2000.00
Extras: R$ 400.00
Salário Final: R$ 2400.00
🚀 Possíveis Melhorias Futuras
🔍 Buscar funcionário por matrícula
❌ Remover funcionário
✏️ Editar dados
💾 Persistência em arquivo
🗄️ Integração com banco de dados
🖥️ Interface gráfica
📄 Relatórios em PDF
🛠️ Tecnologias Utilizadas
☕ Java
💻 IntelliJ IDEA / VS Code
🧠 Programação Orientada a Objetos
📚 Java Collections (ArrayList)
👨‍💻 Autor

Projeto desenvolvido para fins educacionais e prática de lógica de programação e Programação Orientada a Objetos em Java.
