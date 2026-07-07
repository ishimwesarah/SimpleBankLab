# Sprint 1 Review - SimpleBank


## Sprint Goal

Enable customers to create bank accounts and deposit money.


## Completed User Stories

### US1: Create Account

Status: Completed

Implemented features:

- Customer can create a new bank account.
- System automatically generates an account number.
- User can select account type:
  - Savings
  - Current
- New accounts start with a zero balance.


### US2: Deposit Money

Status: Completed

Implemented features:

- Customer can deposit money into an existing account.
- System validates account existence.
- System validates deposit amount.
- Account balance updates successfully.


## Technical Deliverables

The following components were completed:

- BankAccount class
- AccountType enum
- BankService class
- Console user interface
- JUnit tests
- GitHub Actions CI workflow


## Testing Evidence

Implemented unit tests:

- Account creation test
- Deposit functionality test

Result:

All tests passed successfully.


## CI/CD Evidence

A GitHub Actions workflow was created.

The pipeline automatically:

1. Checks out the repository.
2. Sets up Java.
3. Compiles the application.

Pipeline Status:

Successful ✅


## Sprint Outcome

The sprint goal was achieved.

Customers can now create accounts and deposit money through the console application.