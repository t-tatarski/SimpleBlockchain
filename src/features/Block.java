package features;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class Block {
    private int index;
    private List<String> transactions;
    private String hash;
    private String previousHash;
    private long timeStamp;
    private int nonce;

    public Block (int index, List<String> transactions){
        this.index= index;
        this.transactions=transactions;
    }
    public Block (int index, List<String> transactions, String hash, String previousHash){
        this.transactions = transactions;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.nonce = generateNonce();

    }
    private int generateNonce() {
        // bitcoin use 4 bytes value
        int result;
        Random random = new Random();
        result = random.nextInt(65535);
        return result;
    }
    public String hashCalculate(String str) {
        String rslt = CryptHsh.sha256(str);
        return rslt;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Block{" +
                "index=" + index +
                ", transactions=" + transactions +
                ", hash='" + hash + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", timeStamp=" + timeStamp +
                ", nonce=" + nonce +
                '}';
    }
}
