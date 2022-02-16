package features;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * this program is an example of a simple blockchain implementation in java
 * @author Tatarski
 * @since 2022
 */
public class Main {

    public static void main(String[] args) {

        List<String> transactions1 = new ArrayList<>();
        transactions1.add("100 BTC transfer from Satoshi Nakamoto");
        transactions1.add("1 BTC transfer from Satoshi Nakamoto");
        transactions1.add("10 BTC transfer from Satoshi Nakamoto");

        //Genesis
        Block block0 = new Block(1,transactions1);
        if (block0.getIndex()==1) block0.setPreviousHash("000");
        block0.setHash(block0.hashCalculate(block0.toString()));
        System.out.println(block0.toString());
        System.out.println(block0.getHash().toUpperCase(Locale.ROOT));




    }
}
