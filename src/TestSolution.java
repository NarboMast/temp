import account.Account;
import account.RegularAccount;
import client.Client;
import org.junit.Test;

public class TestSolution {
    @Test
    public void test(){
        Account withdrawable = new RegularAccount();
        Client client = new Client(withdrawable);

    }
}
