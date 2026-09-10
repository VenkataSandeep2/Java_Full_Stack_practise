Java Singleton Pattern -- Employee Example

📌 Project Overview

This project demonstrates the Singleton Design Pattern in Java using
an Employee_2 class.

The main purpose is to understand how Java can restrict a class to
only one object instance and provide a common method to access that
same object.

This concept is useful as a foundation for understanding Spring and
Spring Boot Singleton Beans.

🎯 Learning Objectives

Understand the Singleton Design Pattern.

Understand why a constructor can be made private.

Understand the use of a static instance variable.

Understand how a static factory/access method works.

Understand how null checking prevents multiple object creation.

Verify that multiple references point to the same object.

Understand the difference between an entity object and a Singleton
object.

📂 Project Structure

src
└── com
    ├── model
    │   └── Employee_2.java
    │
    └── test
        └── Test_2.java

🔹 Employee_2.java

package com.model;

public class Employee_2 {

    private int emp_id;

    private static Employee_2 emp;

    private Employee_2() {

    }

    public static Employee_2 getEmployee_2Instance() {

        if (emp == null) {
            emp = new Employee_2();
        }

        return emp;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + "]";
    }
}

🔹 Test_2.java

package com.test;

import com.model.Employee_2;

public class Test_2 {

    public static void main(String[] args) {

        Employee_2 emp1 = getEmployee();
        Employee_2 emp2 = getEmployee();
        Employee_2 emp3 = getEmployee();

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());

        System.out.println(emp1 == emp2);
        System.out.println(emp2 == emp3);
        System.out.println(emp1 == emp3);
    }

    public static Employee_2 getEmployee() {

        Employee_2 emp = Employee_2.getEmployee_2Instance();

        return emp;
    }
}

🔍 How Singleton Works

The Singleton implementation follows three main rules.

1. Private Constructor

private Employee_2() {

}

Because the constructor is private, other classes cannot directly
create an object:

Employee_2 emp = new Employee_2();

This is not allowed outside the Employee_2 class.

2. Static Instance Variable

private static Employee_2 emp;

This variable stores the single object created by the class.

Initially:

emp
 ↓
null

After the first call:

emp
 ↓
Employee_2 Object

3. Static Access Method

public static Employee_2 getEmployee_2Instance()

This method provides access to the Singleton object.

The important logic is:

if (emp == null) {
    emp = new Employee_2();
}

return emp;

The first call creates the object.

Every later call returns the same object.

🔄 Object Creation Flow

First call

Employee_2 emp1 = getEmployee();

Flow:

getEmployee()
      ↓
getEmployee_2Instance()
      ↓
emp == null
      ↓
new Employee_2()
      ↓
Object 1 created
      ↓
return Object 1

So:

emp1 → Object 1

Second call

Employee_2 emp2 = getEmployee();

Now:

emp != null

Therefore Java does not execute:

new Employee_2();

It returns the existing object.

emp1 ──→ Object 1
emp2 ──→ Object 1

Third call

Employee_2 emp3 = getEmployee();

Again, the existing object is returned:

emp1 ──→ Object 1
emp2 ──→ Object 1
emp3 ──→ Object 1

🧪 Verifying Singleton

The following comparison:

System.out.println(emp1 == emp2);

checks whether both references point to the same object.

Expected output:

true
true
true

This means:

emp1 == emp2 → true
emp2 == emp3 → true
emp1 == emp3 → true

All references point to the same Employee_2 instance.

The hashCode() values should also normally be the same for these
references.

👨‍💼 Why Employee Is Not Normally a Singleton

A normal Employee class represents individual employees.

For example:

Employee ID    Name
--------------------
101            Siva
102            Ravi
103            Kumar

We need separate objects:

emp1 → Employee 101
emp2 → Employee 102
emp3 → Employee 103

Therefore a normal Employee entity should generally not be
Singleton.

The Singleton example is being used to learn the pattern itself.

🆚 Normal Object vs Singleton Object

Normal Object Creation

Employee emp1 = new Employee();
Employee emp2 = new Employee();
Employee emp3 = new Employee();

Result:

emp1 → Object 1
emp2 → Object 2
emp3 → Object 3

There are three different objects.

Singleton Object

Employee_2 emp1 = Employee_2.getEmployee_2Instance();
Employee_2 emp2 = Employee_2.getEmployee_2Instance();
Employee_2 emp3 = Employee_2.getEmployee_2Instance();

Result:

emp1 ──┐
emp2 ──┼──→ ONE Object
emp3 ──┘

⚠️ Important Concept: ID vs Object

An employee ID identifies data.

For example:

101 → Siva
102 → Ravi
103 → Kumar

Different IDs do not mean Singleton.

Singleton controls the number of instances of a class.

ID
 ↓
Identifies data

Object
 ↓
Represents data/behavior

Singleton
 ↓
Controls number of object instances

🌱 Connection to Spring Boot

This Java Singleton concept is important before learning Spring Boot.

In Spring, beans are Singleton scoped by default.

For example:

@Service
public class EmployeeService {

}

Spring manages the bean instance through the Spring container.

Conceptually:

Spring Container
       |
       ↓
EmployeeService Bean
       |
       ├── Controller
       ├── Other Services
       └── Components

However, Spring Singleton is not exactly the same as manually
implementing the Singleton Design Pattern.

Spring manages the lifecycle and scope of the bean through its
container.

📚 Key Interview Questions

1. What is Singleton Design Pattern?

A design pattern that ensures a class has only one instance and provides
a global access point to that instance.

2. Why is the constructor private?

To prevent other classes from directly creating objects using new.

3. Why is the instance variable static?

Because the instance must belong to the class rather than to an
individual object.

4. Why is the access method static?

Because we need to access the Singleton instance without first creating
an object.

5. What happens during the first call?

The instance is null, so the object is created.

6. What happens during subsequent calls?

The existing object is returned instead of creating a new object.

7. How can you verify that two references refer to the same object?

Use:

emp1 == emp2

If it prints true, both references refer to the same object.

🚀 Next Learning Step

After understanding this basic Singleton implementation, the recommended
Java learning sequence is:

Singleton
   ↓
Eager Singleton
   ↓
Lazy Singleton
   ↓
Thread-Safe Singleton
   ↓
Spring IoC
   ↓
Dependency Injection
   ↓
Spring Bean
   ↓
Bean Scope
   ↓
Spring Boot

📝 Summary

The main Singleton code is:

private static Employee_2 emp;

private Employee_2() {
}

public static Employee_2 getEmployee_2Instance() {

    if (emp == null) {
        emp = new Employee_2();
    }

    return emp;
}

Remember the three rules:

1. private constructor
2. static instance variable
3. static access method

These three concepts form the foundation of this basic Singleton
implementation.
