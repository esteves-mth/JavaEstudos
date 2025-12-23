# Grade System

Sistema simples de gerenciamento de notas desenvolvido em Java, com foco na aplicação de conceitos de **Programação Orientada a Objetos (OOP)**.

O projeto simula o controle de notas de um aluno por matéria, permitindo cálculos de médias e geração de relatórios.

## Funcionalidades

### 🎓 Student
- Cadastro de estudante com:
  - Nome
  - Turma
  - ID
- Associação de múltiplas notas
- Armazenamento das notas em uma lista

### 📘 Course
- Representa uma disciplina/matéria
- Armazena o nome do curso

### 📝 Grade
- Representa uma nota vinculada a uma matéria
- Validação de valores (0 a 10)
- Associação entre **nota** e **curso**

### 📊 GradeReport
- Listagem de todas as notas do aluno
- Geração de relatório por matéria
- Cálculo da média
- Verificação de aprovação ou reprovação

### ▶️ GradeSystemMain
- Classe principal para execução do sistema
- Demonstra o funcionamento completo do projeto

## Estrutura do Projeto

- **Student**
  - Contém dados do aluno
  - Mantém a lista de notas

- **Course**
  - Representa uma matéria/disciplina

- **Grade**
  - Liga uma nota a uma matéria
  - Garante validação dos valores

- **GradeReport**
  - Responsável pela geração de relatórios
  - Calcula médias e resultados finais

- **GradeSystemMain**
  - Simula o uso do sistema

## Exemplo de Fluxo

1. Criar um estudante
2. Criar cursos
3. Adicionar notas para diferentes matérias
4. Listar todas as notas
5. Gerar relatório por matéria
6. Verificar aprovação ou reprovação

## Conceitos de OOP Aplicados

- Encapsulamento
- Composição (`Student → Grade → Course`)
- Validação de dados
- Separação de responsabilidades
- Uso de Collections (`ArrayList`)
- Imutabilidade parcial (cópia defensiva da lista)

## Tecnologias Utilizadas

- Java
- Java Collections Framework
- Programação Orientada a Objetos (OOP)

## Objetivo do Projeto

Projeto desenvolvido para **praticar modelagem de sistemas educacionais em Java**, reforçando conceitos de OOP, lógica de negócio e organização de código.

📌 Projeto focado exclusivamente na lógica, sem interface gráfica.
