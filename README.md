# Shape Calculator
This is a Java program that calculates the **area**, **perimeter**, and **volume** of various shapes. The program is menu-driven, allowing users to select a shape and input its measurements. The program then calculates and displays the required values.The project follows **object-oriented programming (OOP)** principles and uses **abstract classes** and **interfaces** to define common behavior for shapes.

## **Features**
- Supports the following shapes:
  - **2D Shapes**:
    - Circle
    - Rectangle
    - Square
  - **3D Shapes**:
    - Sphere
    - Cylinder
    - Equilateral Pyramid (Square Base)
- Calculates:
  - **Area** (or Surface Area for 3D shapes).
  - **Perimeter** (if applicable).
  - **Volume** (for 3D shapes).
- Menu-driven interface for user interaction.

---

## **Project Structure**
The project consists of the following files:

### **1. Main.java**
- Contains the `main` method.
- Displays a menu to the user and handles user input.
- Creates objects of the selected shape and calls the appropriate methods to calculate area, perimeter, and volume.

### **2. Shape.java**
- **Abstract class** representing a shape.
- Contains:
  - A constructor to initialize the shape name.
  - Abstract methods:
    - `calculateShape()`: Calculates the area or surface area.
    - `calculatePerimeter()`: Calculates the perimeter (if applicable).

### **3. Volume.java**
- **Interface** for 3D shapes.
- Contains:
  - An abstract method `calculateVolume()` to calculate the volume of 3D shapes.

### **4. Circle.java**
- Represents a **Circle**.
- Extends the `Shape` class.
- Implements methods to calculate the area and perimeter of a circle.

### **5. Rectangle.java**
- Represents a **Rectangle**.
- Extends the `Shape` class.
- Implements methods to calculate the area and perimeter of a rectangle.

### **6. Square.java**
- Represents a **Square**.
- Extends the `Shape` class.
- Implements methods to calculate the area and perimeter of a square.

### **7. Sphere.java**
- Represents a **Sphere**.
- Extends the `Shape` class and implements the `Volume` interface.
- Implements methods to calculate the surface area and volume of a sphere.

### **8. Cylinder.java**
- Represents a **Cylinder**.
- Extends the `Shape` class and implements the `Volume` interface.
- Implements methods to calculate the surface area and volume of a cylinder.

### **9. EquilateralPyramid.java**
- Represents an **Equilateral Pyramid** (Square Base).
- Extends the `Shape` class and implements the `Volume` interface.
- Implements methods to calculate the surface area and volume of a pyramid.


## **Class and Interface Details**

### **Shape (Abstract Class)**
- **Purpose**: Represents a generic shape.
- **Methods**:
  - `calculateShape()`: Abstract method to calculate the area or surface area.
  - `calculatePerimeter()`: Abstract method to calculate the perimeter.

### **Volume (Interface)**
- **Purpose**: Defines behavior for 3D shapes.
- **Methods**:
  - `calculateVolume()`: Abstract method to calculate the volume.

### **Circle (Class)**
- **Purpose**: Represents a circle.
- **Methods**:
  - `calculateShape()`: Calculates the area of the circle.
  - `calculatePerimeter()`: Calculates the circumference of the circle.

### **Rectangle (Class)**
- **Purpose**: Represents a rectangle.
- **Methods**:
  - `calculateShape()`: Calculates the area of the rectangle.
  - `calculatePerimeter()`: Calculates the perimeter of the rectangle.

### **Square (Class)**
- **Purpose**: Represents a square.
- **Methods**:
  - `calculateShape()`: Calculates the area of the square.
  - `calculatePerimeter()`: Calculates the perimeter of the square.

### **Sphere (Class)**
- **Purpose**: Represents a sphere.
- **Methods**:
  - `calculateShape()`: Calculates the surface area of the sphere.
  - `calculateVolume()`: Calculates the volume of the sphere.

### **Cylinder (Class)**
- **Purpose**: Represents a cylinder.
- **Methods**:
  - `calculateShape()`: Calculates the surface area of the cylinder.
  - `calculateVolume()`: Calculates the volume of the cylinder.

### **EquilateralPyramid (Class)**
- **Purpose**: Represents an equilateral pyramid with a square base.
- **Methods**:
  - `calculateShape()`: Calculates the total surface area of the pyramid.
  - `calculateVolume()`: Calculates the volume of the pyramid.

