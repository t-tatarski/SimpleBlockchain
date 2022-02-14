package features;

import java.util.Date;

public class Block {
    private String data;
    private String hash;
    private String previousHash;
    private long timeStamp;
    private int nonce;

    public Block (String data, String hash, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = hashCalculate();

    }

    private String hashCalculate() {
        return "EF7797E13D3A75526946A3BCF00DAEC9FC9C9C4D51DDC7CC5DF888F74DD434D1";
    }
}
