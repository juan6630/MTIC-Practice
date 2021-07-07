def key_index(key):
    if key == 'enero':
        return 0
    if key == 'febrero':
        return 1
    if key == 'marzo':
        return 2
    if key == 'abril':
        return 3


def solve_challenge():
    data = []
    default_dict = {
        'enero': ["4,3,4"],
        'febrero': ["4,5"],
        'marzo': ["3,1"],
        'abril': ["3"]
    }
    for i in range(4):
        temp_list = input().split()
        data.append(temp_list)
    for key in default_dict:
        default_dict[key] = data[key_index(key)]
    print(default_dict.values())


solve_challenge()
