import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import learn_java.com.ghou.EncryptUtils;

public class learn_md5 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        sb.append("userID=").append("8af8286d1a4f464eac3f453867bd891a.huawei1577935997677").append("&")
                .append("productID=").append("2").append("&")
                .append("productName=").append("300元宝").append("&")
                .append("productDesc=").append("300元宝").append("&")
                .append("money=").append("100").append("&")
                .append("roleID=").append("s1.100000").append("&")
                .append("roleName=").append("黄靖柔").append("&")
                .append("roleLevel=").append("1").append("&")
                .append("serverID=").append("1").append("&")
                .append("serverName=").append("").append("&")
                .append("extension=").append("");
		sb.append("&notifyUrl=http://by.wuyongqitest.cn:8000/agg_payment1a73024b916e47f7865d6be195e4d6a0");
//		System.out.print(sb.toString());
		String encoded = URLEncoder.encode(sb.toString(), "UTF-8");
		System.out.println(encoded);
		String sign = EncryptUtils.md5(encoded).toLowerCase();
		System.out.println(sign);
	}
		
}
