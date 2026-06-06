# 📚 Library Management System

A console-based Java application for managing a local community library — books, members, and borrowing transactions — built with Object-Oriented Programming principles.

---

## 📖 About The Project

This system helps library staff digitize and streamline daily operations: registering books and members, processing borrow/return transactions, tracking overdue fines, and generating reports — all through a simple menu-driven console interface.

---

## ✨ Features

### 📦 Book Management
- Add, update, remove books (ID, title, author, genre, publication year, quantity)
- View all books in a formatted list
- Search by title, author, or genre

### 👤 Member Management
- Add, update, remove members (ID, name, phone, email)
- View all members
- Search by name or ID
- Supports **Regular** and **Premium** member types (different borrowing limits & fine rates)

### 🔄 Borrowing & Returning
- Borrow a book (records member ID, book ID, borrow date)
- Return a book (records return date, auto-calculates overdue fine)
- View all currently borrowed books
- View borrowing history by member

### 📊 Reports
- List of all currently borrowed books
- List of overdue books with days overdue
- Most popular books (by borrow count)
- Members with the most borrowings

---

## ⚙️ Business Rules

| Rule | Description |
|------|-------------|
| BR1 | Book ID and Member ID are unique and cannot be changed |
| BR2 | Title, author, and genre cannot be empty |
| BR3 | Member must exist before borrowing |
| BR4 | Book must be in stock (quantity > 0) to be borrowed |
| BR5 | Members can borrow at most **3 books** at a time |
| BR6 | Borrow date ≤ today; return date > borrow date |
| BR7 | Overdue fine: **5,000 VND/day** past due date |
| BR8 | Stock decreases on borrow, increases on return |
| BR9 | All inputs are validated before processing |

---

## 🏗️ OOP Design

- **Encapsulation** — `Book`, `Member`, `BorrowingTransaction` classes with private fields
- **Inheritance** — `RegularMember` and `PremiumMember` extend `Member`
- **Polymorphism** — `calculateFine()` overridden in each member subclass
- **Collections** — `List` / `Map` for storing books, members, and transactions
- **Exception Handling** — custom exceptions for invalid input, book/member not found

---

## 🖥️ Console UI Preview

```
======================================
     LIBRARY MANAGEMENT SYSTEM
======================================
1. Manage Books
2. Manage Members
3. Borrowing/Returning
4. Reports
5. Exit
--------------------------------------
Choose an option: _
```

---

## 🚀 Getting Started

### Requirements
- Java JDK 11+
- Any IDE (NetBeans, IntelliJ IDEA, Eclipse) or terminal

