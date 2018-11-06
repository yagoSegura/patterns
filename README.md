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


  * **Flyweight**

     -------------------

  ![Flyweight](https://static.dzone.com/dz1/dz-files/flyweight_pattern.png)

         *Benefits*

           * It reduces the number of objects to deal with
           * It reduces the amount of memory and storage devices required if the 
             objects are persisted  

         *Applicable scenarios*

           * An application uses a considerable number of objects
           * The storage costs are high because of the quantity of objects
           * The application does not depend on object identity


  * **Proxy**

     -------------------

  ![Proxy](https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Proxy_pattern_diagram.svg/439px-Proxy_pattern_diagram.svg.png)

         *Benefits*

           * The remote proxy can shield the fact that the implementation
             resides in another address space
           * The virtual proxy can perform optimizations - for example,
             by creating objects in demand  

         *Applicable scenarios*

           * The proxy pattern is appropiate when a more versatile
             or sophisticated reference to an object, rather than a 
             simple pointer, is needed

* ***Gof Behavioural Design patterns***
---------------------------------------

  Behavioural patterns are concerned with the interaction and responsibility of objects . They
  help make complex behaviour manageable by specifying the responsibilities of objects and
  the ways they communicate with each other

  * **Chain of responsibility**

     -------------------

  ![Chain of responsibility](https://www.tutorialspoint.com/design_pattern/images/chain_pattern_uml_diagram.jpg)

         *Benefits*

           * It reduces coupling
           * It adds flexibility when assigning responsibilities to objects
           * It allows a set of classes to act as one; events produced in one class
             can be sent to other handler classes within the composition  

         *Applicable scenarios*

           * More than one object can handle a request , and the handler is unknown
           * A request is to be issued to one of several objects , and the receiver 
             is not specified explicitly
           * The set of objects to handle the request is to be specified dynamically    

* **Command**

     -------------------

  ![Command](http://www.dofactory.com/images/diagrams/net/command.gif)

         *Benefits*

           * It separates the object that invokes the operation from the object 
             that actually performs the operation
           * It simplifies adding new commands, because existing classes remain 
             unchanged

         *Applicable scenarios*

           * You need to parameterize objects according to an action to perform
           * You create , queue, and execute requests at different times
           * You need to support rollback, logging, or transaction functionality    


* **Interpreter**

     -------------------

  ![Interpreter](https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Interpreter_UML_class_diagram.svg/536px-Interpreter_UML_class_diagram.svg.png)

         *Benefits*

           * It is easy to change and extend the grammar
           * Implementing the grammar is straightforward

         *Applicable scenarios*

           * The grammar of the language is not complicated
           * Efficiency is not a priority


* **Iterator**

     -------------------

  ![Iterator](http://www.dofactory.com/images/diagrams/net/iterator.gif)

         *Benefits*

           * It supports variations in the traversal of a collection
           * It simplifies the interface to the collection

         *Applicable scenarios*

           * Access to a collection object is required without having to expose
             it's internal representation
           * Multiple traversals of objects need to be supported in the collection
           * A universal interface for traversing different structures 
             needs to be provided in the collection
           

* **Mediator**

     -------------------

  ![Mediator](http://www.dofactory.com/images/diagrams/net/mediator.gif)

         *Benefits*

           * It decouples colleagues
           * It simplifies object protocols
           * It centralizes control
           * The individual components become simpler and much easier to 
             deal with because they do not need to pass messages to one 
             another
           * The components do not need to contain logic to deal with 
             their intercommunication and are therefore more generic

         *Applicable scenarios*

           * A set of objects communicates in complex but well-defined ways
           * Custom behaviour distributed between several objects is required
             without subclassing. It is commonly used structurally in message
             based systems . The messages themselves are the means by which
             related objects are decoupled 
           
* **Memento**

     -------------------

  ![Memento](http://www.dofactory.com/images/diagrams/net/memento.gif)

         *Benefits*

           * It preserves encapsulation boundaries
           * It simplifies the originator

         *Applicable scenarios*

           * A snapshot containing enough information regarding the state of
             an object can be saved so that it can be restored to the complete
             state using the snapshot information later

           * Using a direct interface to obtain the state would impose implementation
             details that would break the rules of encapsulation for the object 


* **Observer**

     -------------------

  ![Observer](http://www.dofactory.com/images/diagrams/net/observer.gif)

         *Benefits*

           * It abstracts the coupling between the subject and the observer
           * It provides support for broadcast-type communications

         *Applicable scenarios*

           * A change to an object requires changing other objects, and the number of
	     objects that need to be changed is unknown

           * An object needs to notify other objects without making any assumptions about
	     the identity of those objects


* **State**

     -------------------

  ![State](https://www.dofactory.com/images/diagrams/net/state.gif)

         *Benefits*

           * It keeps state-specific behavior local and partitions behavior for different states 
           * It makes any state transition explicit

         *Applicable scenarios*

           * The behavior of an object depends on it's state , and it must be able to 
	     change it's behavior at run time according to the new state

           * Operations have large , multipart conditional statements that depend of the 
	     state of the object

* **Strategy**

     -------------------

  ![Strategy](https://www.dofactory.com/images/diagrams/net/strategy.gif)

         *Benefits*

           * It provides a substitute to subclassing 
           * It defines each behaviour within it's own class, eliminating the need for conditional statements
           * It makes it easier to extend and incorporate new behaviour without changing the application

         *Applicable scenarios*

           * Multiple classes differ only in their behaviours . The servlet API is a classic example of this. 

           * You need different variations of an algorithm

           * An algorithm uses data that is unknown to the client

* **Template Method***

     -------------------

 ![Template Method](https://www.dofactory.com/images/diagrams/net/template.gif)

         *Benefits*

           * The template method pattern is a very common technique for reusing code 

         *Applicable scenarios*

           * You want to implement the nonvarying parts of an algorithm in a single class
	     and the varying parts of the algorithm in subclasses

           * Common behaviour amon subclasses should be moved to a single common class, 
	     avoiding duplication

     
* ***Visitor***

     -------------------

 ![Visitor](https://www.dofactory.com/images/diagrams/net/visitor.gif)

         *Benefits*

           * It simplifies the addition of new operations

	   * It gathers related operations while separating unrelated ones

         *Applicable scenarios*

           * An object structure contains many objects with differing interfaces and there
	     is a need to perform operations on these objects in a way that depends on 
	     their concrete classes

           * Many distinct and unrelated operations need to be performed on objects in a 
	     structure and there is a need to avoid cluttering the classes with these operations

	   * The classes defining the object structure rarely change but you frequently 
	     need to define new operations that perform over the structure


