/**
 * Created by caidapao on 2019/7/26
 * Time 21:31
 * address https://today.caidapao.com
 */
public class ChasenSolution {


    public static void main(String[] args) {
        new ChasenSolution().defangIPaddr("1.1.1.1");
    }


    private String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        //最后的数组长度为什么是+6?  .替换成 [.],长度增加2，三个. 长度增加3*2
        char[] defangedIP = new char[chars.length + 6];
        for (int i = 0, m = 0; i < defangedIP.length; i++, m++) {
            if (chars[m] != '.') {
                defangedIP[i] = chars[m];
            } else {
                defangedIP[i] = '[';
                defangedIP[i + 1] = '.';
                defangedIP[i + 2] = ']';
                i = i + 2;
            }
        }
        return new String(defangedIP);
    }
}
