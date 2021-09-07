package theory.struture.hashtable;

public class HashTable {
    public Slot[] hashTable;

    public HashTable(Integer size) {
        this.hashTable = new Slot[size];
    }
    // chaning 기법
    public class Slot {
        String key;
        String value;
        Slot next;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        HashTable hash = new HashTable(20);
        hash.saveData("DaveLee", "01022223333");
        hash.saveData("funCoding", "01033333333");
        hash.saveData("David", "01033334444");
        hash.saveData("Dave", "01044444444");
        System.out.println(hash.getData("DaveLee"));
        System.out.println(hash.getData("funCoding"));
        System.out.println(hash.getData("David"));
        System.out.println(hash.getData("Dave"));
    }
}
