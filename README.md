Student Information\
Name: Teagan Couto\
Course: COMP228\
Assignment: Midterm PartB

Compilation Instructions
1. Open project in IntelliJ IDEA (original project IDE)
2. Build project
3. Run Main.java

Class Hierarchy\
Person (Abstract)\
|\
Member\
|\
LibraryStaff (Abstract) -> LibraryAssistant\
|\
SeniorLibrarian

Test Case 1
1. Tested for valid member registration
2. Expected: Registration complete

Test Case 2
1. Member age below 18
2. Expected: Invalid error

Tets Case 3
1. Late fee using default rate
2. Expected: 7 days = $7.00

Test Case 4
1. Late fee using custom rate
2. Expected: 7 days x $$1.50 = $10.50

Test Case 5
1. Negative overdue days
2. Expected: Invalid error

Test Case 6
1. Static counters
2. Expected:
3. Persons = 5
4. Members = 2
5. Staff = 3

Test Case 7
1. bookId not found
2. Expected: Invalid error

OOP Concepts
1. Single inheritance: Member extends Person
2. Multilevel inheritance: Person -> LibraryStaff -> Librarian -> SeniorLibrarian
3. Hierarchical inheritance: LibraryStaff -> Librarian & LibraryAssistant
4. Multiple inheritance alterative, hybrid inheritance
5. Method overloading
6. Method overriding
7. Runtime Polymorphism