classes :- group of these entities 
object :- entities of the real world 

Getter & Setter 
Get :- to return the value
Set :- to modify the value

this :- this keyword is used to refer to the current object

Encapsulation :- is defined as the wrapping up of data & method under a single unit. it also implements data hiding.

Constructors :- is a special method which is invoked automatically at the time of object creation
--Constructors have the same name as class
--Constructors don't have a return type (not even void)
--Constructors are only called once, at object creation
--Memory allocation happens when constructor is called
        ---TYEPS---
a-non-parameterized
b-parameterized
c-copy constructor

shallow copy-
deep copy-

Inheritance:- is when properties & methods of base class are passed on to a derived class.
types
-single
-multilevel
-Hierarchical  
-hybrid

Polymorphism :- in java is the abibilty of an object to take on many forms.it allow one interface or method to represent different
underlying forms
--types
-Compile-time polymorphism - (Static) - Method Overloading
        Multiple function with same name but different parameters

-Run-time polymorphism - (dynamic) - Method Overriding  
        Parent and child classes both contain the same function with a different defination

Abstraction :- Hiding all the unnecessary details and showing only the important parts to the user.
    --Abstract class:-
        -Cannot create an instance of abstract class.
        -Can have abstract/non-abstract methods
        -Can have constructors

Interfaces:-is a blueprint of a class
    -All methods are public,abstract & without implementations
    -Used to acheive total abstraction
    -Variable in the interface are final,public and static