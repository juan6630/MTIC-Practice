def get_sueldo():
    data = float(input())
    return data


def gastos(sueldo):
    alimento = sueldo * 0.2
    pasajes = sueldo * 0.2
    cine = sueldo * 0.1
    libros = sueldo * 0.15
    return [alimento, pasajes, cine, libros]


def saldo(saldo, gastos):
    for i in gastos:
        saldo -= i
    print(saldo)


def main():
    sueldo = get_sueldo()
    pagos = gastos(sueldo)
    saldo(sueldo, pagos)


main()
