# Abstract Factory Pattern - Car Factory

Este projeto demonstra a implementação do padrão de projeto **Abstract Factory** em Java para uma fábrica de carros. O padrão é usado para criar famílias de objetos relacionados sem especificar suas classes concretas.

---

## 📋 Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 🏎️ Modelos de Carros
- **`Car`**: Classe abstrata base para todos os carros. Contém atributos e métodos comuns, como `name`, `year`, `color` e `createdCar()`.
- **`Sedan`**: Classe que herda de `Car`, representando um carro do tipo sedan.
- **`SUV`**: Classe que herda de `Car`, representando um carro do tipo SUV.

### 🏭 Fábricas de Carros
- **`CarFactory`**: Interface que define os métodos `createSedan` e `createSUV`. Essas fábricas retornam objetos do tipo `Car`.
- **`ToyotaFactory`**: Implementação de `CarFactory` para criar carros da marca Toyota.
- **`FordFactory`**: Implementação de `CarFactory` para criar carros da marca Ford.

### 🔧 Classe Principal
- **`Main`**: Classe principal que utiliza as fábricas para criar diferentes tipos de carros e exibir suas informações.

---

## 🚀 Funcionalidades

- Criar carros do tipo Sedan e SUV usando fábricas específicas.
- Personalizar os carros com atributos como nome, ano e cor.
- Demonstrar o uso do padrão de projeto Abstract Factory.

