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
- Escrever (se estiver destampada e com tinta)

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

- `Caneta.java` → Classe que define o modelo da caneta  
- `Sistema.java` → Classe principal que executa o programa  

---

## 🔹 Como funciona a classe Caneta

### Atributos principais

- `marca`
- `cor`
- `valor`
- `material`
- `estaTampada`
- `quantidadeTinta`

---

## 🔹 Métodos criados

### ✅ estaTampada()

Retorna uma `String` informando se a caneta está:
- "tampada"
- "destampada"

---

### ✅ destamparCaneta()

Destampa a caneta caso ela esteja tampada.

Se já estiver destampada, exibe uma mensagem informando.

---

### ✅ escrever(String texto)

Permite escrever algo se:
- A caneta estiver destampada
- Tiver pelo menos 10% de tinta

Exibe no console o texto escrito.

---

## 🚀 Como executar

1. Execute a classe `Sistema.java`
2. O programa criará objetos do tipo `Caneta`
3. As informações serão exibidas no console

---

## 🎯 Objetivo do Exercício

Aplicar os conceitos básicos de:

- Classe e objeto
- Construtor
- Atributos
- Métodos
- Condições (if/else)
- Organização em pacotes
