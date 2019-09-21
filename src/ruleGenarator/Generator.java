package ruleGenarator;

public class Generator {
	
	public String ruleGenerator(int sudLength) {
		StringBuilder result = new StringBuilder();
		String[] alph = {"0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int m=0; m<Math.sqrt(sudLength); m++) {
			for(int x=0; x<Math.sqrt(sudLength); x++) {
				for(int i=1; i<sudLength+1; i++) {
					for(int k=(int) (m*Math.sqrt(sudLength)+1); k<(m+1)*Math.sqrt(sudLength)+1; k++) {			
						for(int j= (int) (x*Math.sqrt(sudLength)+1); j<(x+1)*Math.sqrt(sudLength)+1; j++) {		
							result.append(k+""+j+alph[i]+"; ");
						}
					}
					result.deleteCharAt(result.length()-1);
					result.deleteCharAt(result.length()-1);
					result.append("\n");
				}
			}
		}	
		return result.toString();
	}
	
	public static void main(String[] args) {
		Generator test = new Generator();
		System.out.print(test.ruleGenerator(9));
	}
}
