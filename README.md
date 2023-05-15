# PaymentApp_Java_OOP
This is a simple payment application that shows my understanding on the concepts of OOP in Java programming language.

Click on the link below to view the better resolution payment UML diagram.

[Payment UML Diagram](Payment_UML_Diagram.pdf)

![Payment UML Diagram](Payment_UML_Diagram.jpg)


### Inheritance:
GenernalPayment class *implements* the Payment Interface to inherit the Payment methods.

While the McDonaldsPayment class and KFCPayment class *extends* the GeneralPayment class to inherits the GeneralPayment methods.

### Polymorphism:
Each payment method ( *payCash()* & *payCreditCard()* ) in the GeneralPayment class is repeated with different signatures. This is to allow the individual fastfood restaurant to cater to their own implementations.

The McDonaldsPayment and KFCPayment are two different forms of the GeneralPayment.

### Encapsulation:
The data are encapsulated within the classes itself using the "private" access modifier and are only accessible through the getter and setter methods.

