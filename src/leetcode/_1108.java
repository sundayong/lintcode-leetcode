package leetcode;

public class _1108 {

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(new _1108().defangIPaddr(address));
    }
}
