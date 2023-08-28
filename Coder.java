
public class Coder {
	public String caesar(String original, int rightShift) {
		original = original.toUpperCase();
		String ret = "";
		for (int count = 0; count < original.length(); count++) {
			int o = original.charAt(count)-'A';
			o+=rightShift;
			o%=26;
			char c = (char)('A'+o);
			ret.concat(Character.toString(c));
		}
		return ret;
	}
	public String viginere(String original, String code) {
		original = original.toUpperCase();
		code = code.toUpperCase();
		String ret = "";
		int l = code.length();
		for (int count = 0; count < original.length(); count++) {
			int o = original.charAt(count)-'A';
			o+=(code.charAt(count%l)-'A');
			o%=26;
			char c = (char)('A'+o);
			ret.concat(Character.toString(c));
		}
		return ret;
	}
}
