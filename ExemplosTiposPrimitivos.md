# Exemplos de Tipos Primitivos em Java

## Tipos Primitivos

Em Java, existem oito tipos primitivos, que são os tipos de dados mais básicos e fundamentais. Aqui estão eles:

1. **byte**: Representa um inteiro de 8 bits.
2. **short**: Representa um inteiro de 16 bits.
3. **int**: Representa um inteiro de 32 bits.
4. **long**: Representa um inteiro de 64 bits.
5. **float**: Representa um número de ponto flutuante de 32 bits.
6. **double**: Representa um número de ponto flutuante de 64 bits.
7. **char**: Representa um caractere Unicode de 16 bits.
8. **boolean**: Representa um valor booleano (verdadeiro ou falso).

## Exemplos de Declaração e Uso

##Referências

[bosontreinamentos.com.br](https://www.bosontreinamentos.com.br/java/declaracao-de-variaveis-em-java/)
[www.guru99.com](https://www.guru99.com/pt/java-variables.html)
[bytesapiens.com.br](https://bytesapiens.com.br/tutoriais/programacao/java/variaveis/)

Aqui estão alguns exemplos de como declarar e usar os tipos primitivos em Java:

```java
public class ExemplosTiposPrimitivos {
    public static void main(String[] args) {
        // Tipo byte
        byte exemploByte = 100;
        System.out.println("Valor do byte: " + exemploByte);

        // Tipo short
        short exemploShort = 10000;
        System.out.println("Valor do short: " + exemploShort);

        // Tipo int
        int exemploInt = 100000;
        System.out.println("Valor do int: " + exemploInt);

        // Tipo long
        long exemploLong = 100000L;
        System.out.println("Valor do long: " + exemploLong);

        // Tipo float
        float exemploFloat = 10.5f;
        System.out.println("Valor do float: " + exemploFloat);

        // Tipo double
        double exemploDouble = 10.5;
        System.out.println("Valor do double: " + exemploDouble);

        // Tipo char
        char exemploChar = 'A';
        System.out.println("Valor do char: " + exemploChar);

        // Tipo boolean
        boolean exemploBoolean = true;
        System.out.println("Valor do boolean: " + exemploBoolean);
    }
}
