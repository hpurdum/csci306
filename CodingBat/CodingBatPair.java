
// Authors: Henry Purdum and Cameron Fitzgerald

// Logic 2 - evenlySpaced exercise
public boolean evenlySpaced(int a, int b, int c) {
		
	int temp = Math.min(a,b);
	int min = Math.min(temp, c);
		
	int temp2 = Math.max(a, b);
	int max = Math.max(temp2, c);
		
	int mid = 0;
		
	if(min == a && max == b) {
		mid = c;
	}
	if(min == b && max == a) {
		mid = c;
	}
	if(min == b && max == c) {
		mid = a; 
	}
	if(min == c && max == b) {
		mid = a;
	}
	if(min == c && max == a) {
		mid = b;
	}
	if(min == a && max == c) {
		mid = b;
	}
	
	int diff1 = max - mid;
	int diff2 = mid - min;
			
	if(diff1 == diff2) {
		return true;
	}
	else {
		return false;
	}
}

/*
Expected	Run		
evenlySpaced(2, 4, 6) → true	true	OK	
evenlySpaced(4, 6, 2) → true	true	OK	
evenlySpaced(4, 6, 3) → false	false	OK	
evenlySpaced(6, 2, 4) → true	true	OK	
evenlySpaced(6, 2, 8) → false	false	OK	
evenlySpaced(2, 2, 2) → true	true	OK	
evenlySpaced(2, 2, 3) → false	false	OK	
evenlySpaced(9, 10, 11) → true	true	OK	
evenlySpaced(10, 9, 11) → true	true	OK	
evenlySpaced(10, 9, 9) → false	false	OK	
evenlySpaced(2, 4, 4) → false	false	OK	
evenlySpaced(2, 2, 4) → false	false	OK	
evenlySpaced(3, 6, 12) → false	false	OK	
evenlySpaced(12, 3, 6) → false	false	OK	
other tests
		OK
*/

// String 2 - plusOut exercise
public String plusOut(String str, String word) {
	String answer = new String("");
	for(int i = 0; i < str.length(); i++) {
		if(str.charAt(i) == word.charAt(0)) {
			String tempString = str.substring(i, i+word.length());
			if(tempString.equals(word)) {
				answer += word;
				i += word.length()-1;
			}
			else {
				answer += "+";
			}
		}
		else {
			answer += "+";
		}
	}
	return answer;
}

/*
Expected	Run		
plusOut("12xy34", "xy") → "++xy++"	"++xy++"	OK	
plusOut("12xy34", "1") → "1+++++"	"1+++++"	OK	
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"	"++xy++xy+++xy"	OK	
plusOut("abXYabcXYZ", "ab") → "ab++ab++++"	"ab++ab++++"	OK	
plusOut("abXYabcXYZ", "abc") → "++++abc+++"	"++++abc+++"	OK	
plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"	"++XY+++XY+"	OK	
plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"	"+++++++XYZ"	OK	
plusOut("--++ab", "++") → "++++++"	"++++++"	OK	
plusOut("aaxxxxbb", "xx") → "++xxxx++"	"++xxxx++"	OK	
plusOut("123123", "3") → "++3++3"	"++3++3"	OK	
other tests
		OK
*/

// Array 3 - countClumps exercise
public int countClumps(int[] nums) {
	int clumps = 0;
	int flag = 0;

	for(int i =0; i<nums.length-1;i++) {
		if(nums[i]==nums[i+1] && flag == 0) {
			flag = 1;
			clumps++;
		}
		else if(nums[i] != nums[i+1]) {
			flag = 0;
		}
	}
	return clumps;
}

/*
Expected	Run		
countClumps([1, 2, 2, 3, 4, 4]) → 2	2	OK	
countClumps([1, 1, 2, 1, 1]) → 2	2	OK	
countClumps([1, 1, 1, 1, 1]) → 1	1	OK	
countClumps([1, 2, 3]) → 0	0	OK	
countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
countClumps([]) → 0	0	OK	
other tests
		OK
*/

// Array 3 - fix34 exercise
public int[] fix34(int[] nums) {
	int indexAfterThree = 0;
	int indexOfFour = 0;
	int valueAfterThree = 0;
	for(int i = 0; i < nums.length; i++) {	
		if(nums[i] == 3) {
			for(int j = indexOfFour+1; j < nums.length; j++) {
				if(nums[j] == 4) {
					indexOfFour = j;
					break;
				}
			}
			valueAfterThree = nums[i+1];
			indexAfterThree = i+1;
			nums[indexAfterThree] = nums[indexOfFour];
			nums[indexOfFour] = valueAfterThree;
		}
	}
	return nums;
}

/*
Expected	Run		
fix34([1, 3, 1, 4]) → [1, 3, 4, 1]	[1, 3, 4, 1]	OK	
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]	[1, 3, 4, 1, 1, 3, 4]	OK	
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]	[3, 4, 2, 2]	OK	
fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2]	[3, 4, 3, 4, 2, 2]	OK	
fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2]	[2, 3, 4, 3, 4, 2, 2]	OK	
fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	[5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	OK	
fix34([3, 1, 4]) → [3, 4, 1]	[3, 4, 1]	OK	
fix34([3, 4, 1]) → [3, 4, 1]	[3, 4, 1]	OK	
fix34([1, 1, 1]) → [1, 1, 1]	[1, 1, 1]	OK	
fix34([1]) → [1]	[1]	OK	
fix34([]) → []	[]	OK	
fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7]	[7, 3, 4, 7, 7]	OK	
fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
other tests
		OK	
*/
