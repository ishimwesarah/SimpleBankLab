# SimpleBank Product Backlog


## Product Vision

SimpleBank is a simple console-based banking application that allows customers to manage basic banking operations such as creating accounts, depositing money, withdrawing funds, and viewing account information.

The goal is to demonstrate Agile development practices and DevOps principles through incremental delivery, automated testing, and continuous integration.


---

# Product Backlog

| ID | User Story | Priority | Estimate |
|---|---|---|---|
| US1 | As a customer, I want to create a bank account so that I can start using banking services. | High | 5 points |
| US2 | As a customer, I want to deposit money into my account so that my balance increases. | High | 3 points |
| US3 | As a customer, I want to withdraw money from my account so that I can access my funds. | High | 5 points |
| US4 | As a customer, I want to view my account details so that I can check my information and balance. | Medium | 3 points |
| US5 | As a user, I want better input validation so that the application handles incorrect input safely. | Medium | 3 points |


---

# Acceptance Criteria

## US1: Create Account

- User can create a new account.
- System generates an account number automatically.
- User selects account type.
- New account starts with zero balance.


## US2: Deposit Money

- User can enter an account number.
- User can enter deposit amount.
- Balance increases correctly.
- Invalid amounts are rejected.


## US3: Withdraw Money

- User can withdraw money from an existing account.
- Withdrawal is successful when sufficient balance exists.
- Withdrawal fails when balance is insufficient.


## US4: View Account Details

- User can search for an account.
- Account information is displayed.
- Error message appears for unknown accounts.


## US5: Input Validation

- Invalid menu input does not crash the application.
- Error messages are displayed for invalid values.


---

# Definition of Done (DoD)

A user story is considered complete when:

- Code is implemented.
- Feature works correctly.
- Code is tested.
- Changes are committed to Git.
- Changes are pushed to GitHub.
- CI pipeline passes successfully.
- Acceptance criteria are satisfied.