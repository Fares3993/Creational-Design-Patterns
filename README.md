# Creational Design Patterns
Created tutorials on Creational Design Patterns using Java. The tutorials cover five essential patterns: Factory, Abstract Factory, Builder, Prototype, and Singleton

## 1- Factory Design Pattern:
Developed a Notification server. 
The system includes an "Notification" interface with a "notifyUser" function, and three classes ("SMSNotification," "EmailNotification," and "PushNotification") implementing the interface. The "NotificationFactory" class enables dynamic creation of notification objects based on the input channel ("SMS," "EMAIL," or "PUSH").

## 2- Abstract Factory Design Pattern:
Implemented a concise example of the Abstract Factory Design Pattern for a Furniture Store scenario. The project enables customers to select between metal or wood materials and further choose chairs or tables accordingly. Interfaces and classes represent various furniture items, ensuring modularity and flexibility. The Abstract Factory pattern facilitates the creation of furniture families without specifying their concrete classes, promoting scalability in the design.
## 3- Builder Design Pattern:
Developed a simple implementation of the Builder Design Pattern for creating User objects with optional attributes. The User class includes final attributes and an inner static UserBuilder class for constructing User objects with required and optional parameters. The pattern ensures immutability and flexibility when constructing User instances. The Main class exemplifies the usage of the UserBuilder to create User objects with different combinations of attributes.
## 4- Prototype Design Pattern
Implemented a simple example of the Prototype Design Pattern for creating and cloning Shape objects. The project includes an abstract Shape class with subclasses Rectangle, Square, and Circle. The ShapeCache class manages a Hashtable to store and clone shape objects based on their IDs. The main class demonstrates the usage of the Prototype pattern to clone and draw different shapes efficiently.
