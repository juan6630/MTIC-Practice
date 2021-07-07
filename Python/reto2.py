def tomar_datos():
    peso = int(input())
    altura = float(input())
    return peso, altura


def imc(peso, altura) -> str:
    valor = 'Bajopeso'
    index = peso / (altura ** 2)
    if 18.5 <= index < 25:
        valor = 'Normal'
    elif 25 <= index < 30:
        valor = 'Sobrepeso'
    elif index >= 30:
        valor = 'Obeso'
    return valor


def resolver_reto():
    peso, altura = tomar_datos()
    imc_palabra = imc(peso, altura)
    print(imc_palabra)


resolver_reto()
