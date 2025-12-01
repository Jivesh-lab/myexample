def circle_area(radius):
    if radius < 0:
        return 0
    return 3.14159 * radius * radius

def circle_circumference(radius):
    return 2 * 3.14159 * radius

print("Area:", circle_area(5))
print("Circumference:", circle_circumference(5))
