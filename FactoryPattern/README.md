# Factory Pattern  

**Type:** Creational  
**Definition:** The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.  

## Problems That Solves  
- This pattern gives us a way to **encapsulate the instantiations of concrete types**.  
- Avoid duplication.  
- Provide one place to perfom maintenance.

## Design Principles  
### Dependency Inversion Principle  
**Depend upon abstraction. Do not depend upon concrete classes.**  
Note: Our high-level components should not depend on our low-level components; rather, they should both depend on abstractions.

