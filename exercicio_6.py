i=1
notas_somadas=0
alunos = int(input("digite a qnt de alunos"))
while i<=alunos:
    nota=int(input("digite a nota do aluno"))
    notas_somadas+=nota
    i+=1
media = notas_somadas/alunos
print(media)