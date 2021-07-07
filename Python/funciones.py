def sum_ab(a, b):
    return a + b
# num1 = int(input('Primer número: '))
# num2 = int(input('Segundo número: '))
# print(sum_ab(num1, num2))


def sum_digit(num):
    digits = 0
    while num:
        digits += num % 10
        num //= 10
    return digits


while True:
    num = int(input('Ingrese un número: '))
    if num == 0:
        break
    else:
        print(sum_digit(num))

# print(sum_digit(932))
