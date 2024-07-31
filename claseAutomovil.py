class automovil:
    def __init__(self, color, año, capacidad, placa):
        self.color = color
        self.año = año
        self.capacidad = capacidad
        self.placa = placa
        self.kilometraje = 0
        self.tanqueGasolina = 0
        self.motor = False
        self.velocidad = 0


    def encenderApagar(self):
        if self.motor == False:
            self.motor = True
        else:
            self.motor = False 
    

    def aumentarKilometraje(self):
        self.kilometraje += 1
        textoKilometros = f"Kilómetros recorridos: {self.kilometraje}"
        print(textoKilometros)
    

    def llenarTanque(self):
        self.tanque = 100

    def aumentarVelocidad(self):
        if self.velocidad == 180:
            print("¡Ha alcanzado la velocidad máxima!")
        else:
            self.velocidad += 20
            textoVelocidad = f"Velocidad actual: {self.velocidad}"
            print(textoVelocidad)
    
    def disminuirVelocidad(self):
        if self.velocidad == 0:
            print("La velocidad actual es 0")
        else:
            self.velocidad -= 20
            textoVelocidad = f"Velocidad actual: {self.velocidad}"
            print(textoVelocidad)

#carro1 = automovil("rojo", 2010, 5, 876957)
#print(carro1.color)