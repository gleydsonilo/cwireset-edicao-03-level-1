/* 
Exercício:
Repare na variável apresentacao mostrada a seguir. Ela é uma string que representa um texto que pode mudar conforme o valor de outras variáveis.
Identifique e crie todas as variáveis necessárias para que o texto de apresentacao seja exibido sem erros. 
Depois, crie a variável apresentacao exatamente como mostrado a seguir e a imprima da seguinte forma: console.log(apresentacao). 
*/

let nomeCompleto = "Gleydsonilo"
let apelido = "Gleydson"
let idade = 30
let dataNascimento = "06/06/1991"
let localNascimento = "Brasília - DF"
let altura = 1.9
let trabalhando = true

apresentacao = "Meu nome é " 
+ nomeCompleto 
+ " (sou conhecido como " 
+ apelido 
+ ") e tenho " 
+ idade 
+ " anos. Nasci no dia " 
+ dataNascimento 
+ ", na cidade de " 
+ localNascimento 
+ ". Tenho " 
+ altura 
+ "m de altura e atualmente estou " 
+ (trabalhando ? "empregado" : "desempregado") 
+ "."

console.log(apresentacao)
