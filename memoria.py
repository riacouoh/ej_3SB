#memoria estática //arreglos fijos

calif = [0] *5

#input y registro en arreglo fijo ==> arreglo usual (consulta POO p/guía FOR)
for i in range(5): #mantiene mismas dimensiones
    calif[i] = int(input("Captura la calificación en número entero: "))
    print(f"Calificación: {calif[i]} pts.")


#memoria dinámica (listas dinámicas) (pueden cambiar) 
frutas = [] #arreglo vacío sin dimensiones especificadas

#append = add. del = delete

frutas.append("Mango")
frutas.append("Manzana")
frutas.append("Banana")
frutas.append("Uvas")

print(frutas)

del frutas[0]
frutas.pop(1)

frutas.append("Sandía")

print(frutas)

#delete puede usarse BUT solo borra primera instancia