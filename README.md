# Atm-withdrawl-project-CORE-JAVA-
- A core java project

### **Overview-**

This is a simple ATM Withdrawal project implemented in Java. It allows users to perform basic banking transactions such as checking their account balance, withdrawing money, and depositing money. The system requires a valid PIN for authentication.

### **Project Structure-**

      java_project/
      │── src/
      │   ├── ATMmachine.java
      │   ├── ATM.java
      │── README.md


**Features-**

 - PIN-based authentication

 - Check account balance

 - Withdraw money with balance validation

 - Deposit money with a limit check

 - Menu-driven interface for user interaction

**Technologies Used**

  Java

  Scanner class for user input

**How to Run the Project-**

      1.download the source files.
      2.Open the project in any Java-supported IDE ( IntelliJ IDEA, Eclipse, VS Code etc.)
      3.Compile and run ATMmachine.java
      4.Enter your PIN (default: 1234) to access the menu.
      5.Choose the desired banking operation.

      
### **Usage Guide-**

**1. Enter PIN:** Users must enter the correct PIN (1234) to proceed.

**2. Menu Options:**

Press 1 to check balance.

Press 2 to withdraw money.

Press 3 to deposit money.

Press 4 to exit.

**3. Balance Check:** Displays the current balance.

**4. Withdraw Money:**

Enter the withdrawal amount.

Ensures sufficient balance before allowing withdrawal.

**5. Deposit Money:**

Enter the deposit amount.

If the deposit exceeds Rs.50,000, a PAN card is required.

**6. Exit:** The program terminates.

Notes

If an incorrect PIN is entered, access is denied.

Withdrawals cannot exceed the available balance.

Deposits above Rs.50,000 require branch verification.
