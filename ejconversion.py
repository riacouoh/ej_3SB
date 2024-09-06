
num1=0
num2=0
result =0
oper = ""

print("     ***Calculadora simple***")

num1=float(input("Ingresa el primer número: "))
char=input("Ingrese un operador (+, -, *, /): ")
num2=float(input("Ingresa el segundo número: "))

if char =="+":
    res = num1+num2
    print(f'Resultado: {res}')
elif char =="-":
    res= num1-num2
    print(f'Resultado: {res}')
elif char =="*":
    res= num1*num2
    print(f'Resultado: {res}')
elif char =="/":
    if num2 != 0:
        res= num1*num2
        print(f'Resultado: {res}')
    else:
        print("¡Error! No se puede dividir entre cero.")
else:
    print("Operador no válido :(")
