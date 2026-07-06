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

}