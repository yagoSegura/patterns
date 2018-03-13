# patterns

__Guide of creational patterns__

* ***GoF Creational patterns***
-------------------------------

  Creational design patterns are concerned with the way objects are created . These patterns
  are used when a decision must be made at the time a class is instantiated. Typically, the 
  details of the concrete class that is to be instantiated are hidden from the calling class
  by an abstract class that knows only about the abstract class or the interface it implements

  * **Abstract factory**

  ----------------

  ![Abstract factory UML](https://s11.postimg.org/okmvliygj/Abstract_Factory.gif)

       *Benefits*

         * It isolates the client from concrete implementation classes
         * It eases the exchanging of object families
         * It promotes consistency among objects

       *Applicable scenarios*

         * The system needs to be independent of how it's objects are created, 
           composed and represented
         * The system needs to be configured with one of multiple 
           families of objects
         * The family of related objects is intended to be used together, and this 
           constraint needs to be enforced
         * You want to provide a library of objects that does not show implementations and 
           only reveals interfaces

  * **Builder**

  ----------------

   ![Builder UML](http://www.dofactory.com/images/diagrams/net/builder.gif)

       *Benefits*

         * It permits you to vary an object's internal representation
         * It isolates the code for construction and representation
         * It provides finer control over the construction process

       *Applicable scenarios*

         * The algorithm for creating a complex object needs to be independent 
           of the components that compose the object and how they are assembled 
         * The construction process is to allow different representations of the 
           constructed object 

   * **Factory Method**

   -------------------

   ![Factory method](http://www.dofactory.com/images/diagrams/net/factory.gif)

       *Benefits*

         * It removes the need to bind application-specific classes into the code.The
           code interacts solely with the resultant interface, so it will work with 
           any classes that implement that interface
         * Because creating objects inside a class is more flexible than creating 
           an object directly, it enables the subclass to provide an extended version
           of an object

       *Applicable scenarios*

         * A class is not able to anticipate the class of objects it needs to create
         * A class wants it subclasses to specify the object it instantiates
         * Classes assign responsability to one of several helper subclasses, and you
           want to localize the knowledge of which helper subclass is the delegate 


  * **Prototype**

  -------------------

  ![Prototype](https://upload.wikimedia.org/wikipedia/commons/e/e5/Prototype_UML_%28padr%C3%A3o%29.png)

         *Benefits*

           * It lets you add or remove objects at runtime
           * It lets you specify new objects by varying it's values or structure  
           * It reduces the need of subclassing
           * It lets you dynamically configure an application with classes

         *Applicable scenarios*

           * The classes to instantiate are specified at run time
           * You need to avoid building a class hierarchy of factories that parallels the hierarchy 
             of objects
           * Instances of the class have one of only a few different combinations of state


  * **Singleton**

  -------------------

  ![Singleton](https://upload.wikimedia.org/wikipedia/commons/d/dc/Singleton_pattern_uml.png)

         *Benefits*

           * It controls access to a single instance of the class
           * It reduces namespace usage  
           * It permits refinement of operations and representation
           * It can also permit a variable number of instances

         *Applicable scenarios*

           * The scenario mos appropiate for the Singleton pattern is when a single instance 
           of a class is needed and must be accesible to clients from a well-known access point


* ***Gof Structural Design patterns***
---------------------------------------

  Structural patterns are concerned with composition or the organization of classes and objects , how classes 
  inherit from each other, and how they're composed from other classes

  * **Adapter**

     -------------------

  ![Adapter](http://www.dofactory.com/images/diagrams/net/adapter.gif)

         *Benefits*

           * It allows two or more previously incompatible objects to interact
           * It allows reusability of existing functionality  

         *Applicable scenarios*

           * An object needs to utilize an existing class with an incompatible interface
           * You want to create a reusable class that cooperates with classes that don't 
             necessarily have compatible interfaces
           * You need to use several existing subclasses but do not want to adapt their
             interfaces by subclassing each one

  * **Bridge**

     -------------------

  ![Bridge](http://www.dofactory.com/images/diagrams/net/bridge.gif)

         *Benefits*

           * It enables the separation of implementation from the interface
           * It improves extensibility
           * It allows the hiding of implementation details from the client


         *Applicable scenarios*

           * You want to avoid a permanent binding between the functional abstraction 
             and it's implementation.
           * Both the functional abstraction and it's implementation need to be extended
             using subclasses
           * Changes to the implementation should not impact the client (not even a recompile)


  * **Composite**

     -------------------

  ![Composite](https://dofactory.com/images/diagrams/net/composite.gif)

         *Benefits*

           * It defines class hierarchies consisting of primitive and complex objects
           * It makes it easier for you to add new kinds of components
           * It provides flexibility of structure with a manageable interface


         *Applicable scenarios*

           * You want to represent a full or partial hierarchy of objects
           * You want clients to be able to ignore the differences between 
             the varying objects in the hierarchy
           * The structure is dynamic and can have any level of complexity 
             -- for example , using the composite view from the java EE patterns catalog , 
             which is useful for portal applications


  * **Decorator**

     -------------------

  ![Decorator](http://www.dofactory.com/images/diagrams/net/decorator.gif)

         *Benefits*

           * It provides greater flexibility than static inheritance
           * It avoids the need to place feature-laden classes higher up the hierarchy 
           * It simplifies coding by allowing you to develop a series of 
             functionality-targeted classes, instead of coding all of the behaviour 
             into the object.
           * It enhances the extensibility of the object, because changes 
             are made by coding new classes 

         *Applicable scenarios*

           * You want to transparently and dynamically add responsabilities to 
             objects without affecting other objects
           * You want to add responsabilities to an object that you may want to 
             change in the future
           * Extending functionality by subclassing is no longer practical

  * **Facade**

     -------------------

  ![Facade](http://www.dofactory.com/images/diagrams/net/facade.gif)

         *Benefits*

           * It provides a simpler interface to a complex subsystem without reducing
             the options provided by the subsystem
           * It shields clients from the complexity of the subsystem components 
           * It promotes looser coupling between the subsystem and its clients
           * It reduces the coupling between subsystems provided that every
             subsystem uses its own facade pattern and other parts of the 
             system  use the facade pattern to communicate with the subsystem

         *Applicable scenarios*

           * You need to provide simple interface to a complex subsystem
           * Several dependencies exist between clients and the implementation 
             classes of an abstraction
           * Layering the subsystems is necessary or desired







