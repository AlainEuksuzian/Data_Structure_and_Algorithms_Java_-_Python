"""Define a Polygon interface that has methods area( ) and perimeter( ). Then implement classes for 
Triangle, Pentagon, Hexagon, and Octagon,
which implement this interface, with the obvious meanings for the area( ) and
perimeter( ) methods. Also implement classes, IsoscelesTriangle, EquilateralTriangle, 
Rectangle, and Square, which have the appropriate inheritance relationships. Finally, 
write a simple user interface, which allows users to create
polygons of the various types, input their geometric dimensions, and then output 
their area and perimeter. For extra effort, allow users to input polygons by
specifying their vertex coordinates and be able to test if two such polygons are
similar."""

import math

class Polygon:
    def area():
        pass
    def perimeter():
        pass


class Triangle:
    def __init__(self, base, height):
        self.base = base
        self.height = height
       

    def area(self):
        return (self.height * self.base) /2

    def perimeter(self):
        return (self.height + self.base + self.height)


class Quadrilateral(Polygon):

    def __init__(self, a):
        self.__a = a

    def area(self):
        return round(0.25* math.sqrt(5*(5+2*math.sqrt(5))*pow(self.__a,2)),3)
    
    def perimeter(self):
        return 5 * self.__a
    

class Hexagon(Polygon):
    def __init__(self, area):
        self.__area = area

    def area(self):
        return round(pow(self.__area,2) * ((3*math.sqrt(3))/2),3)
    
    def perimeter(self):
        return (self.__area * 6)
        


class Octagon(Polygon):
    def __(self, area):
        self.__area = area

    def area(self):
        return round(2*(1+math.sqrt(2)) * pow(self.__area, 2),3)
    
    def perimeter(self):
        return (6 * self.__area)
    


class IsoscelesTriangle(Triangle):

    def __init__(self, base, height):
        super().__init__(base, height)
    

    def area(self):
        return (self.base * self.height) /2
    