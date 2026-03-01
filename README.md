# Student Management System

A console-based Java application to manage student records.

## Features
- Add Students (Regular & Scholarship)
- View All Students
- Search Student by ID
- Update Marks
- Calculate Grades Automatically
- Find Top Performer

 **Abstraction** | Abstract class `Student` with abstract method `calculateGrade()` 
 **Encapsulation** | Private fields with public getters/setters |
 **Inheritance** | `RegularStudent` & `ScholarshipStudent` extend `Student` |
 **Polymorphism** | Method overriding for grade calculation |
 **Grade Calculation** | A (90+), B (75-89), C (60-74), F (below 60) |
 **Bonus Marks** | Scholarship students get +5 marks |
 **CRUD Operations** | Add, View, Search, Update |
 **Collections** | Used `ArrayList` to store students |
 **Menu Driven** | `while` loop + `switch` case |
