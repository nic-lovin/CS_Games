def is_ipV4_Valid(ip):
    ipArray = ip.split(".")
    if len(ipArray) != 4:
        return False
    for i in range(0, 4):
        if (int(ipArray[i]) < 0) or (int(ipArray[i]) > 255):
            return False
        if len(ipArray[i]) > 4:
            return False
    return True

def is_ipV6_Valid(ip):
    ipArray = ip.split(":")
    if len(ipArray) != 8:
        return False
    for i in range(0, 8):
        if not is_hex(ipArray[i]):
            return False
    return True

def is_hex(s):
    hex_digits = set("0123456789abcdef")
    for char in s:
        if not (char in hex_digits):
            return False
    return True

numberOfLines = int(input())
for _ in range(0, numberOfLines):
    ip = input()
    if is_ipV4_Valid(ip):
        print("IPv4")
    elif is_ipV6_Valid(ip):
        print("IPv6")
    else:
        print("Neither")
