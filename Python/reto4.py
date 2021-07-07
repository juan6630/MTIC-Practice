def get_data(data, count, k=0):
    if k < count:
        data.append(float(input()))
        return get_data(data, count, k + 1)
    else:
        return data


def clasificacion_huevos(weight, result, k=0):
    if k < len(weight):
        classify = 'BC'
        # if 46 <= weight[k] < 53:
        #     classify = 'B'
        if 53 <= weight[k] < 60:
            classify = 'A'
        elif 60 <= weight[k] < 67:
            classify = 'AA'
        elif weight[k] >= 67:
            classify = 'AAA'
        result.append(classify)
        return clasificacion_huevos(weight, result, k + 1)
    else:
        return result


def calcular_bandeja(data):
    a = data.count('A')
    aa = data.count('AA')
    aaa = data.count('AAA')
    bc = data.count('BC')
    if a != 0:
        print('tipo_huevos:A numero_huevos: ' + str(
            a) + ' numero_bandejas: ' + str(a // 30))
    else:
        print('tipo_huevos:A numero_huevos: 0 numero_bandejas: None')
    if aa != 0:
        print('tipo_huevos:AA numero_huevos: ' + str(
            aa) + ' numero_bandejas: ' + str(aa // 24))
    else:
        print('tipo_huevos:AA numero_huevos: 0 numero_bandejas: None')
    if aaa != 0:
        print('tipo_huevos:AAA numero_huevos: ' + str(
            aaa) + ' numero_bandejas: ' + str(aaa // 12))
    else:
        print('tipo_huevos:AAA numero_huevos: 0 numero_bandejas: None')
    if bc != 0:
        print('tipo_huevos:BC numero_huevos: ' + str(
            bc) + ' numero_bandejas: ' + str(bc // 30))
    else:
        print('tipo_huevos:BC numero_huevos: 0 numero_bandejas: None')


def solve_challenge():
    count = int(input())
    data_set = []
    data_set = get_data(data_set, count)
    classified = []
    classified = clasificacion_huevos(data_set, classified)
    calcular_bandeja(classified)


solve_challenge()
