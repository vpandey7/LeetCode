class Solution {
    public String reverseVowels(String s) {
        
    s.toLowerCase();
	Set<Character> vowels = new HashSet<>();
	vowels.add('a');
	vowels.add('e');
	vowels.add('i');
	vowels.add('o');
	vowels.add('u');
    vowels.add('A');
	vowels.add('E');
	vowels.add('I');
	vowels.add('O');
	vowels.add('U');
	char[] characters = s.toCharArray();
	int left = 0;
	int right = s.length()-1;
	while(left<right) {
		while(left<right && !vowels.contains(characters[left])) {
			left++;
		}
		while(left<right && !vowels.contains(characters[right])) {
			right--;
		}
		char temp = characters[left];
		characters[left] = characters[right];
		characters[right]= temp;
		left++;
		right--;	
	}
	return new String(characters); 
    }
}