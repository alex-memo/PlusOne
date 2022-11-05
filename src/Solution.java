
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a=(plusOne(new int[] {8,9,9,9}));
int i=0;
while(i<a.length) {
	System.out.print(a[i]);
	i++;
}
	}
    public static int[] plusOne(int[] digits) {
    	try {
    		if(digits[digits.length-1]==9) {
    			int i=digits.length;
    			while(i>0) {

    				if(digits[i-1]==9) {
    					digits[i-1]=0;
    					if(i-1==0) {
    						int[]ret=new int[digits.length+1];
    						ret[0]+=1;
    						return ret;
    					}
    				}
    				else {
    					digits[i-1]++;
    					break;
    				}
    				i--;
    			}
    		}
    		else {
    			digits[digits.length-1]+=1;
    		}
    		
    		return digits;
    	}
    	catch(Exception e) {
    		return digits;
    	}
    }
}
