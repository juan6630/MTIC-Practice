def es_positivo():
    # print('Qué numero?')
    numero = int(input('Qué numero?'))
    if numero == 0:
        print('Es cero')
    elif numero < 0:
        print('Es negativo')
    else:
        print('Es positivo')


es_positivo()
