# 🖊 Projeto: Classe Caneta (POO em Java)

## 📖 Sobre o Projeto

Este projeto foi desenvolvido para praticar Programação Orientada a Objetos (POO) em Java.  
Ele simula uma **caneta do mundo real**, representando suas características e comportamentos através de uma classe.

---

## 🧠 O que o objeto representa?

O objeto `Caneta` representa uma caneta física do mundo real.

Ela possui:
- Marca
- Cor
- Valor
- Material
- Estado (tampada ou destampada)
- Quantidade de tinta

Além disso, ela pode realizar ações como:
- Verificar se está tampada
- Destampar
- Escrever (somente se estiver destampada e com tinta suficiente)

---

## 📦 Estrutura do Projeto
```
br.com.ProjetoCaneta
│
├── main
│   └── Sistema.java
│
└── model
    └── Caneta.java
```

- `Caneta.java` → Classe que define o modelo da caneta (atributos, métodos, construtor)
- `Sistema.java` → Classe principal que instancia objetos e executa o programa

---

## 🔹 Atributos da Classe Caneta

| Atributo | Tipo | Descrição |
|---|---|---|
| `marca` | `String` | Marca da caneta |
| `cor` | `String` | Cor da tinta |
| `valor` | `double` | Preço da caneta |
| `material` | `String` | Material do corpo |
| `estaTampada` | `boolean` | Estado inicial: `true` (tampada) |
| `quantidadeTinta` | `float` | Percentual de tinta (inicia em 100%) |

---

## 🔹 Métodos

### ✅ Construtor `Caneta(marca, cor, valor, material)`
Cria uma nova caneta já com todos os atributos definidos.  
A caneta **sempre começa tampada** e com **100% de tinta**.

---

### ✅ `getEstaTampada()`
Retorna uma `String` informando se a caneta está:
- `"tampada"`
- `"destampada"`

---

### ✅ `destamparCaneta()`
Destampa a caneta caso ela esteja tampada.  
Se já estiver destampada, exibe uma mensagem informando.

---

### ✅ `escrever(String texto)`
Permite escrever **somente se**:
1. A caneta estiver **destampada**
2. Tiver **pelo menos 10% de tinta**

A cada escrita, consome **10% de tinta**.

---

### ✅ Getters e Setters
Todos os atributos são `private`, acessados por métodos públicos com validações:
- `setMarca()` → rejeita valores nulos ou vazios
- `setCor()` → rejeita valores nulos ou vazios
- `setValor()` → rejeita valores menores ou iguais a zero

---

## 🔄 Fluxo de uso no Sistema.java
```
Caneta criada (tampada, 100% tinta)
    ↓
Tenta escrever → BLOQUEADO (caneta tampada)
    ↓
Destampa a caneta
    ↓
Tenta escrever → SUCESSO (tinta diminui 10%)
    ↓
Tinta chega a menos de 10% → BLOQUEADO (tinta insuficiente)
```

---

## 🚀 Como executar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Execute a classe `Sistema.java`
4. As informações serão exibidas no console

---

## 🎯 Conceitos de POO aplicados

- ✅ Classe e Objeto
- ✅ Construtor
- ✅ Encapsulamento (`private` + getters/setters)
- ✅ Atributos e Métodos
- ✅ Validações com `if/else`
- ✅ Organização em pacotes

---

## 👨‍💻 Autor

**Pietro Mauer Godoy**  
Projeto desenvolvido como exercício de estudo de POO em Java.
