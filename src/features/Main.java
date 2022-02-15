package features;

/**
 * this program is an example of a simple blockchain implementation in java
 * @author Tatarski
 * @since 2022
 */
public class Main {

    public static void main(String[] args) {

        //test
        String tst="this is the first transaction";
        String hashed = CryptHsh.sha256(tst);
        System.out.println(tst+" \n "+hashed);

    }
}
