# Smart Parking System 🚗

## 📌 Project Overview
The **Smart Parking System** is a console-based Java application that enables users to **pre-book parking slots**, while administrators can **manage parking availability** in different malls. The system ensures efficient utilization of parking slots by allowing vehicle check-in and check-out.

## ✨ Features
- **User Slot Booking**: Users can pre-book parking slots in a mall.
- **Admin Login & Management**: Admins can log in, add malls, and define parking slots.
- **Dynamic Slot Allocation**: The system checks for available slots and assigns them automatically.
- **Vehicle Tracking**: Stores details of parked vehicles.
- **Slot Checkout**: Frees up parking space when a vehicle exits.

## 🏗 How It Works

### 1️⃣ Main Menu (`Main.java`)
- Displays options: **Slot Booking, Admin Login, and Exit**.
- Takes user input and redirects accordingly.

### 2️⃣ Slot Booking (`SlotBooking.java`)
- Users enter the **mall name**.
- If parking slots are available, the system assigns one and records **vehicle details**.
- If full, it notifies the user.

### 3️⃣ Admin Management (`AdminLogIn.java`)
- Admins **log in** or **register**.
- Can **add malls** and define the number of parking slots.
- Uses `AdminLogs.txt` to store credentials.

### 4️⃣ Mall Parking Data (`Mall.java`)
- Stores parking slot availability for multiple malls.
- Returns **available slots** for a given mall.

### 5️⃣ Vehicle Information (`Vehicles.java`)
- Stores **vehicle number, owner name, and allocated slot**.

## 🛠 Tech Stack
- **Language**: Java (OOP Concepts)
- **Data Storage**: File I/O (`AdminLogs.txt` for admin credentials)
- **Collections Used**: `HashMap`, `Scanner`

## 🚀 Installation & Execution
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/SmartParkingSystem.git
   cd SmartParkingSystem
   ```
2. Compile the Java files:
   ```sh
   javac SmartParkingSystem/*.java
   ```
3. Run the program:
   ```sh
   java SmartParkingSystem.Main
   ```

## 📌 Sample Output
```
=========================================================
		Welcome to JJ Parking Slot Bookings!
parking slot pre booking : press 1
Login as Admin : Press 2
Exit the app! : Press 3
> 1

Enter the Mall name: ABC Mall
Booking Successful in ABC Mall, Slot 1
```

## 📌 Future Enhancements
- 🏢 **GUI Integration** (Swing or JavaFX for better user experience)
- 📊 **Database Storage** (Replace file-based storage with MySQL/SQLite)
- 📲 **Mobile App Version** (Using Flutter/React Native)

## 🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss.

## 📜 License
This project is licensed under the MIT License.

---
📧 **Contact**: JAYARAJ V | jayaraj.veluchamy@gmail.com | [GitHub](https://github.com/jayaraj-v)

