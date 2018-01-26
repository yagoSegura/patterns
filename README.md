# patterns

__Guide of creational patterns__

* ***Creational patterns***

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





