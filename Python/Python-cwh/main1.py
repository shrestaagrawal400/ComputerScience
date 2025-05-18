import math

def calculate_area(radius):
    return math.pi * radius * radius

radius = float(input("Enter the radius of the circle for calculation the area: "))
area = calculate_area(radius)

print("The area of the circle is: ", area)