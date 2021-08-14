/*
Exercícios:

Lembre-se que, para obter o tamanho de um array, é usada a expressão nomeDoArray.length. Ex.:

timesDeFutebol = ["Grêmio", "Inter", "Corinthians", "Flamengo"]
quantidadeDeTimes = timesDeFutebol.length
console.log(quantidadeDeTimes)

*/

//1) Crie um array de 5 posições com quaisquer valores. Utilize qualquer estrutura de repetição apresentada no vídeo para exibir todos os valores do array;

nomes = ["Skye", "Kiljoy", "Kay/O", "Sage", "Raze"]
console.log("Lista de Nomes: ")

i = 0
while (i<nomes.length){
    console.log(i+1 + ") " + nomes[i])
    i++
}

/*2) Crie um algoritmo capaz de calcular a média aritmética de um array com qualquer quantidade de elementos numéricos. Para fins de exemplo, o resultado do 
algoritmo com um array de valores 1, 2, 3, 5, 8, 13, 21, 23, 34, 55 deve ser 16.5. Procure usar uma estrutura de repetição diferente da que você usou para 
fazer o exercício anterior;*/

valores = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55]
soma = 0

for (i=0; i<valores.length; i++){
    soma += valores[i]
}

media = soma / valores.length

console.log("Média: " + media)

/*3) Considerando a lista dos 60 nomes mais comuns no Brasil nos últimos 10 anos, crie um algoritmo para verificar se seu nome está lá. 
Se sim, exiba a mensagem: É, nome comum :P. Se não, exiba a mensagem: Diferentão, hein? XD.*/

nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

verificaNome = false
i = 0

while(i<nomesComuns.length){
    if(nomesComuns[i] == "Gleydsonilo"){
        verificaNome = true
        i = nomesComuns.length
    }
    i++
}

if (verificaNome == false) {
    console.log("Diferentão, hein? XD")
} else {
    console.log("É, nome comum :P")
}
