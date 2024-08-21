# Declaração de Variáveis em Java

Em Java, uma variável é um contêiner que armazena dados que podem ser modificados durante a execução de um programa. A declaração de variáveis é essencial para a criação de programas eficientes e organizados.

## Tipos de Variáveis

Java é uma linguagem fortemente tipada, o que significa que cada variável deve ter um tipo declarado. Aqui estão alguns dos tipos de dados mais comuns:

- `int`: Números inteiros
- `double`: Números de ponto flutuante (decimais)
- `char`: Caracteres únicos
- `String`: Sequências de caracteres (texto)
- `boolean`: Valores verdadeiros ou falsos

## Sintaxe de Declaração

A sintaxe básica para declarar uma variável em Java é:

```java
tipo nomeDaVariavel [= valorInicial];
```
- ```tipo```: O tipo de dado que a variável irá armazenar.
- ```nomeDaVariavel```: O nome da variável.
- ```valorInicial```: (Opcional) O valor inicial atribuído à variável.

## Exemplos de Declaração

### Variáveis Inteiras
```java
int idade;
int ano = 2024;
```
### Variáveis de Ponto Flutuante
```java
double preco;
double pi = 3.14159;
```
### Variáveis de Caracteres
```java
char inicial;
char letra = 'A';
```
### Variáveis de String
```java
String nome;
String saudacao = "Olá, mundo!";
```
### Variáveis Booleanas
```java
boolean ativo;
boolean isJavaFun = true;
```
### Inicialização de Variáveis
A inicialização de uma variável pode ser feita no momento da declaração ou posteriormente no código. Aqui estão alguns exemplos:
```java
int numero;
numero = 10;

double altura = 1.75;
altura = 1.80;
```
### Boas Práticas
- Use nomes de variáveis descritivos e significativos.
- Siga a convenção camelCase para nomes de variáveis.
- Inicialize variáveis sempre que possível para evitar erros.

#### Exemplo Completo
Aqui está um exemplo completo de um programa Java que declara e utiliza várias variáveis:
```Java
public class ExemploVariaveis {
    public static void main(String[] args) {
        int idade = 25;
        double salario = 4500.50;
        char genero = 'M';
        String nome = "João";
        boolean empregado = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Empregado: " + empregado);
    }
}
```
Saiba mais 
[Youtube_Tutorial de Java](https://www.youtube.com/watch?v=btgjFETF5QA)
[Como declararar Constantes e Variáveis em Java](https://www.youtube.com/watch?v=-k9x1qnLxWc)
[Curso de Java - Variáveis de Classe e Variáveis de Instância](https://www.youtube.com/watch?v=H57gWJsfU3I)


