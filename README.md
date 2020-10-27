This package contains OOPS and Java work.

Abstract classes and methods - When you declare a class but don't instantiate it,you can only extend it.

An abstract method just has the declaration, there is no body to the method. 

A final class means we cannot extend it. They are rarely used. Strings cannot be final because they are immutable.

A final method cannot be overridden.

Try to implement just one or two levels of inheritance. 

Multiple inheritance is not supported in Java and is discouraged.

Interfaces are used to build loosely-coupled, extensible, testable applications.

Interface - What should be done. I.e. data compression, encryption, sorting and searching.

Classes - How it should be done. 

Dependency Injection - our classes should not instantiate their dependencies.

With dependency injection classes should not create and use objects, only one of the two, this is called the separation of concerns.

Dependency injection can be done with constructor inject, setter injection or method injection. Constructor injrection is the most popular.

Setter injections have the benefit of changing the dependency through out the lifetime of the program.

Interface Segregation Principle - divide big interfaces into smaller ones.

Don't mix different concerns or capabilities within interfaces.

Interface naming sometimes using the -able post fix, i.e. dragabole, etc.

Interfaces can use the extends keyword to inherit the methods of other interfaces.

Java can have multiple parents in inheritance.

Unit testing - Anytime the interface changes you can test the class.

The following at new features to Java with interfaces that are not widely accepted amongst devs: 

1. Having fields within an interface: any field in an interface is a public/static/final field. The intention is to avoid magic numbers.
 Very static numbers, such as Pi or the number of days in a year should not be stored in interfaces since they are an implementation detail.
 
 2. Being able to declare static methods in an interface: Interfaces are about what's, not how's. Do not use implementation or logic. 
 Use abstract classes to share within all children instead of using implementation in interfaces. Use the protected accessed modifier within
 the abstract class.
 
 3.Private methods: don't use!
 
 Interfaces: Contracts, to build loosely-coupled, extensible, testable applications.
 
 Abstract classes: partially-completed classes to share code. Interfaces can be used badly to use multiple inheritance. 
 
 Use interfaces when you want to decouple a class from its dependencies. 

Interfaces are beneficial to swap implementations, and test your class in isolation(unit testing), and extend your applications, 
particularly useful for designing a framework for others to use. 











