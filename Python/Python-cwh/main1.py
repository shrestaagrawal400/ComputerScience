import math

def calculate_area(radius):
    return math.pi * radius * radius

def calculate_circumference(radius):
    return 2 * math.pi * radius

radius = float(input("Enter the radius of the circle for calculation the area and circumference: "))
area = calculate_area(radius)
circumference = calculate_circumference(radius)

print("The area of the circle is: ", area)
print("The circumference of the circle is: ", circumference)