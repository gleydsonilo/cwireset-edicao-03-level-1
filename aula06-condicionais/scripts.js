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


