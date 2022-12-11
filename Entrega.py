#Primera parte

def suma(a, b, c):
    resultado = a + b + c
    return resultado

suma(20, 15, 30)



#Segunda parte
class Coche():
    puertas = 0

    def incremento_puertas():
        puertas += 1



miCoche = Coche
miCoche.incremento_puertas()

print(f'el numero actual de puertas es {miCoche.puerta}')