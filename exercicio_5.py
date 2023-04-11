# for x in range(100, 111):
#     print(x)
#
# n = int(input("digite um numero"))
# if n < 0:
#     print("digite um numero maior que zero")
# else:
#     for x in range(1, n):
#         print(x)
# while True:
#     n = int(input("digite um numero"))
#     if n <= 0:
#         print("digite um numero maior que zero")
#         continue
#     else:
#         for x in range(1, n):
#             print(x)
#         break
# i=0
# for num in range(10):
#     num = int(input("digite um numero: "))

#     if num < 0:
#         i += 1
# print(i)
# i = 0
# c=0
# for num in range(10):
#     num = int(input("digite um numero: "))
#     if num >=10 and num <=20:
#         i+=1
#     else:
#         c+=1
# print("A quantidade de números no intervalo é", i)
# print("A quantidade de números fora do intervalo é", c)
i=0
total=0
for num in range(10):
    num = int(input("digite um numero"))
    total = num+total
    i+=1
media = total/10
print(media)
