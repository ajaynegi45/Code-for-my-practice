# code = {
#     "A": ".0",
#     "B": ".1",
#     "C": ".2",
#     "D": ".3",
#     "E": ".4",
#     "F": ".00",
#     "G": ".5",
#     "H": ".6",
#     "I": ".7",
#     "J": ".8",
#     "K": ".9",
#     "L": ".10",
#     "M": ".11",
#     "N": ".12",
#     "O": ".13",
#     "P": ".14",
#     "Q": ".15",
#     "R": ".16",
#     "S": ".17",
#     "T": ".18",
#     "U": ".19",
#     "V": ".20",
#     "W": ".21",
#     "X": ".22",
#     "Y": ".23",
#     "Z": ".24",
#     "a": ".25",
#     "b": ".26",
#     "c": ".27",
#     "d": ".28",
#     "e": ".29",
#     "f": ".30",
#     "g": ".31",
#     "h": ".32",
#     "i": ".33",
#     "j": ".34",
#     "k": ".35",
#     "l": ".36",
#     "m": ".37",
#     "n": ".38",
#     "o": ".39",
#     "p": ".40",
#     "q": ".41",
#     "r": ".42",
#     "s": ".43",
#     "t": ".44",
#     "u": ".45",
#     "v": ".46",
#     "w": ".47",
#     "x": ".48",
#     "y": ".49",
#     "z": ".50"
# }
# message = input("Enter Your Message:  ")
# print(code.get(message))



def machine() :
    key = 'abcdefghijklmnopqrstuvwxyz !'
    value = key[-1] + key[0:-1]
    encryptDict = dict(zip(key, value))
    decryptDict = dict(zip(value, key))
    message = input ("Please enter your secret message:-  ")
    mode = input("Please enter the mode : Encode(E) OR Decode(D):- ")
    if mode.upper() == 'E':
        newMessage = ''.join([encryptDict[letter]
                         for letter in message.lower ()])
    elif mode.upper() == 'D':
        newMessage = ''.join([decryptDict[letter]
                         for letter in message.lower ()])
    else:
        print("Please enter a correct Choice")

    return newMessage.capitalize()

print(machine())