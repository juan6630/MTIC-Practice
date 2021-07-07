def dos_numeros():
    num1 = float(input('Ingrese el primer número'))
    num2 = float(input('Ingrese el segundo número'))
    if num1 == num2:
        print(num1 * num2)
    elif num1 > num2:
        print(num1 - num2)
    else:
        print(num1 + num2)


def tres_numeros():
    num1 = float(input('Ingrese el primer número'))
    num2 = float(input('Ingrese el segundo número'))
    num3 = float(input('Ingrese el tercer número'))
    if num1 > num2 and num1 > num3:
        print(num1)
    elif num2 > num3:
        print(num2)
    else:
        print(num3)


def utilidad():
    antiguedad = float(input('Ingrese su antigüedad en años'))
    if antiguedad < 1:
        print('Utilidad del 5%')
    elif 1 <= antiguedad < 2:
        print('Utilidad 7%')
    elif 2 <= antiguedad < 5:
        print('Utilidad 10%')
    elif 5 <= antiguedad < 10:
        print('Utilidad 15%')
    else:
        print('Utilidad 20%')


def horas_extra():
    horas = float(input('Ingrese el número de horas trabajadas'))
    if horas > 40:
        extras = horas - 40
        if extras <= 8:
            print('Se pagan ' + str(extras * 2) + ' horas extra')
        elif extras > 8:
            print('Se pagan' + str(8 * 2 + (extras - 8) * 3) + 'horas extra')


horas_extra()
