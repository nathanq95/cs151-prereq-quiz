public class Strings{
	public static String uniqueLetters(String s){
		int v = 0;
		String result = "";
		String found[] = new String[s.length()];

		for(int i=0; i<s.length()-1; i++){
			if(s.indexOf(s.substring(i, i+1))==s.lastIndexOf(s.substring(i, i+1))){
				found[v] = s.substring(i, i+1);
				v++;
			}
		}
		for(int l=0; l<found.length; l++){
		 	if(found[l] != null){
		 		result += found[l];
			}
		 }
		return result;
	}
}