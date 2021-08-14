/*
Exercício:
O IMC significa Índice de Massa Corpórea e é um indicador utilizado pela OMS (Organização Mundial da Saúde) como referência para saber a saúde de uma pessoa com 
base no seu peso e altura.

O cálculo do IMC é feito pela divisão do peso de alguém pela sua altura ao quadrado. Os valores de referência do índice são:

        IMC	            Classificação	 Grau de Obesidade
Menor do que 18,50	       Magreza	                0
Entre 18,50 e 24,99	       Normal                   0
Entre 25,00 e 29,99	       Sobrepeso	        1
Entre 30,00 e 39,99	       Obesidade	        2
Maior ou igual a 40,00	    Obesidade grave 	        3

Faça um algoritmo que efetue o cálculo do IMC, com base nas variáveis peso e altura.

Exiba o valor do IMC e a classificação obtida. Se houver algum grau de obesidade, exiba também a mensagem: Cuidado! Você está acima do peso recomendado pela OMS.

Se o grau de obesidade for 3, adicione também a seguinte mensagem: É importante procurar um médico para avaliar sua saúde.
*/

let peso = 82
let altura = 1.80
let imc = peso / (Math.pow(altura, 2))

let grauObesidade = 0
let classificacao = ''

if (imc < 18.50){
    classificacao = "Magreza"
} else if (imc >= 18.50 && imc <= 24.99){
    classificacao = "Normal"
} else if (imc >= 25.00 && imc <= 29.99){
    grauObesidade = 1
    classificacao = "Sobrepeso"
} else if (imc >= 30.00 && imc <= 39.99){
    grauObesidade = 2
    classificacao = "Obesidade"
} else if (imc > 40.00){
    grauObesidade = 3
    classificacao = "Obesidade grave"
}

console.log("IMC: " + imc.toFixed(2))
console.log("Classificação: " + classificacao)

if (grauObesidade > 0){
    console.log("Cuidado! Você está acima do peso recomendado pela OMS.")
}
if (grauObesidade == 3){
    console.log("É importante procurar um médico para avaliar sua saúde.")
}


