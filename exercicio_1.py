numero=int(input("Digite um número: "))
while True:
    if numero == 0:
        input("O número incorreto, digite outro número")
    else:
        break
if numero % 2 == 0:
    input("O número digitado é par")
else:
    input("O número digitado é ímpar")