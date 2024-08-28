
fibo=0
nacci=1
seq=0
n=20

for i in range (n):
    print(fibo, end="   ")
    seq= fibo + nacci
    fibo = nacci
    nacci = seq
