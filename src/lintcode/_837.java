package lintcode;

public class _837 {

    //判断字符串是否是回文串
    public static boolean check(char[] chars, int begin, int end) {
        int mid;
        int length = end + begin;
        if (length % 2 == 0) {
            mid = length / 2;
        } else {
            mid = length / 2 + 1;
        }
        for (int i = mid; i < end; i++) {
            if (chars[i] != chars[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int countPalindromicSubstrings(String str) {
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return 1;
        }
        int sum = 0;
        char[] chars = str.toCharArray();
        //循环遍历所有子串
        for (int begin = 0; begin < length; begin++) {
            for (int end = begin + 1; end <= length; end++) {
                //判断str[begin,end]是否为回文串
                if (check(chars, begin, end)) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "onoopplplonooomoplnooppnnlmolnmlmmnplopmmmmmmpnnpomponlppmlllnnoomnmlnlplnomnnpllonmllnnoonopmppmmpnmnomolplmmolnoolnllpnpmoppmpnopmmnmmnomppnopmpnpllmpoollpmmolllmmlmpmpmnnnmnllpponnlmlplpnlnnnnppppmmnpmnnnllopnllnoolnnmonnonopmmlponplmlpnnonmpmmlplonllpnomnmnomopmoollpmonnlommnlnolnnomppolmmmpolmlpmppnonmmoonnonplnnmlponpponlmlmnnpnlpmonmlmpopnlpmppllolnonmpompooolmppmlmlololmplmlomonmmponmnnpolmlolmoplpnlmonooomomnpnmnnlnpllnnlpoopmnlloppomnolppommmoopomopopnpmllnlmmpnlnmnpnlopmnppmnnopllppnnmpnnnmpnolmolllmpppplllnllopplpnpnplonmpollooomnoommmpnlopmpoonnmnmnlmmmmopmplmnplnmonmllpplomlopomnlnolnlmllpolllpnpmmmlnnlnolmmnlnmopponomlnpnoomnoponpmmpnomnpmoolnpplmlnoonpononnplmmnnnopmlopomnopplmmpmllmommmplopnpolnopomoooppnmmmmpopnllplonmmmlnlompopnnmomplnnmlnmpnmlmploopoomopmlomonolpmopoopolppplnonpplnonoplolonmlpnmmpllpolmolnnnppmopmnpolompolmnllpnmolopnopmopmnoomomomnopmpmponllmnnnnoonlpnnpolmpolpmlpplmmoonnplpplnmnnnlppmpppoonplmpmmolnonnollppplmlnnnpmnpoonpnploomopmnmlpplmnlpmppnmno";
//        str = "dfdffdsafas";
        System.out.println(countPalindromicSubstrings(str));
    }
}
