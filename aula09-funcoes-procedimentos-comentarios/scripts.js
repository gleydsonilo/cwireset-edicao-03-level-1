/*Exercícios:
1) Crie uma função chamada imprimir que recebe um argumento e simplesmente imprime ele na tela;*/

function imprimir(texto){
    console.log(texto)
}

imprimir("Exercícios - Aula 09")

/*
2) Lembra dos exercícios que propusemos na Aula 05 - Variáveis? Com base neles, faça o seguinte:

Crie uma função para cada algoritmo proposto lá, exceto o número 6;

Todas as funções devem retornar o valor final;

Procure dar nomes que façam sentido às funções. Ex.: a função para o item 4 poderia se chamar mediaAritmetica ou calcularMediaAritmetica;

Procure utilizar comentários para documentar cada método;

Na função da média aritmética, evite colocar todos os itens como argumentos do método, pois isso limitaria sua utilização a um número fixo de elementos. 

Tente implementar uma lógica para receber um array e calcular a média em cima dele, tornando a função mais reaproveitável em diferentes situações.
*/


//1) Funcao recebe dois dados como parametro e compara se são iguais.
function verificarNomes(nomeDoFulano, nomeDoBeltrano){
    mesmoNome = (nomeDoFulano == nomeDoBeltrano)
    if (mesmoNome){
        return console.log("1) " + nomeDoFulano + " e " + nomeDoBeltrano + " são nomes iguais!")
    } else
        return console.log("1) " + nomeDoFulano + " e " + nomeDoBeltrano + " são nomes diferentes!")
}
verificarNomes("Gleydson", "Eduardo")


//2) Funcao verifica se a idade passada no parâmetro é de um adulto.
function verificaMaiorIdade(idade){
    maiorDeIdade = (idade >= 18)
    if (maiorDeIdade){
        return console.log("2) " + idade + " anos? Já é um adulto!")
    } else
        return console.log("2) " + idade + " anos? Calma ai, ainda não é adulto!")
}
verificaMaiorIdade(30)

//3) Funcao que calcula o valor de um boleto acrescido de 10% de juros por atraso e retorna o valor com juros.
function calcularJurosDezPorcento (valorBoleto){
    valorComJuros = valorBoleto + (valorBoleto / 100) * 10 
    return console.log("3) Boleto com valor de R$ " + valorBoleto + " com juros de 10% fica: R$ " + valorComJuros)
}
calcularJurosDezPorcento(100)

//4) Funcao que calcula e retorna a média aritimética dos valores informados no vetor.
let vetor = [20, 5, 10, 10, 50]
function calcularMedia(vetor){
    soma = 0
        for (i=0; i<vetor.length; i++){
            soma += vetor[i]
        }
    media = soma / vetor.length
    return console.log("4) A media dos valores (" + vetor + ") é de: " + media.toFixed(2))
}
calcularMedia(vetor)

//5) Funcao que calcula e retorna o valor percentual da margem bruta
function percentualMargemBruta(receitaLiquida, custoProdutos){
    lucroBruto = receitaLiquida - custoProdutos
    margemBruta = (lucroBruto / receitaLiquida) * 100
    return console.log("5) O percentual da margem bruta é de " + margemBruta + "%")
}
percentualMargemBruta(1000, 80)
