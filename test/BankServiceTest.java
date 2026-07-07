import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {


    @Test
    public void testCreateAccount() {

        BankService bankService = new BankService();

        bankService.createAccount(
                "Sarah",
                AccountType.SAVINGS
        );


        BankAccount account =
                bankService.findAccount(1001);


        assertNotNull(account);

        assertEquals(
                "Sarah",
                account.getOwnerName()
        );

        assertEquals(
                AccountType.SAVINGS,
                account.getAccountType()
        );
    }



    @Test
    public void testDeposit() {

        BankAccount account =
                new BankAccount(
                        1001,
                        "John",
                        AccountType.CURRENT
                );


        account.deposit(5000);


        assertEquals(
                5000,
                account.getBalance()
        );
    }

    @Test
public void testWithdrawMoney() {

    BankAccount account = new BankAccount(
            1001,
            "Sarah",
            AccountType.SAVINGS
    );

    account.deposit(1000);

    boolean result = account.withdraw(300);

    assertTrue(result);
    assertEquals(700, account.getBalance());
}


@Test
public void testWithdrawInsufficientBalance() {

    BankAccount account = new BankAccount(
            1002,
            "John",
            AccountType.CURRENT
    );

    account.deposit(500);

    boolean result = account.withdraw(1000);

    assertFalse(result);
    assertEquals(500, account.getBalance());
}
}