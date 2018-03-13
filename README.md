3aa3f8ca55a9df6c47c31b6a73b81dc1e8719ca1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       appropiate for the Singleton pattern is when a single instance 
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


 * **Facade**

     -------------------

  ![Facade](http://www.dofactory.com/images/diagrams/net/facade.gif)

         *Benefits*

           * It provides a simpler interface to a complex subsystem whitout reducing 
             the options provided by the system 
           * It shields clients from the complexity of the subsystem components
           * It promotes looser coupling between the subsystem and its clients.
           * It reduces the coupling between subsystems provided that every 
             subsystem uses its own facade pattern and other parts of the system 
             use the facade pattern to communicate with the subsystem


         *Applicable scenarios*

           * You need to provide a simple interface to a complex subsystem
           * Several dependencies exists between clients and the implementation classes 
             of an abstraction
           * Layering the subsystems is necessary or desired







