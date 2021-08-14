//1) Crie uma variável mesmoNome que verifica se nomeDoFulano é igual a nomeDoBeltrano;
nomeDoFulano = 'Gleydson'
nomeDoBeltrano = 'Pedro'
mesmoNome = (nomeDoFulano == nomeDoBeltrano)
console.log("1) " + mesmoNome)

//2) Crie uma variável maiorDeIdade que verifica se idade é de um adulto;
idade = 30
maiorDeIdade = (idade >= 18)
console.log("2) " + maiorDeIdade)

//3) Crie uma variável valorComJuros que calcula o valor de um boleto acrescido de 10% de juros por atraso;
valorBoleto = 100
valorComJuros = valorBoleto + (valorBoleto / 100) * 10 
console.log("3) " + valorComJuros)

//4) Faça a representação da fórmula de média aritmética, considerando um conjunto de elementos com 5 elementos nomeados como item1, item2, item3, item4 e item5;
item1 = 7
item2 = 7
item3 = 8
item4 = 5
item5 = 3
media = (item1 + item2 + item3 + item4 + item5) / 5
console.log("4) " + media)

//5) O lucro bruto de uma empresa é representado pela receita líquida de vendas menos o custo dos produtos vendidos. A margem bruta de uma empresa é calculada pela divisão do lucro bruto pela receita líquida de vendas. Faça a representação da fórmula da margem bruta, multiplicando o resultado final por 100 para obter o valor percentual;
receitaLiquida = 1000
custoProdutos = 50
lucroBruto = receitaLiquida - custoProdutos
margemBruta = (lucroBruto / receitaLiquida) * 100
console.log("5) " + margemBruta + "%")

//6) Usando qualquer ferramenta de codificação, crie um algoritmo seguindo os passos abaixo para encontrar o valor do saldo ao final do processo (atente-se para utilizar . como separador decimal):

// O saldo da sua conta é R$ 1000,00
saldoConta = 1000
//Você decide comprar uma calça por R$ 99,90
valorCalca = 99.99
saldoConta -= valorCalca
//Você recebe o seu salário de R$ 2500,00
salario = 2500
saldoConta += salario
//Você está caminhando na rua e decide dar R$ 0,10 para um morador de rua
ajudaMorador = 0.10
saldoConta -= ajudaMorador
//Você compra um ar condicionado cujo valor é 25% do seu saldo atual
precoArCondicionado = (saldoConta / 100) * 25
saldoConta -= precoArCondicionado
//Você decide antecipar o pagamento de uma dívida usando metade do seu saldo
anteciparDivida = saldoConta / 2
saldoConta -= anteciparDivida

console.log("6) O valor do seu saldo é: " + saldoConta.toFixed(2))

 
