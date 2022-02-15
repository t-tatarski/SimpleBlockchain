package features;

import java.util.Date;
import java.util.Random;

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
        this.nonce = generateNonce();

    }

    private int generateNonce() {
        // bitcoin use 4 bytes value
        int result;
        Random random = new Random();
        result = random.nextInt(65535);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Block block = (Block) o;

        if (timeStamp != block.timeStamp) return false;
        if (nonce != block.nonce) return false;
        if (data != null ? !data.equals(block.data) : block.data != null) return false;
        if (hash != null ? !hash.equals(block.hash) : block.hash != null) return false;
        return previousHash != null ? previousHash.equals(block.previousHash) : block.previousHash == null;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (hash != null ? hash.hashCode() : 0);
        result = 31 * result + (previousHash != null ? previousHash.hashCode() : 0);
        result = 31 * result + (int) (timeStamp ^ (timeStamp >>> 32));
        result = 31 * result + nonce;
        return result;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public int getNonce() {
        return nonce;
    }

    public String hashCalculate(String str) {
        String rslt = CryptHsh.sha256(str);
        return rslt;
    }
}
