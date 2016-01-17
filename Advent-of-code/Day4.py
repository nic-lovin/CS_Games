import hashlib

i = 0
while True:
    answer = hashlib.md5(('bgvyzdsv' + str(i)).encode('utf-8')).hexdigest()
    if answer.startswith('000000'):
        print(i)
        break
    i += 1
