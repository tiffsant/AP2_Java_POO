## **Sistema de Gerenciamento de Veículos em Java**

Este repositório contém a implementação de um sistema simples de gerenciamento de veículos, desenvolvido em Java com foco em orientação a objetos, explorando conceitos de classes abstratas, herança e métodos de acesso.

**Requisitos:**

**Veículo (classe abstrata)**

**Atributos:**
- marca
- modelo
- ano (privado, com getter e setter)

**Método abstrato:**
- informacoesVeiculo() → retorna os dados do veículo.

**Carro**
- Herda de Veiculo.

**Atributo adicional:**
- numeroPortas
- Implementa informacoesVeiculo() mostrando todos os dados do carro, incluindo número de portas.

**Moto**
- Herda de Veiculo.

**Atributo adicional:**
- cilindrada (privado, com getter e setter)
- Implementa informacoesVeiculo() mostrando todos os dados da moto, incluindo cilindrada.

**Main**
- Cria instâncias de Carro e Moto.
- Define os valores direto no código.
- Mostra as informações de cada veículo no console.

**Técnologia usadas**
- Java 17 (OpenJDK 17)
- VS Code
- Sistema operacional: Windows

**Como executar**
1. Clone o repositório:
2. Abra o projeto no VS Code (ou na IDE de sua preferência).
3. Compile e execute **Main.java**.
4. O console exibirá as informações do carro e da moto.
