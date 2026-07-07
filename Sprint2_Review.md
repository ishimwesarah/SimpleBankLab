# Sprint 2 Review - SimpleBank


## Sprint Goal

Enhance the SimpleBank application by adding additional banking operations, improving user experience through validation, and strengthening application reliability.


---

# Completed User Stories


## US3: Withdraw Money

Status: Completed ✅


### Delivered Features

- Customers can withdraw money from an existing account.
- The system checks account availability.
- The system prevents withdrawals greater than the available balance.
- Successful withdrawals update the account balance.


### Evidence

Implemented:

- BankAccount.withdraw()
- BankService.withdrawMoney()
- Console withdrawal menu option


---

## US4: View Account Details

Status: Completed ✅


### Delivered Features

- Customers can search for their account.
- The system displays:
  - Account number
  - Owner name
  - Account type
  - Current balance

- Invalid account numbers return an error message.


### Evidence

Implemented:

- BankService.viewAccount()
- Account lookup functionality


---

## US5: Improve Input Validation

Status: Completed ✅


### Delivered Features

- Invalid menu input is handled safely.
- Application prevents crashes caused by incorrect input.
- Error messages provide feedback to users.


### Evidence

Implemented:

- InputMismatchException handling
- Improved error messages


---

# Testing Evidence

Additional unit tests were added for Sprint 2 features.

Test cases include:

- Successful withdrawal.
- Withdrawal with insufficient balance.

All tests passed successfully.


---

# DevOps Improvements

The project continued using:

- Git version control.
- GitHub Actions CI pipeline.
- Automated compilation checks.


The CI pipeline successfully validated changes after pushing updates.


---

# Sprint Outcome

The Sprint 2 goal was achieved.

The SimpleBank application now supports:

- Creating accounts.
- Depositing money.
- Withdrawing money.
- Viewing account details.
- Handling invalid user input safely.