"""Write a Python class, Flower, that has three instance variables of type str,
int, and float, that respectively represent the name of the flower, its number of petals, and its price. Your class must include a constructor method
that initializes each variable to an appropriate value, and your class should
include methods for setting the value of each type, and retrieving the value
of each type"""


class Flower():

    def __init__(self,name: str, number_petals: int, price: float):
        self.__name = name
        self.__petals = number_petals
        self.__price = price

    
    def set_name(self, nameInput):
        self.__name = nameInput

    def set_petals(self, numPetals):
        self.__petals = numPetals
    
    def set_price(self, priceInput):
        self.__price = priceInput
    
    def get_name(self):
        return self.__name
    
    def get_petals_Number(self):
        return self.__petals
    
    def get_price(self):
        return self.__price
    
    def __str__(self):
        return "the flower type: " + self.__name + "\nThe number of petals: " + str(self.__petals) +"\nThe price: " + str(self.__price)





def main():
    myFlower = Flower('rose',7,2.5)

    myFlower.set_name('tulip')

    print(myFlower)



if __name__ == "__main__":
    main()